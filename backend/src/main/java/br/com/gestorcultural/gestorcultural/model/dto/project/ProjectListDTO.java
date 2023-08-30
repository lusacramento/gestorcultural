package br.com.gestorcultural.gestorcultural.model.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class ProjectListDTO {
    @Id
    String id;
    String owner;
    String name;
    String abstractOfProject;
}
