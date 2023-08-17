package br.com.gestorcultural.gestorcultural.repository;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service

public interface UserRepository extends MongoRepository<User, String> {
    User findByLogin(String login);
}
