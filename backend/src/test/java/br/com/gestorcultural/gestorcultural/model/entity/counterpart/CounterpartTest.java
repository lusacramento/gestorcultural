package br.com.gestorcultural.gestorcultural.model.entity.counterpart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterpartTest {

    private Counterpart counterpart;
    @BeforeEach
    void setUp() {
        this.counterpart = this.createCounterpart();
    }

    public Counterpart createCounterpart() {
        Counterpart counterpart1 = new Counterpart();
        counterpart1.setId("4587");
        counterpart1.setCounterpart("Ministrar 1 oficina.");
        return counterpart1;
    }

    @Test
    void getId() {
        assertEquals("4587", this.counterpart.getId());
    }

    @Test
    void getCounterpart() {
        assertEquals("Ministrar 1 oficina.", this.counterpart.getCounterpart());
    }

    @Test
    void setCounterpart() {
        this.counterpart.setCounterpart("Ministrar um minicurso.");
        assertEquals("Ministrar um minicurso.", this.counterpart.getCounterpart());
    }
}