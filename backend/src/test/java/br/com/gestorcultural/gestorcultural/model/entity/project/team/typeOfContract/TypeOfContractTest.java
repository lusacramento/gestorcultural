package br.com.gestorcultural.gestorcultural.model.entity.project.team.typeOfContract;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeOfContractTest {

    private TypeOfContract typeOfContract;
    @BeforeEach
    void setUp() {
        this.typeOfContract = this.createTypeOfContract();

    }

    private TypeOfContract createTypeOfContract() {
        return TypeOfContract.MEI;
    }

    @Test
    void getDescription() {
        assertEquals("Micro Empreendedor Individual", this.typeOfContract.getDescription());
    }
}