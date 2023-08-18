package br.com.gestorcultural.gestorcultural.model.entity.project.team.gender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderTest {

    private Gender gender;
    @BeforeEach
    void setUp() {
        this.gender = this.createGender();
    }

    private Gender createGender() {
        return Gender.NAO_INFORMADO;
    }

    @Test
    void getDescription() {
        assertEquals("Prefiro não dizer", this.gender.getDescription());
    }
}