package br.com.gestorcultural.gestorcultural.controller.project;

import br.com.gestorcultural.gestorcultural.model.entity.project.Project;
import br.com.gestorcultural.gestorcultural.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/projetos")
@Validated
public class ProjectController {
    @Autowired
    ProjectService projectService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Project save(@RequestBody Project project){
        return this.projectService.save(project);
    }
}
