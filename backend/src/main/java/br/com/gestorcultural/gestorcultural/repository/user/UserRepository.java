package br.com.gestorcultural.gestorcultural.repository.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service

public interface UserRepository extends MongoRepository<User, String> {
    UserDetails findByLogin(String login);
    boolean existsByLogin(String login);
}
