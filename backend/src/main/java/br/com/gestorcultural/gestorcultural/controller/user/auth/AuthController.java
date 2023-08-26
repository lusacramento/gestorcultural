package br.com.gestorcultural.gestorcultural.controller.user.auth;

import br.com.gestorcultural.gestorcultural.exception.badrequest.BadRequestException;
import br.com.gestorcultural.gestorcultural.exception.notfound.NotFoundException;
import br.com.gestorcultural.gestorcultural.infra.security.TokenService;
import br.com.gestorcultural.gestorcultural.model.dto.token.TokenDTO;
import br.com.gestorcultural.gestorcultural.model.dto.user.UserDTO;
import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import br.com.gestorcultural.gestorcultural.service.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @PostMapping("/entrar")
    public ResponseEntity<TokenDTO> login(@RequestBody UserDTO user) throws NotFoundException {
        var userNamePassword = new UsernamePasswordAuthenticationToken(user.getLogin(), user.getPassword());
        var auth = authenticationManager.authenticate(userNamePassword);
        String token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new TokenDTO(token));
    }

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public User register(@RequestBody @Valid UserDTO user) throws UnsupportedEncodingException, BadRequestException, NoSuchAlgorithmException {
        return this.userService.save(user.toEntity());

    }

}
