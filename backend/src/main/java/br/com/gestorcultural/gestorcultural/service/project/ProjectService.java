package br.com.gestorcultural.gestorcultural.service.project;

import br.com.gestorcultural.gestorcultural.model.entity.project.Project;
import org.springframework.stereotype.Service;

@Service
public interface ProjectService {
    //  List<ProjectListDTO> findAll(String owner);

    Project save(Project project);
}
