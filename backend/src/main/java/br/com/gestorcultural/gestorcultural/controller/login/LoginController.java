package br.com.gestorcultural.gestorcultural.controller.login;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api/login")
public class Login {
    @PostMapping
    public String login(@RequestBody String login) {
        return login;
    }
}
