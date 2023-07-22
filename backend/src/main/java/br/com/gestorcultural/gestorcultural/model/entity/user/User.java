package br.com.gestorcultural.gestorcultural.model.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String hash;
    private boolean isAdmin;
    private boolean isAgree;
    private boolean isValid;
    private Date  createdIn;
    private Date updateIn;

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean getIsAgree() {
        return isAgree;
    }

    public void setIsAgree(boolean agree) {
        isAgree = agree;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean valid) {
        isValid = valid;
    }

    public void setCreatedIn() {
            this.createdIn = new Date();
    }

    public void setUpdatedIn() {
        this.updateIn = new Date();
    }
}
