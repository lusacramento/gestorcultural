package br.com.gestorcultural.gestorcultural.model.entity.project.team;

import br.com.gestorcultural.gestorcultural.model.entity.project.team.ethnicity.Ethnicity;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.gender.Gender;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.typeOfContract.TypeOfContract;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Person {
    @Id
    String id;
    boolean isProponent;
    String name;
    String cpf;
    int age;
    Gender gender;
    Ethnicity ethnicity;
    TypeOfContract TypeOfContract;
    String office;
    String qualification;
    String assignments;
}