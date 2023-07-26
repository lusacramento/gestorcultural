package br.com.gestorcultural.gestorcultural.model.entity.project.accessibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccessibilityTest {

    private Accessibility accessibility;
    @BeforeEach
    void setUp() {
        this.accessibility = this.createAccessibility();
    }

    public Accessibility createAccessibility() {
        Accessibility accessibility1 = new Accessibility();
        accessibility1.setId("9876");
        accessibility1.setAccessibility("Intérprete de Libras");
        return accessibility1;
    }

    @Test
    void getAccessibility() {
        assertEquals("Intérprete de Libras", this.accessibility.getAccessibility());
    }

    @Test
    void setAccessibility() {
        this.accessibility.setAccessibility("Audiolegenda");
        assertEquals("Audiolegenda", this.accessibility.getAccessibility());
    }
}