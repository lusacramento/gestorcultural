package br.com.gestorcultural.gestorcultural.model.entity.project.accessibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accessibility {
    @Id
    private String id;
    private String description;
}
