package br.com.gestorcultural.gestorcultural.model.entity.project.team.typeOfContract;

public enum TypeOfContract {
    PJ("Pessoa Jurídica"),
    MEI("Micro Empreendedor Individual"),
    PF("Pessoa Física");
    private String description;

    TypeOfContract(String description){
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
