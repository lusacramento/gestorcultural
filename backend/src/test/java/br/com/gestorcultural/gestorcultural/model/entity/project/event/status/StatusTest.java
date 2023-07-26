package br.com.gestorcultural.gestorcultural.model.entity.project.event.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusTest {

    private Status status;
    @BeforeEach
    void setUp() {
        this.status = this.createStatus();
    }

    private Status createStatus() {
        return Status.PROGRESS;
    }

    @Test
    void getDescription() {
        assertEquals("Em andamento", status.getDescription());
    }
}