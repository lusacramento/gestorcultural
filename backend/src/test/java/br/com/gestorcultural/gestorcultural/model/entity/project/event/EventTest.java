package br.com.gestorcultural.gestorcultural.model.entity.project.event;

import br.com.gestorcultural.gestorcultural.model.entity.project.event.stage.Stage;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.status.Status;
import br.com.gestorcultural.gestorcultural.service.utils.date.DateOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class EventTest {

    private Event event;
    @BeforeEach
    void setUp() throws ParseException {
        this.event = this.createEvent();
    }

    public Event createEvent() throws ParseException {
        Event event1 = new Event();
        event1.setId("4923");
        event1.setDescription("Aquisição de materiais");
        event1.setStage(Stage.PRE);
        event1.setInicialDate("30/06/2023");
        event1.setFinalDate("04/07/2023");
        event1.setStatus(Status.NOT_STARTED);
        return event1;
    }

    @Test
    void getId() {
        assertEquals("4923", event.getId());
    }

    @Test
    void getDescription() {
        assertEquals("Aquisição de materiais", event.getDescription());
    }

    @Test
    void getStage() {
        assertEquals(Stage.PRE, event.getStage());
    }

    @Test
    void getInicialDate() {
        assertEquals("30/06/2023", event.getInicialDate());
    }

    @Test
    void getFinalDate() {
        assertEquals("04/07/2023", event.getFinalDate());
    }

    @Test
    void getStatus() {
        assertEquals(Status.NOT_STARTED, event.getStatus());
    }

    @Test
    void setDescription() {
        event.setDescription("Contratação de pessoal");
        assertEquals("Contratação de pessoal", event.getDescription());
    }

    @Test
    void setStage() {
        event.setStage(Stage.PRODUCTION);
        assertEquals(Stage.PRODUCTION, event.getStage());
    }

    @Test
    void setInicialDate() throws ParseException {
        event.setInicialDate("03/03/2023");
        assertEquals("03/03/2023", event.getInicialDate());
    }

    @Test
    void setFinalDate() throws ParseException {
        event.setFinalDate("04/04/2024");
        assertEquals("04/04/2024", event.getFinalDate());
    }

    @Test
    void setStatus() {
        event.setStatus(Status.PROGRESS);
        assertEquals(Status.PROGRESS, event.getStatus());
    }
}