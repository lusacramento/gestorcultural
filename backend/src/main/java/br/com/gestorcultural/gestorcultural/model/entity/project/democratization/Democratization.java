package br.com.gestorcultural.gestorcultural.model.entity.project.democratization;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Democratization {
    @Id
    private String id;
    private String description;
}
