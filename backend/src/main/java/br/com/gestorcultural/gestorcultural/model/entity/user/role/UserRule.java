package br.com.gestorcultural.gestorcultural.model.entity.user.role;

public enum UserRule {
    ADMIN("Administrador"),
    USER("Usuário");

    private final String description;

    UserRule(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
