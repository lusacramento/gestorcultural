package br.com.gestorcultural.gestorcultural.model.entity.project.goal;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Goal {
    @Id
    private String id;
    private String goal;
}
