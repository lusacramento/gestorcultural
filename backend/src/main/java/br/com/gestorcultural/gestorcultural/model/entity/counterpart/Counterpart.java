package br.com.gestorcultural.gestorcultural.model.entity.counterpart;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Counterpart {
    @Id
    private String id;
    private String description;
}
