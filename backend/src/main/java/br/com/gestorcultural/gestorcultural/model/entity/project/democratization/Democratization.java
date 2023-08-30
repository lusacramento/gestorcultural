package br.com.gestorcultural.gestorcultural.model.entity.project.democratization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Democratization {
    @Id
    private String id;
    private String description;
}
