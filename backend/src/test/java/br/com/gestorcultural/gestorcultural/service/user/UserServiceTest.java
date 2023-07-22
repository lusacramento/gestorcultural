package br.com.gestorcultural.gestorcultural.service.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import br.com.gestorcultural.gestorcultural.model.entity.user.UserTest;
import br.com.gestorcultural.gestorcultural.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataMongoTest
@ExtendWith(SpringExtension.class)
public class UserServiceTest {

   @Autowired
   private MongoTemplate mongoTemplate;
   @Autowired
   private UserRepository userRepository;

   private User user;

   private UserTest userTest;

    @BeforeEach
    void setUp() {
        userTest = new UserTest();
        user = userTest.createUser();
    }

    @Order(1)
    @Test
    void testDb() {
        Assertions.assertThat(mongoTemplate.getDb()).isNotNull();
    }

    @Order(2)
    @Test
    void save(){
        this.userRepository.save(this.user);
        Optional<User> result = this.userRepository.findById(user.getId());
        this.executeAssertEquals(result.get());
    }

    @Order(3)
    @Test
    void findAll(){
        this.userRepository.save(this.user);
        List<User> users = this.userRepository.findAll();
        System.out.println(users);
        assertEquals(users.size(), 1);
    }

@Order(4)
    @Test
    void findById(){
        Optional<User> result = this.userRepository.findById(user.getId());
        assertEquals(this.user.getId(), result.get().getId());
    }

    @Order(4)
    @Test
    void existsByEmail() {
        User result = this.userRepository.queryFirstByEmail(this.user.getEmail(), this.user);
        System.out.println(result.getEmail());
        assertNotNull(result);
    }

    @Order(5)
    @Test
    void findByIdAndUpdate(){
        this.user.setName("Morgan Freeman");
        this.user.setEmail("freeman@morgan.coom");
        User result = this.userRepository.save(user);
        executeAssertEquals(result);
    }

    @Order(6)
    @Test
    void findByIdAndDelete(){
        assertEquals(this.userRepository.findAll().size(), 1);

        this.userRepository.deleteById(this.user.getId());
        assertEquals(this.userRepository.findAll().size(), 0);
    }

    void executeAssertEquals(User result){
        assertEquals(result.getId(), this.user.getId());
        assertEquals(result.getName(), this.user.getName());
        assertEquals(result.getEmail(), this.user.getEmail());
        assertEquals(result.getPassword(), this.user.getPassword());
        assertEquals(result.getHash(), this.user.getHash());
        assertEquals(result.getIsAdmin(), this.user.getIsAdmin());
        assertEquals(result.getIsAgree(), this.user.getIsAgree());
        assertEquals(result.getIsValid(), this.user.getIsValid());
    }
}