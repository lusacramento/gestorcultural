package br.com.gestorcultural.gestorcultural.repository;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User queryFirstByEmail(String email, User user);
}
