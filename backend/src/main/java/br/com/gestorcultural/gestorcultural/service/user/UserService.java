package br.com.gestorcultural.gestorcultural.service.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public interface UserService {
    List<User> findAll();
    boolean existsByEmail(String Email, User user);
}
