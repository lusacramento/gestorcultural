package br.com.gestorcultural.gestorcultural.model.entity.project.team.ethnicity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EthnicityTest {

    private Ethnicity ethnicity;
    @BeforeEach
    void setUp() {
        this.ethnicity = this.createEthnicity();
    }

    private Ethnicity createEthnicity() {
        return Ethnicity.PRETA;
    }

    @Test
    void getDescription() {
        assertEquals("Preto/Negro", this.ethnicity.getDescription());
    }
}