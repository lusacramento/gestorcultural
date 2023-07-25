package br.com.gestorcultural.gestorcultural.model.entity.project.team.gender;

public enum Gender {
    HOMEM_CIS("Homem Cisgênero"),
    MULHER_CIS("Mulher Cisgênero"),
    HOMEM_TRANS("Homem Transgênero"),
    MULHER_TRANS("Mulher Transgênero"),
    NAO_BINARIO("Não Binário"),
    NAO_INFORMADO("Prefiro não dizer");

    private String description;

    Gender(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }


}
