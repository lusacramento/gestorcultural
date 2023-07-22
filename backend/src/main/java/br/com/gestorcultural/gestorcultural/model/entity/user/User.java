package br.com.gestorcultural.gestorcultural.model.entity.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String hash;
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
}
