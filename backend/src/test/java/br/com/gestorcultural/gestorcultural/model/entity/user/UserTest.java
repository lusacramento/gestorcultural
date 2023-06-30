package br.com.gestorcultural.gestorcultural.model.entity.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Autowired
    User user;
    @BeforeEach
    void setUp() {
        user = this.createUser();
    }

    User createUser(){
        User user1 = new User();
        user1.setId("001");
        user1.setName("Jordan Peele");
        user1.setEmail("peele@actor.com");
        user1.setPassword("123");
        user1.setHash("456");
        user1.setIsAdmin(false);
        user1.setIsAgree(false);
        user1.setIsValid(false);
        return user1;
    }
    @Test
    void getId() {
        assertEquals("001", this.user.getId());
    }

    @Test
    void setId() {
        this.user.setId("002");
        assertEquals("002", this.user.getId());

    }

    @Test
    void getName() {
        assertEquals("Jordan Peele", this.user.getName());
    }

    @Test
    void setName() {
        this.user.setName("Samuel Jackson");
        assertEquals("Samuel Jackson", this.user.getName());

    }

    @Test
    void getEmail() {
        assertEquals("peele@actor.com", this.user.getEmail());
    }

    @Test
    void setEmail() {
        this.user.setEmail("jackson@samuel.com");
        assertEquals("jackson@samuel.com", this.user.getEmail());

    }

    @Test
    void getPassword() {
        assertEquals("123", this.user.getPassword());
    }

    @Test
    void setPassword() {
        this.user.setPassword("9987");
        assertEquals("9987", this.user.getPassword());

    }

    @Test
    void getHash() {
        assertEquals("456", this.user.getHash());
    }

    @Test
    void setHash() {
        this.user.setHash("4567");
        assertEquals("4567", this.user.getHash());

    }

    @Test
    void getIsAdmin() {
        assertEquals(false, this.user.getIsAdmin());
    }

    @Test
    void setIsAdmin() {
        this.user.setIsAdmin(true);
        assertEquals(true, this.user.getIsAdmin());
    }

    @Test
    void getIsAgree() {
        assertEquals(false, this.user.getIsAdmin());
    }

    @Test
    void setIsAgree() {
        this.user.setIsAgree(true);
        assertEquals(false, this.user.getIsAdmin());
    }

    @Test
    void getIsValid() {
        assertEquals(false, this.user.getIsAdmin());
    }

    @Test
    void setIsValid() {
        this.user.setIsValid(true);
        assertEquals(false, this.user.getIsAdmin());
    }
}