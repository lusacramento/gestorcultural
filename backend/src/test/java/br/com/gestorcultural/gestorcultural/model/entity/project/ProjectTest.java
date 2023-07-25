package br.com.gestorcultural.gestorcultural.model.entity.project;

import br.com.gestorcultural.gestorcultural.model.entity.counterpart.Counterpart;
import br.com.gestorcultural.gestorcultural.model.entity.counterpart.CounterpartTest;
import br.com.gestorcultural.gestorcultural.model.entity.democratization.DemocratizationTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.accessibility.Accessibility;
import br.com.gestorcultural.gestorcultural.model.entity.project.accessibility.AccessibilityTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.democratization.Democratization;
import br.com.gestorcultural.gestorcultural.model.entity.project.goal.Goal;
import br.com.gestorcultural.gestorcultural.model.entity.project.goal.GoalTest;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.Person;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.PersonTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProjectTest {

    private Project project;

    private GoalTest goalTest = new GoalTest();

    private CounterpartTest counterpartTest = new CounterpartTest();
    private AccessibilityTest accessibilityTest = new AccessibilityTest();
    private DemocratizationTest democratizationTest = new DemocratizationTest();
    private PersonTest personTest = new PersonTest();
    private Goal goal = goalTest.createGoal();
    private Accessibility accessibility = this.accessibilityTest.createAccessibility();
    private Democratization democratization = this.democratizationTest.createDemocratization();
    private Counterpart counterpart = this.counterpartTest.createCounterpart();
    private Person person = this.personTest.createPerson();

    @BeforeEach
    void setUp() {
        project = new Project();
        project.setId("12345");
        project.setOwner("001");
        project.addCollaborator("002");
        project.addCollaborator("003");
        project.setName("Teatro dos Oprimidos");
        project.setAbstractOfProject("Executar uma peça teatral");
        project.setPresentation("Apresentar uma peça teatral");
        project.setJustification("Equipe excelente");
        project.addGoal(this.goal);
        project.addAccessibility(this.accessibility);
        project.addDemocratization(this.democratization);
        project.addCounterpart(this.counterpart);
        project.addPerson(this.person);
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
    void getCollaborators() {
    assertEquals("002", project.getCollaborators().get(0));
    assertEquals("003", project.getCollaborators().get(1));

    }

    @Test
    void getShortDescription() {
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
        assertEquals(this.goal.getGoal(), this. project.getGoals().get(0).getGoal());
    }

    @Test
    void getAccessibilities(){
        assertEquals(this.accessibility.getAccessibility(), this.project.getAccessibilities().get(0).getAccessibility());
    }

    @Test
    void getDemocratizations(){
        assertEquals(this.democratization.getDemocratization(), this.project.getDemocratizations().get(0).getDemocratization());
    }

    @Test
    void getCounterpart(){
        assertEquals(this.counterpart.getCounterpart(), this.project.getCounterpart().get(0).getCounterpart());
    }

    @Test
    void setOwner() {
    }

    @Test
    void setName() {
    }

    @Test
    void setCollaborators() {
    }

    @Test
    void setShortDescription() {
    }

    @Test
    void setPresentation() {
    }

    @Test
    void setJustification() {
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

}