package br.com.gestorcultural.gestorcultural.controller.project;

import br.com.gestorcultural.gestorcultural.model.dto.project.ProjectListDTO;
import br.com.gestorcultural.gestorcultural.model.entity.project.Project;
import br.com.gestorcultural.gestorcultural.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projetos")
@Validated
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<ProjectListDTO> findAll(@RequestBody ProjectListDTO projectListDTO) {
        return projectService.findAll(projectListDTO.getOwner());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Project save(@RequestBody Project project) {
        return this.projectService.save(project);
    }
}
