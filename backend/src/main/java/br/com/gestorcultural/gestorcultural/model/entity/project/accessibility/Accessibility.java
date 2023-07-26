package br.com.gestorcultural.gestorcultural.model.entity.project.accessibility;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Accessibility {
    @Id
    private String id;
    private String accessibility;
}
