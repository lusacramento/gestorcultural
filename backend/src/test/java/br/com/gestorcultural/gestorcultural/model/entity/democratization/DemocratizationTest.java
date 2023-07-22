package br.com.gestorcultural.gestorcultural.model.entity.democratization;

import br.com.gestorcultural.gestorcultural.model.entity.project.democratization.Democratization;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemocratizationTest {

    private Democratization democratization;

    @BeforeEach
    void setUp() {
        this.democratization = this.createDemocratization();
    }

    public Democratization createDemocratization() {
        Democratization democratization1 = new Democratization();
        democratization1.setId("6667");
        democratization1.setDemocratization("Atividade em zona remota.");
        return democratization1;
    }

    @Test
    void getId() {
        assertEquals("6667", this.democratization.getId());
    }

    @Test
    void getDemocratization() {
        assertEquals("Atividade em zona remota.", this.democratization.getDemocratization());
    }

    @Test
    void setDemocratization() {
        this.democratization.setDemocratization("Entrada gratuita.");
        assertEquals("Entrada gratuita.", this.democratization.getDemocratization());
    }
}