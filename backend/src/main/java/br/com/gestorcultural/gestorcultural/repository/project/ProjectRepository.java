package br.com.gestorcultural.gestorcultural.repository.project;

import br.com.gestorcultural.gestorcultural.model.dto.project.ProjectListDTO;
import br.com.gestorcultural.gestorcultural.model.entity.project.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectRepository extends MongoRepository<Project, String> {
    @Query(value = "{ 'owner' : ?0 }", fields = "{ '_id': 1, 'owner': 1, 'name': 1, 'abstractOfProject': 1}")
    List<ProjectListDTO> findAllByOwner(String owner);
}
