package br.com.gestorcultural.gestorcultural.model.entity.project.event.stage;

public enum Stage {
    PRE("Pré-Produção"),
    DIVULGATION("Divulgação"),
    PRODUCTION("Produção"),
    POST("Pós-Produção");

    private String description;

    Stage(String description){
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
