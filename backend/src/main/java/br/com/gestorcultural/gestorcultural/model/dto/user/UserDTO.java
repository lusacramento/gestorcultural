package br.com.gestorcultural.gestorcultural.model.dto.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class UserDTO {
     public User toEntity(){
        return new User(login, password);
    }
}
