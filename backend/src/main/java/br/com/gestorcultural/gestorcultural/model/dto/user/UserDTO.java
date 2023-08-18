package br.com.gestorcultural.gestorcultural.model.dto.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    @NotBlank(message = "O email não pode estar em branco!")
    @Email(message = "Informe um email válido!")
    private String login;

    @NotBlank(message = "A senha não pode estar em branco!")
    @Size(min = 8, message = "O tamanho da senha deve conter pelo  menos 8 caracteres!")
    private String password;

     public User toEntity(){
        return new User(login, password);
    }
}
