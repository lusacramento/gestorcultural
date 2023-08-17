package br.com.gestorcultural.gestorcultural.model.entity.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {
    @Autowired
    User user;

    @BeforeEach
    void setUp() {
        user = this.createUser();
    }

    public User createUser() {
        User user1 = new User();
        user1.setId("001");
        user1.setPassword("123");
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
    void getPassword() {
        assertEquals("123", this.user.getPassword());
    }

    @Test
    void setPassword() {
        this.user.setPassword("9987");
        assertEquals("9987", this.user.getPassword());
    }

    @Test
    void setUpdatedIn() throws InterruptedException {
        User userBefore = user;
        new Thread();
        Thread.sleep(1000);
        user.setUpdatedIn();
        assertNotEquals(userBefore.getCreatedIn(), this.user.getUpdateIn());
    }
}