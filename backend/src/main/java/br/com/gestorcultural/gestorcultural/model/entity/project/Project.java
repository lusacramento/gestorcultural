package br.com.gestorcultural.gestorcultural.model.entity.project;

import br.com.gestorcultural.gestorcultural.model.entity.counterpart.Counterpart;
import br.com.gestorcultural.gestorcultural.model.entity.project.accessibility.Accessibility;
import br.com.gestorcultural.gestorcultural.model.entity.project.democratization.Democratization;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.Event;
import br.com.gestorcultural.gestorcultural.model.entity.project.goal.Goal;
import br.com.gestorcultural.gestorcultural.model.entity.project.product.Product;
import br.com.gestorcultural.gestorcultural.model.entity.project.publicity.Publicity;
import br.com.gestorcultural.gestorcultural.model.entity.project.team.Person;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "project")
public class Project {
    @Id
    private String id;
    private String owner;
    private String name;
    private String category;
    private List<String> collaborators = new ArrayList<String>();
    private String abstractOfProject;
    private String presentation;
    private String justification;
    private List<Goal> goals = new ArrayList<Goal>();
    private List<Accessibility> accessibilities = new ArrayList<Accessibility>() ;
    private List<Democratization> democratizations = new ArrayList<Democratization>();
    private List<Counterpart> counterpart = new ArrayList<Counterpart>();
    private List<Person> team = new ArrayList<Person>();
    private List<Product> products = new ArrayList<Product>();
    private List<Publicity> publicities = new ArrayList<Publicity>();
    private List<Event> timeline = new ArrayList<Event>();

    void addCollaborator(String collaborator){
        this.collaborators.add(collaborator);
    }

    void removeCollaborator(String collaborator){
        this.collaborators.remove(collaborator);
    }

    void addGoal(Goal goal){ this.goals.add(goal); }

    void removeGoal(Goal goal){ this.goals.remove(goal); }

    void addAccessibility(Accessibility accessibility){ this.accessibilities.add(accessibility); }

    void removeAccessibility(Accessibility accessibility){ this.accessibilities.remove(accessibility); }

    void addDemocratization(Democratization democratization){ this.democratizations.add(democratization); }

    void removeDemocratization(Democratization democratization) { this.democratizations.remove(democratization); }

    void addCounterpart(Counterpart counterpart) { this.counterpart.add(counterpart); }

    void removeCounterpart(Counterpart counterpart){ this.counterpart.remove(counterpart); }

    void addPerson(Person person) { this.team.add(person); }
    void removePerson(Person person) { this.team.remove(person); }

    void addProduct(Product product) { this.products.add(product); }

    void removeProduct(Product product){ this.products.remove(product); }

    void addPublicity(Publicity publicity) { this.publicities.add(publicity); }

    void removePublicity(Publicity publicity) { this.publicities.remove(publicity);}

    void addEvent(Event event) { this.timeline.add(event); }

    void removeEvent(Event event) { this.timeline.remove(event); }


}
