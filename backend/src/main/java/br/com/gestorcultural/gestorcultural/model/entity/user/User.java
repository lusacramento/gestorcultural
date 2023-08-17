package br.com.gestorcultural.gestorcultural.model.entity.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "user")
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String login;
    private String password;
    private Date createdIn;
    private Date updateIn;

    public void setCreatedIn() {
        this.createdIn = new Date();
    }

    public void setUpdatedIn() {
        this.updateIn = new Date();
    }
}
