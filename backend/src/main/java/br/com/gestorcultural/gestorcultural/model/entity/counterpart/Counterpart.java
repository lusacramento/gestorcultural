package br.com.gestorcultural.gestorcultural.model.entity.counterpart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Counterpart {
    @Id
    private String id;
    private String description;
}
