package br.com.gestorcultural.gestorcultural.model.entity.project.publicity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicityTest {

    private Publicity publicity;

    @BeforeEach
    void setUp() {
        this.publicity = this.createPublicity();
    }

    private Publicity createPublicity() {
        Publicity publicity1 = new Publicity();
        publicity1.setId("4592");
        publicity1.setDescription("Cartaz A3");
        publicity1.setAction("Afixar cartazes em locais de amplo acesso.");
        publicity1.setQuantity(20);
        publicity1.setUnitPay(5);

        return publicity1;
    }

    @Test
    void getId() {
        assertEquals("4592", publicity.getId());
    }

    @Test
    void getDescription() {
        assertEquals("Cartaz A3", publicity.getDescription());
    }

    @Test
    void getAction() {
        assertEquals("Afixar cartazes em locais de amplo acesso.", publicity.getAction());
    }

    @Test
    void getQuantity() {
        assertEquals(20, publicity.getQuantity());
    }

    @Test
    void getUnitPay() {
        assertEquals(5, publicity.getUnitPay());
    }

    @Test
    void getTotalPay() {
        assertEquals(100, publicity.getTotalPay());
    }

    @Test
    void setDescription() {
        publicity.setDescription("Folder tam A6 4 cores");
        assertEquals("Folder tam A6 4 cores", publicity.getDescription());
    }

    @Test
    void setAction() {
        publicity.setAction("Distribuir em locais estratégicos.");
        assertEquals("Distribuir em locais estratégicos.", publicity.getAction());
    }

    @Test
    void setQuantity() {
        publicity.setQuantity(1000);
        assertEquals(1000, publicity.getQuantity());
    }

    @Test
    void setUnitPay() {
        publicity.setUnitPay(0.1);
        assertEquals(0.1, publicity.getUnitPay());
    }

    @Test
    void setTotalPay() {
        assertEquals(100, publicity.getTotalPay());
        publicity.setQuantity(1000);
        assertEquals(5000, publicity.getTotalPay());
        publicity.setUnitPay(0.2);
        assertEquals(200, publicity.getTotalPay());


    }
}