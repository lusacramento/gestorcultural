package br.com.gestorcultural.gestorcultural.model.entity.project.goal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoalTest {

    private Goal goal;
    @BeforeEach
    void setUp() {
        this.goal = this.createGoal();

    }

    @Test
    void getId() {
        assertEquals("7890", this.goal.getId());
    }

    @Test
    void getGoal() {
        assertEquals("Dar visibilidade ao teatro do povo preto.", this.goal.getDescription());
    }

    @Test
    void setGoal() {
        this.goal.setDescription("Dar visibilidade ao teatro do oprimido");
        assertEquals("Dar visibilidade ao teatro do oprimido", this.goal.getDescription());
    }

    public Goal createGoal(){
        Goal goal1 = new Goal();
        goal1.setId("7890");
        goal1.setDescription("Dar visibilidade ao teatro do povo preto.");
        return goal1;
    }
}