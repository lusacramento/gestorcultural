package br.com.gestorcultural.gestorcultural.model.entity.project.goal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goal {
    @Id
    private String id;
    private String description;
}
