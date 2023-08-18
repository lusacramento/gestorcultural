package br.com.gestorcultural.gestorcultural.model.entity.project.event.stage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StageTest {

    private Stage stage;

    @BeforeEach
    void setUp() {
        this.stage = this.createStage();
    }

    private Stage createStage() {
        return Stage.PRODUCTION;
    }

    @Test
    void getDescription() {
        assertEquals("Produção", stage.getDescription());
    }
}