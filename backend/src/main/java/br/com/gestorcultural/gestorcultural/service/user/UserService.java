package br.com.gestorcultural.gestorcultural.service.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> findAll();
    Optional<User> findById(String id);
    boolean existsByEmail(String Email, User user);
    User save(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
