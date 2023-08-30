package br.com.gestorcultural.gestorcultural.service.project.impl;

import br.com.gestorcultural.gestorcultural.model.dto.project.ProjectListDTO;
import br.com.gestorcultural.gestorcultural.model.entity.project.Project;
import br.com.gestorcultural.gestorcultural.repository.project.ProjectRepository;
import br.com.gestorcultural.gestorcultural.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<ProjectListDTO> findAll(String owner) {
        return this.projectRepository.findAllByOwner(owner);
    }

    @Override
    public Project save(Project project) {
        return this.projectRepository.save(project);
    }
}
