package br.com.gestorcultural.gestorcultural.controller.user;

import br.com.gestorcultural.gestorcultural.exception.badrequest.BadRequestException;
import br.com.gestorcultural.gestorcultural.exception.notfound.NotFoundException;
import br.com.gestorcultural.gestorcultural.model.dto.user.UserDTO;
import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import br.com.gestorcultural.gestorcultural.service.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
        return this.userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") String id) throws NotFoundException {
        return this.userService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody @Valid UserDTO userDto) throws UnsupportedEncodingException, NoSuchAlgorithmException, BadRequestException {
        return this.userService.save(userDto.toEntity());
    }

    @PutMapping("/{id}")
    public User findByIdAndUpdate(@PathVariable String id, @RequestBody @Valid UserDTO userDTO) throws BadRequestException {
        return this.userService.findByIdAndUpdate(id, userDTO.toEntity());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity findByIdAndRemove(@PathVariable("id") String id, @RequestBody @Valid UserDTO userDTO) throws BadRequestException {
        this.userService.findByIdAndRemove(id, userDTO.toEntity());
        return ResponseEntity.noContent().build();
    }
}
