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
    User findByLogin(String Login);
    User save(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException;
    User findByIdAndUpdate(User user);
    void findByIdAndRemove(String id);

}
