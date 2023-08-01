package br.com.gestorcultural.gestorcultural.model.entity.project.cost;

import br.com.gestorcultural.gestorcultural.model.entity.project.event.stage.Stage;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.status.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.*;


class CostTest {

    @Autowired
    private Cost cost;

    @BeforeEach
    void setUp() {
        this.cost = this.createCost();
    }

    private Cost createCost() {
        Cost cost1 = new Cost();
        cost1.setId("2223");
        cost1.setStage(Stage.PRE);
        cost1.setName("Figurino");
        cost1.setDescription("Camisa Xadrez");
        cost1.setUnit("unidade");
        cost1.setQuantity(10);
        cost1.setUnitPay(20);
        cost1.setStatus(Status.NOT_STARTED);
        return cost1;
    }

    @Test
    void getId() {
        assertEquals("2223", this.cost.getId());
    }

    @Test
    void getStage() {
        assertEquals(Stage.PRE, this.cost.getStage());
    }

    @Test
    void getName() {
            assertEquals("Figurino", this.cost.getName());
    }

    @Test
    void getDescription() {
        assertEquals("Camisa Xadrez", this.cost.getDescription());
    }

    @Test
    void getUnit() {
        assertEquals("unidade", this.cost.getUnit());
    }

    @Test
    void getQuantity() {
        assertEquals(10, this.cost.getQuantity());
    }

    @Test
    void getUnitPay() {
        assertEquals(20, this.cost.getUnitPay());
    }

    @Test
    void getTotalPay() {
        assertEquals(200, this.cost.getTotalPay());
    }

    @Test
    void getStatus() {
        assertEquals(Status.NOT_STARTED, this.cost.getStatus());
    }

    @Test
    void setStage() {
        this.cost.setStage(Stage.PRODUCTION);
        assertEquals(Stage.PRODUCTION, this.cost.getStage());
    }

    @Test
    void setName() {
        this.cost.setName("Aluguel");
        assertEquals("Aluguel", this.cost.getName());
    }

    @Test
    void setDescription() {
        this.cost.setDescription("Aluguel do teatro");
        assertEquals("Aluguel do teatro", this.cost.getDescription());
    }

    @Test
    void setUnit() {
        this.cost.setUnit("Diária");
        assertEquals("Diária", this.cost.getUnit());
    }

    @Test
    void setStatus() {
        this.cost.setStatus(Status.PROGRESS);
        assertEquals(Status.PROGRESS, this.cost.getStatus());
    }

    @Test
    void setQuantity() {
        this.cost.setQuantity(5);
        assertEquals(5, this.cost.getQuantity());
        assertEquals(100, this.cost.getTotalPay());
    }

    @Test
    void setUnitPay() {
        this.cost.setUnitPay(300);
        assertEquals(300, this.cost.getUnitPay());
        assertEquals(3000, this.cost.getTotalPay());
    }

}