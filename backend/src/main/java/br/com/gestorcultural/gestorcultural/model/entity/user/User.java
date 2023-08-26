package br.com.gestorcultural.gestorcultural.model.entity.user;

import br.com.gestorcultural.gestorcultural.model.entity.user.role.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "user")
@NoArgsConstructor
public class User implements UserDetails {
    @Id
    private String id;

    @Email
    private String login;

    @NotBlank
    @Size(min = 8)
    private String password;

    private UserRole role;
    private Date createdIn;
    private Date updateIn;

    public User(String login, String password) {
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


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN)
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        else return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
