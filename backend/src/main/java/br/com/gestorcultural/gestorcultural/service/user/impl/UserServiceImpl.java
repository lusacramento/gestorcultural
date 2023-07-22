package br.com.gestorcultural.gestorcultural.service.user.impl;

import br.com.gestorcultural.gestorcultural.exception.NotFoundException;
import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import br.com.gestorcultural.gestorcultural.repository.UserRepository;
import br.com.gestorcultural.gestorcultural.service.user.UserService;
import br.com.gestorcultural.gestorcultural.service.utils.Hash;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
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
    public Optional<User> findById(String id) {
        return this.userRepository.findById(id);
    }

    @Override
    public boolean existsByEmail(String email, User user) {
        User response = this.userRepository.queryFirstByEmail(email, user);
        return response != null;
    }

    @Override
    @Transactional
    public User save(@NotNull User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        user.setPassword(Hash.generateHash(user.getPassword()));
        user.setHash(Hash.generateHash(new ObjectId().toString()));
        user.setCreatedIn();
        user.setUpdatedIn();
        if(existsByEmail(user.getEmail(), user)){
            throw new NotFoundException("Já existe usuário cadastrado com este email!");
        }
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public User findByIdAndUpdate(User user) {
        if(!this.userRepository.existsById(user.getId()))
            throw new NotFoundException("Usuário não encontrado!");
        user.setCreatedIn(this.userRepository.findById(user.getId()).get().getCreatedIn());
        user.setUpdatedIn();
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void findByIdAndRemove(String id) {
        if(!this.userRepository.existsById(id))
            throw new NotFoundException("Usuário não encontrado!");
        this.userRepository.deleteById(id);
    }
}
