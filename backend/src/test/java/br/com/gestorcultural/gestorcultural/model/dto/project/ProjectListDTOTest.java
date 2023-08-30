package br.com.gestorcultural.gestorcultural.model.dto.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectListDTOTest {
    private ProjectListDTO projectListDTO;

    @BeforeEach
    void setUp() {
        this.projectListDTO = this.createProjectDTO();
    }

    private ProjectListDTO createProjectDTO() {
        return new ProjectListDTO("1111", "2222", "Cultura para todxs", "Peça de teatro");
    }

    @Test
    void getId() {
        assertEquals("1111", this.projectListDTO.getId());
    }

    @Test
    void getOwner() {
        assertEquals("2222", this.projectListDTO.getOwner());
    }

    @Test
    void getName() {
        assertEquals("Cultura para todxs", this.projectListDTO.getName());
    }

    @Test
    void getAbstractOfProject() {
        assertEquals("Peça de teatro", this.projectListDTO.getAbstractOfProject());
    }

    @Test
    void setOwner() {
        this.projectListDTO.setOwner("3333");
        assertEquals("3333", this.projectListDTO.getOwner());
    }

    @Test
    void setName() {
        this.projectListDTO.setName("Curso de Cinema");
        assertEquals("Curso de Cinema", this.projectListDTO.getName());
    }

    @Test
    void setAbstractOfProject() {
        this.projectListDTO.setAbstractOfProject("Um curso interessante");
        assertEquals("Um curso interessante", this.projectListDTO.getAbstractOfProject());
    }
}