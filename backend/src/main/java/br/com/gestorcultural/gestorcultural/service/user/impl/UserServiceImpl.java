package br.com.gestorcultural.gestorcultural.service.user.impl;

import br.com.gestorcultural.gestorcultural.exception.badrequest.BadRequestException;
import br.com.gestorcultural.gestorcultural.exception.notfound.NotFoundException;
import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import br.com.gestorcultural.gestorcultural.repository.UserRepository;
import br.com.gestorcultural.gestorcultural.service.user.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional<User> findByLogin(String login) throws NotFoundException {
        Optional<User> user = this.userRepository.findByLogin(login);
        if (user.isEmpty()) throw new NotFoundException("Usuário não encontrado!");
        return user;
    }

    @Override
    @Transactional
    public User save(@NotNull User user) throws UnsupportedEncodingException, NoSuchAlgorithmException, BadRequestException {
        if (this.userRepository.existsByLogin(user.getLogin()))
            throw new BadRequestException("Email já está cadastrado!");

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

        user.setCreatedIn(this.userRepository.findById(user.getId()).get().getCreatedIn());
        user.setUpdatedIn();
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void findByIdAndRemove(String id, User user) throws BadRequestException {
        if (!this.userRepository.existsById(id)) throw new BadRequestException("Usuário não encontrado!");

        Optional<User> userResponse = this.userRepository.findById(id);
        if (
                !Objects.equals(userResponse.get().getLogin(), user.getLogin()) ||
                        !Objects.equals(userResponse.get().getPassword(), user.getPassword())
        ) throw new BadRequestException("Email ou senha inválida!");

        this.userRepository.deleteById(id);
    }
}
