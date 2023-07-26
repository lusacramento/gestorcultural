package br.com.gestorcultural.gestorcultural.model.entity.project.product;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double quantity;
    private String destination;
}
