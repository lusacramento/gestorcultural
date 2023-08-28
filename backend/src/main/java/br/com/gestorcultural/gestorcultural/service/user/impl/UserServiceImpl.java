package br.com.gestorcultural.gestorcultural.service.user.impl;

import br.com.gestorcultural.gestorcultural.exception.badrequest.BadRequestException;
import br.com.gestorcultural.gestorcultural.exception.notfound.NotFoundException;
import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import br.com.gestorcultural.gestorcultural.repository.user.UserRepository;
import br.com.gestorcultural.gestorcultural.service.user.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> findById(String id) throws NotFoundException {
        Optional<User> user = this.userRepository.findById(id);
        if (user.isEmpty()) throw new NotFoundException("Usuário não encontrado!");
        return user;
    }

    @Override
    public UserDetails findByLogin(String login) throws NotFoundException {
        return this.userRepository.findByLogin(login);
    }

    @Override
    @Transactional
    public User save(@NotNull User user) throws UnsupportedEncodingException, NoSuchAlgorithmException, BadRequestException {
        if (this.userRepository.existsByLogin(user.getLogin()))
            throw new BadRequestException("Email já está cadastrado!");

        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        user.setCreatedIn();
        user.setUpdatedIn();

        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public User findByIdAndUpdate(String id, User user) throws BadRequestException {
        user.setId(id);

        if (!this.userRepository.existsById(user.getId()))
            throw new BadRequestException("Este email não está cadastrado!");

        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        user.setCreatedIn(this.userRepository.findById(user.getId()).get().getCreatedIn());
        user.setUpdatedIn();
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void findByIdAndRemove(String id, User user) throws BadRequestException {
        if (!this.userRepository.existsById(id)) throw new BadRequestException("Usuário não encontrado!");

        Optional<User> userResponse = this.userRepository.findById(id);
        System.out.println("Login entrada: " + user.getLogin());
        System.out.println("Login persistido: " + userResponse.get().getLogin());
        System.out.println("Password entrada: " + user.getPassword());
        System.out.println("Password persistente: " + userResponse.get().getPassword());

        if (!Objects.equals(userResponse.get().getLogin(), user.getLogin()))
            throw new BadRequestException("Email ou senha inválida!");

        boolean isPasswordOK = new BCryptPasswordEncoder().matches(user.getPassword(), userResponse.get().getPassword());
        if (!isPasswordOK) throw new BadRequestException("Email ou senha inválida!");

        this.userRepository.deleteById(id);
    }
}
