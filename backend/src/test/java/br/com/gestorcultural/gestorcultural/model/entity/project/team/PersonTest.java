package br.com.gestorcultural.gestorcultural.model.entity.project.team;

import br.com.gestorcultural.gestorcultural.model.entity.project.team.ethnicity.Ethnicity;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.gender.Gender;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.typeOfContract.TypeOfContract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        this.person = this.createPerson();
    }

    public Person createPerson() {
        Person person1 = new Person();
        person1.setId("9182");
        person1.setProponent(false);
        person1.setName("Fulano das Couves");
        person1.setCpf("00100100100");
        person1.setAge(34);
        person1.setGender(Gender.HOMEM_TRANS);
        person1.setEthnicity(Ethnicity.AMARELA);
        person1.setTypeOfContract(TypeOfContract.PJ);
        person1.setOffice("Cenógrafo");
        person1.setQualification("Curso técnico em Cenografia");
        person1.setAssignments("Desenvolver cenários");
        person1.setUnit("Horas");
        person1.setQuantity(36);
        person1.setUnitPay(100);
        return person1;
    }

    @Test
    void getId() {
        assertEquals("9182", this.person.getId());
    }

    @Test
    void isProponent() {
        assertEquals(false, this.person.isProponent);
    }

    @Test
    void getName() {
        assertEquals("Fulano das Couves", this.person.getName());
    }

    @Test
    void getCpf() {
        assertEquals("00100100100", this.person.getCpf());
    }

    @Test
    void getAge() {
        assertEquals(34, this.person.getAge());
    }

    @Test
    void getGender() {
        assertEquals(Gender.HOMEM_TRANS, this.person.getGender());
    }

    @Test
    void getEthnicity() {
        assertEquals(Ethnicity.AMARELA, this.person.ethnicity);
    }

    @Test
    void getTypeOfContract() {
        assertEquals(TypeOfContract.PJ, this.person.getTypeOfContract());
    }

    @Test
    void getOffice() {
        assertEquals("Cenógrafo", this.person.getOffice());
    }

    @Test
    void getQualification() {
        assertEquals("Curso técnico em Cenografia", this.person.getQualification());
    }

    @Test
    void getAssignments() {
        assertEquals("Desenvolver cenários", this.person.getAssignments());
    }

    @Test
    void getUnit() {
        assertEquals("Horas", this.person.getUnit());
    }

    @Test
    void getQuantity() {
        assertEquals(36, this.person.getQuantity());
    }

    @Test
    void getUnitPay() {
        assertEquals(100, this.person.getUnitPay());
    }

    @Test
    void getTotalPay() {
        assertEquals(3600, this.person.getTotalPay());
    }

    @Test
    void setProponent() {
        this.person.setProponent(true);
        assertEquals(true, this.person.isProponent());
    }

    @Test
    void setName() {
        this.person.setName("Ze das Abóboras");
        assertEquals("Ze das Abóboras", this.person.getName());
    }

    @Test
    void setCpf() {
        this.person.setCpf("22233344456");
        assertEquals("22233344456", this.person.getCpf());
    }

    @Test
    void setAge() {
        this.person.setAge(56);
        assertEquals(56, this.person.getAge());
    }

    @Test
    void setGender() {
        this.person.setGender(Gender.NAO_BINARIO);
        assertEquals(Gender.NAO_BINARIO, this.person.getGender());
    }

    @Test
    void setEthnicity() {
        this.person.setEthnicity(Ethnicity.BRANCA);
        assertEquals(Ethnicity.BRANCA, this.person.getEthnicity());
    }

    @Test
    void setTypeOfContract() {
        this.person.setTypeOfContract(TypeOfContract.PF);
        assertEquals(TypeOfContract.PF, this.person.getTypeOfContract());
    }

    @Test
    void setOffice() {
        this.person.setOffice("Bailarino");
        assertEquals("Bailarino", this.person.getOffice());
    }

    @Test
    void setQualification() {
        this.person.setQualification("Cursando superior em dança");
        assertEquals("Cursando superior em dança", this.person.getQualification());
    }

    @Test
    void setAssignments() {
        this.person.setAssignments("Atuar no primeiro ato");
        assertEquals("Atuar no primeiro ato", this.person.getAssignments());
    }

    @Test
    void setUnit() {
        this.person.setUnit("Cachê");
        assertEquals("Cachê", this.person.getUnit());
    }

    @Test
    void setQuantity() {
        this.person.setQuantity(5);
        assertEquals(5, this.person.getQuantity());
    }

    @Test
    void setUnitPay() {

        this.person.setUnitPay(1000);
        assertEquals(1000, this.person.unitPay);
        assertEquals(36000, this.person.getTotalPay());
    }
}