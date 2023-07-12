package br.com.gestorcultural.gestorcultural.service.user.impl;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import br.com.gestorcultural.gestorcultural.repository.UserRepository;
import br.com.gestorcultural.gestorcultural.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
