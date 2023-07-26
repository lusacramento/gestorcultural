package br.com.gestorcultural.gestorcultural.model.entity.project;

import br.com.gestorcultural.gestorcultural.model.entity.counterpart.Counterpart;
import br.com.gestorcultural.gestorcultural.model.entity.counterpart.CounterpartTest;
import br.com.gestorcultural.gestorcultural.model.entity.democratization.DemocratizationTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.accessibility.Accessibility;
import br.com.gestorcultural.gestorcultural.model.entity.project.accessibility.AccessibilityTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.democratization.Democratization;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.Event;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.EventTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.goal.Goal;
import br.com.gestorcultural.gestorcultural.model.entity.project.goal.GoalTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.product.Product;
import br.com.gestorcultural.gestorcultural.model.entity.project.product.ProductTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.publicity.Publicity;
import br.com.gestorcultural.gestorcultural.model.entity.project.publicity.PublicityTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.Person;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.PersonTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;


class ProjectTest {

    private Project project;

    private GoalTest goalTest = new GoalTest();

    private CounterpartTest counterpartTest = new CounterpartTest();
    private AccessibilityTest accessibilityTest = new AccessibilityTest();
    private DemocratizationTest democratizationTest = new DemocratizationTest();
    private PersonTest personTest = new PersonTest();
    private ProductTest productTest = new ProductTest();
    private PublicityTest publicityTest = new PublicityTest();
    private EventTest eventTest = new EventTest();
    private Goal goal = goalTest.createGoal();
    private Accessibility accessibility = this.accessibilityTest.createAccessibility();
    private Democratization democratization = this.democratizationTest.createDemocratization();
    private Counterpart counterpart = this.counterpartTest.createCounterpart();
    private Person person = this.personTest.createPerson();

    private Product product = this.productTest.createProduct();
    private Publicity publicity = this.publicityTest.createPublicity();
    private Event event = this.eventTest.createEvent();

    ProjectTest() throws ParseException {
    }

    @BeforeEach
    void setUp() {
        project = new Project();
        project.setId("12345");
        project.setOwner("001");
        project.addCollaborator("002");
        project.addCollaborator("003");
        project.setName("Teatro dos Oprimidos");
        project.setCategory("Artes Visuais");
        project.setAbstractOfProject("Executar uma peça teatral");
        project.setPresentation("Apresentar uma peça teatral");
        project.setJustification("Equipe excelente");
        project.addGoal(this.goal);
        project.addAccessibility(this.accessibility);
        project.addDemocratization(this.democratization);
        project.addCounterpart(this.counterpart);
        project.addPerson(this.person);
        project.addProduct(this.product);
        project.addPublicity(this.publicity);
        project.addEvent(this.event);


    }

    @Test
    void getId() {
        assertEquals("12345", project.getId());
    }

    @Test
    void getOwner() {
        assertEquals("001", project.getOwner());
    }

    @Test
    void getName() {
        assertEquals("Teatro dos Oprimidos", project.getName());
    }

    @Test
    void getCategory(){
        assertEquals("Artes Visuais", this.project.getCategory());
    }

    @Test
    void getCollaborators() {
    assertEquals("002", project.getCollaborators().get(0));
    assertEquals("003", project.getCollaborators().get(1));

    }

    @Test
    void getAbstractOfProject() {
        assertEquals("Executar uma peça teatral", project.getAbstractOfProject());
    }

    @Test
    void getPresentation() {
        assertEquals("Apresentar uma peça teatral", project.getPresentation());
    }

    @Test
    void getJustification() {
        assertEquals("Equipe excelente", project.getJustification());
    }

    @Test
    void getGoals() {
        assertEquals(this.goal, this. project.getGoals().get(0));
    }

    @Test
    void getAccessibilities(){
        assertEquals(this.accessibility, this.project.getAccessibilities().get(0));
    }

    @Test
    void getDemocratizations(){
        assertEquals(this.democratization, this.project.getDemocratizations().get(0));
    }

    @Test
    void getCounterpart(){
        assertEquals(this.counterpart, this.project.getCounterpart().get(0));
    }

    @Test
    void getTeam(){
        assertEquals(this.person, this.project.getTeam().get(0));

    }

    @Test
    void getProducts(){
        assertEquals(this.product, this.project.getProducts().get(0));

    }

    @Test
    void getPublicities(){
        assertEquals(this.publicity, this.project.getPublicities().get(0));
    }

    @Test
    void getTimeLine(){
        assertEquals(this.event, this.project.getTimeline().get(0));
    }

    @Test
    void setOwner() {
        this.project.setOwner("0365");
        assertEquals("0365", this.project.getOwner());
    }

    @Test
    void setName() {
        this.project.setName("Music In The Street");
        assertEquals("Music In The Street", this.project.getName());
    }

    @Test
    void setCategory(){
        this.project.setCategory("Música");
        assertEquals("Música", this.project.getCategory());
    }

    @Test
    void setAbstractOfProject() {
        this.project.setAbstractOfProject("Promover 5 shows em ruas");
        assertEquals("Promover 5 shows em ruas", this.project.getAbstractOfProject());
    }

    @Test
    void setPresentation() {
        this.project.setPresentation("Fazer acontecer!");
        assertEquals("Fazer acontecer!", this.project.getPresentation());
    }

    @Test
    void setJustification() {
        this.project.setJustification("Porque sim");
        assertEquals("Porque sim", this.project.getJustification());
    }


    @Test
    void addCollaborator(){
        project.addCollaborator("004");
        assertEquals(3, project.getCollaborators().size());
    }

    @Test
    void deleteCollaborator(){
        this.project.removeCollaborator("004");
        assertEquals(2, this.project.getCollaborators().size());

    }

    @Test
    void addGoals(){
        assertEquals(1, this.project.getGoals().size());
    }

    @Test
    void removeGoals(){
        this.project.removeGoal(this.goal);
        assertEquals(0, this.project.getGoals().size());
    }

    @Test
    void addAccessibility(){
        assertEquals(1, this.project.getAccessibilities().size());
    }

    @Test
    void removeAccessibility(){
        this.project.removeAccessibility(this.accessibility);
        assertEquals(0, this.project.getAccessibilities().size());
    }

    @Test
    void addDemocratization(){
        assertEquals(1, this.project.getDemocratizations().size());
    }

    @Test
    void removeDemocratization(){
        this.project.removeDemocratization(this.democratization);
        assertEquals(0, this.project.getDemocratizations().size());
    }

    @Test
    void addCounterpart(){
        assertEquals(1, this.project.getCounterpart().size());
    }

    @Test
    void removeCounterpart(){
        this.project.removeCounterpart(this.counterpart);
        assertEquals(0, this.project.getCounterpart().size());
    }
    @Test
    void addPerson(){
        assertEquals(1, this.project.getTeam().size());
    }

    @Test
    void removePerson(){
        this.project.removePerson(this.person);
        assertEquals(0, this.project.getTeam().size());
    }

    @Test
    void addProcuct(){
        assertEquals(1, this.project.getProducts().size());
    }

    @Test
    void removeProduct(){
        this.project.removeProduct(this.product);
        assertEquals(0, this.project.getProducts().size());
    }

    @Test
    void addPublicity(){
        assertEquals(1, this.project.getPublicities().size());
    }

    @Test
    void removePublicity(){
        this.project.removePublicity(this.publicity);
        assertEquals(0, this.project.getPublicities().size());
    }

    @Test
    void addEvent(){
        assertEquals(1, this.project.getTimeline().size());
    }

    @Test
    void removeEvent(){
        this.project.removeEvent(this.event);
        assertEquals(0, this.project.getTimeline().size());
    }
}