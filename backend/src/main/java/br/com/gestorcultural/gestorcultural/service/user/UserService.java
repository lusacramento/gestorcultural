package br.com.gestorcultural.gestorcultural.service.user;

import br.com.gestorcultural.gestorcultural.exception.badrequest.BadRequestException;
import br.com.gestorcultural.gestorcultural.exception.notfound.NotFoundException;
import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> findAll();
    Optional<User> findById(String id) throws NotFoundException;
    UserDetails findByLogin(String Login) throws NotFoundException;
    User save(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException, BadRequestException;
    User findByIdAndUpdate(String id, User user) throws BadRequestException;
    void findByIdAndRemove(String id, User user) throws BadRequestException;

}
