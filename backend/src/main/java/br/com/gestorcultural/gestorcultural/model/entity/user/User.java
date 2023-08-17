package br.com.gestorcultural.gestorcultural.model.entity.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.role.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Data
@Document(collection = "user")
@NoArgsConstructor
public class User {
    @Id
    private String id;

    @Email(message = "Informe um email válido!")
    private String login;

    @NotBlank(message = "A senha não pode estar em branco!")
    @Size(min = 8, message = "O tamanho da senha deve conter pelo  menos 8 caracteres!")
    private String password;

    private UserRole role;
    private Date createdIn;
    private Date updateIn;

    public User(String login, String password){
        this.login = login;
        this.password = password;
        role = UserRole.USER;
    }

    public void setCreatedIn() {
        this.createdIn = new Date();
    }
    public void setUpdatedIn() {
        this.updateIn = new Date();
    }
}
