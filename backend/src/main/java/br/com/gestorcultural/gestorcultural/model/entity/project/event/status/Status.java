package br.com.gestorcultural.gestorcultural.model.entity.project.event.status;

public enum Status {
    NOT_STARTED("Não iniciado"),
    PROGRESS("Em andamento"),
    FINISHED("Finalizado");

    private String description;

        Status(String description) {
            this.description = description;
        }

    public String getDescription() {
        return this.description;
    }
}
