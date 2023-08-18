package br.com.gestorcultural.gestorcultural.model.entity.project.team.ethnicity;

public enum Ethnicity {
    PRETA("Preto/Negro"),
    PARDA("Parda"),
    AMARELA("Amarela"),
    INDIGENA("Indígena"),
    BRANCA("Branca"),
    OUTRA("Outra"),
    NAO_INFORMADA("Prefiro não dizer");

    private final String description;

    Ethnicity(String description){
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
