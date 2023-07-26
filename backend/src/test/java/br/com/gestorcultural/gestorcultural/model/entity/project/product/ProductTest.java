package br.com.gestorcultural.gestorcultural.model.entity.project.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        this.product = this.createProduct();
    }

    public Product createProduct() {
        Product product1 = new Product();
        product1.setId("2929");
        product1.setName("Peça teatral");
        product1.setDescription("Apresentação de espetáculo");
        product1.setQuantity(5);
        product1.setDestination("Não consta");
        return product1;
    }

    @Test
    void getId() {
        assertEquals("2929", product.getId());
    }

    @Test
    void getName() {
        assertEquals("Peça teatral", product.getName());
    }

    @Test
    void getDescription() {
        assertEquals("Apresentação de espetáculo", product.getDescription());
    }

    @Test
    void getQuantity() {
        assertEquals(5, product.getQuantity());
    }

    @Test
    void getDestination() {
        assertEquals("Não consta", product.getDestination());
    }

    @Test
    void setName() {
        product.setName("Peça de teatro");
        assertEquals("Peça de teatro", product.getName());
    }

    @Test
    void setDescription() {
        product.setDescription("Apresentação em 4 locais");
        assertEquals("Apresentação em 4 locais", product.getDescription());
    }

    @Test
    void setQuantity() {
        product.setQuantity(4);
        assertEquals(4, product.getQuantity());
    }

    @Test
    void setDestination() {
        product.setDestination("Não se aplica");
        assertEquals("Não se aplica", product.getDestination());
    }
}