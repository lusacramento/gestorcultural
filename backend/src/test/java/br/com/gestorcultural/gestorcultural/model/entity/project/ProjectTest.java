package br.com.gestorcultural.gestorcultural.model.entity.project;

import br.com.gestorcultural.gestorcultural.model.entity.project.counterpart.counterpart.Counterpart;
import br.com.gestorcultural.gestorcultural.model.entity.project.accessibility.Accessibility;
import br.com.gestorcultural.gestorcultural.model.entity.project.democratization.Democratization;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.Event;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.EventTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.stage.Stage;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.status.Status;
import br.com.gestorcultural.gestorcultural.model.entity.project.goal.Goal;
import br.com.gestorcultural.gestorcultural.model.entity.project.product.Product;
import br.com.gestorcultural.gestorcultural.model.entity.project.product.ProductTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.publicity.Publicity;
import br.com.gestorcultural.gestorcultural.model.entity.project.publicity.PublicityTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.Person;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.PersonTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.ethnicity.Ethnicity;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.gender.Gender;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.typeOfContract.TypeOfContract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProjectTest {

    Project project;

    @BeforeEach
    void setUp() throws ParseException {
        this.project = this.createProject();
    }

    private Project createProject() throws ParseException {
        Project project1 = new Project();
        project1.setId("8475");
        project1.setName("Espetáculo Jaé");
        project1.setOwner("0987");
        project1.setAbstractOfProject("Apresentação de palhaçaria");
        project1.setCategory("Artes cênicas");
        project1.setPresentation("Uma apresentação ilária");
        project1.setJustification("Pra poder rir");
        project1.addCollaborator("4059");
        project1.addGoal(new Goal("3045", "Apresentar 3 vezes"));
        project1.addAccessibility(new Accessibility("3245", "Libras"));
        project1.addDemocratization(new Democratization("4765", "Evento em área periférica"));
        project1.addCounterpart(new Counterpart("3295", "Fazer um workshop"));

        project1.addPerson(
                new Person(
                        "0956",
                        true,
                        "Fulano de tal",
                        "343.112.345-67",
                        24,
                        Gender.NAO_BINARIO,
                        Ethnicity.BRANCA,
                        TypeOfContract.PF,
                        "Diretor de Arte",
                        "Superior em Artes",
                        "Dirigir ensaios e apresentações"
                )
        );

        project1.addProduct(
                new Product(
                        "4593",
                        "Apresentações",
                        "Apresentação com duração de 1 hora",
                        5,
                        "NA"
                )
        );

        Publicity publicity1 = new Publicity();
        publicity1.setId("3357");
        publicity1.setDescription("Cartaz A3");
        publicity1.setAction("Colar em locais estratégicos");
        publicity1.setQuantity(50);
        publicity1.setUnitPay(5);
        project1.addPublicity(publicity1);

        Event event1 = new Event();
                event1.setId("8364");
                event1.setDescription("Contratar artistas");
                event1.setStage(Stage.PRE);
                event1.setInicialDate("01/01/2024");
                event1.setFinalDate("31/01/2024");
                event1.setStatus(Status.NOT_STARTED);
        project1.addEvent(event1);
        return project1;
    }

    @Test
    void addAndRemoveCollaborator() {
        this.project.addCollaborator("8675");
        assertEquals(2, this.project.getCollaborators().size());
        this.project.removeCollaborator("8675");
        assertEquals(1, this.project.getCollaborators().size());
    }

    @Test
    void addAndRemoveGoal() {
        Goal goal = new Goal("7845", "Apresentar 1 hora");
        this.project.addGoal(goal);
        assertEquals(2, this.project.getGoals().size());
        this.project.removeGoal(goal);
        assertEquals(1, this.project.getGoals().size());
    }

    @Test
    void addAndRemoveAccessibility() {
        Accessibility accessibility = new Accessibility("4353", "piso tátil");
        this.project.addAccessibility(accessibility);
        assertEquals(2, this.project.getAccessibilities().size());
        this.project.removeAccessibility(accessibility);
        assertEquals(1, this.project.getAccessibilities().size());
    }

    @Test
    void addAndRemoveDemocratization() {
        Democratization democratization = new Democratization("0687", "Entrada gratuita");
        this.project.addDemocratization(democratization);
        assertEquals(2, this.project.getDemocratizations().size());
        this.project.removeDemocratization(democratization);
        assertEquals(1, this.project.getDemocratizations().size());
    }

    @Test
    void addAndRemoveCounterpart() {
        Counterpart counterpart = new Counterpart("2323", "Fazer um seminário");
        this.project.addCounterpart(counterpart);
        assertEquals(2, this.project.getCounterpart().size());
        this.project.removeCounterpart(counterpart);
        assertEquals(1, this.project.getCounterpart().size());
    }

    @Test
    void addAndRemovePerson() {
        Person person = PersonTest.createPerson();
        this.project.addPerson(person);
        assertEquals(2, this.project.getTeam().size());
        this.project.removePerson(person);
        assertEquals(1, this.project.getTeam().size());
    }

    @Test
    void addAndRemoveProduct() {
        Product product = ProductTest.createProduct();
        this.project.addProduct(product);
        assertEquals(2, this.project.getProducts().size());
        this.project.removeProduct(product);
        assertEquals(1, this.project.getProducts().size());

    }

    @Test
    void addAndRemovePublicity() {
        Publicity publicity = PublicityTest.createPublicity();
        this.project.addPublicity(publicity);
        assertEquals(2, this.project.getPublicities().size());
        this.project.removePublicity(publicity);
        assertEquals(1, this.project.getPublicities().size());
    }

    @Test
    void addAndRemoveEvent() throws ParseException {
        Event event = EventTest.createEvent();
        this.project.addEvent(event);
        assertEquals(2, this.project.getTimeline().size());
        this.project.removeEvent(event);
        assertEquals(1, this.project.getTimeline().size());
    }

    @Test
    void getId() {
        assertEquals("8475", this.project.getId());
    }

    @Test
    void getOwner() {
        assertEquals("0987", this.project.getOwner());
    }

    @Test
    void getName() {
        assertEquals("Espetáculo Jaé", this.project.getName());
    }

    @Test
    void getCategory() {
        assertEquals("Artes cênicas", this.project.getCategory());
    }

    @Test
    void getCollaborators() {
        assertEquals("4059", this.project.getCollaborators().get(0));
    }

    @Test
    void getAbstractOfProject() {
        assertEquals("Apresentação de palhaçaria", this.project.getAbstractOfProject());
    }

    @Test
    void getPresentation() {
        assertEquals("Uma apresentação ilária", this.project.getPresentation());
    }

    @Test
    void getJustification() {
        assertEquals("Pra poder rir", this.project.getJustification());
    }

    @Test
    void getGoals() {
        assertEquals("3045", this.project.getGoals().get(0).getId());
        assertEquals("Apresentar 3 vezes", this.project.getGoals().get(0).getDescription());
    }

    @Test
    void getAccessibilities() {
        assertEquals("3245", this.project.getAccessibilities().get(0).getId());
        assertEquals("Libras", this.project.getAccessibilities().get(0).getDescription());
    }

    @Test
    void getDemocratizations() {
        assertEquals("4765", this.project.getDemocratizations().get(0).getId());
        assertEquals("Evento em área periférica", this.project.getDemocratizations().get(0).getDescription());
    }

    @Test
    void getCounterpart() {
        assertEquals("3295", this.project.getCounterpart().get(0).getId());
        assertEquals("Fazer um workshop", this.project.getCounterpart().get(0).getDescription());
    }

    @Test
    void getTeam() {
        Person person1 = this.project.getTeam().get(0);
        //    assertEquals(false, person1.isProponent());
        assertEquals("Fulano de tal", person1.getName());
        assertEquals("343.112.345-67", person1.getCpf());
        assertEquals(24, person1.getAge());
        assertEquals(Gender.NAO_BINARIO, person1.getGender());
        assertEquals(Ethnicity.BRANCA, person1.getEthnicity());
        assertEquals(TypeOfContract.PF, person1.getTypeOfContract());
        assertEquals("Diretor de Arte", person1.getOffice());
        assertEquals("Superior em Artes", person1.getQualification());
        assertEquals("Dirigir ensaios e apresentações", person1.getAssignments());
    }

    @Test
    void getProducts() {
        Product product1 = this.project.getProducts().get(0);
        assertEquals("4593", product1.getId());
        assertEquals("Apresentações", product1.getName());
        assertEquals("Apresentação com duração de 1 hora", product1.getDescription());
        assertEquals(5, product1.getQuantity());
        assertEquals("NA", product1.getDestination());
    }

    @Test
    void getPublicities() {
        Publicity publicity1 = this.project.getPublicities().get(0);
        assertEquals("3357", publicity1.getId());
        assertEquals("Cartaz A3", publicity1.getDescription());
        assertEquals("Colar em locais estratégicos", publicity1.getAction());
        assertEquals(50, publicity1.getQuantity());
        assertEquals(5, publicity1.getUnitPay());
        assertEquals(250, publicity1.getTotalPay());
    }

    @Test
    void getTimeline() {
        Event event1 = this.project.getTimeline().get(0);
        assertEquals("8364", event1.getId());
        assertEquals("Contratar artistas", event1.getDescription());
        assertEquals(Stage.PRE, event1.getStage());
        assertEquals("01/01/2024", event1.getInicialDate());
        assertEquals("31/01/2024", event1.getFinalDate());
        assertEquals(Status.NOT_STARTED, event1.getStatus());
    }

    @Test
    void setOwner() {
        this.project.setOwner("5849");
        assertEquals("5849", this.project.getOwner());
    }

    @Test
    void setName() {
        this.project.setName("Espetáculo Jáfui");
        assertEquals("Espetáculo Jáfui", this.project.getName());
    }

    @Test
    void setCategory() {
        this.project.setCategory("Circo");
        assertEquals("Circo", this.project.getCategory());
    }

    @Test
    void setAbstractOfProject() {
        this.project.setAbstractOfProject("Fazer um espetáculo circense");
        assertEquals("Fazer um espetáculo circense", this.project.getAbstractOfProject());
    }

    @Test
    void setPresentation() {
        this.project.setPresentation("Fazer malabares");
        assertEquals("Fazer malabares", this.project.getPresentation());
    }

    @Test
    void setJustification() {
        this.project.setJustification("Levar o circo para centro urbano");
        assertEquals("Levar o circo para centro urbano", this.project.getJustification());
    }
}