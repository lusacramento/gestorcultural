package br.com.gestorcultural.gestorcultural.model.entity.project.event;

import br.com.gestorcultural.gestorcultural.model.entity.project.event.stage.Stage;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.status.Status;
import br.com.gestorcultural.gestorcultural.service.utils.date.DateOperations;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Event {
    @Id
    private String id;
    private String description;
    private Stage stage;
    private Date inicialDate;
    private Date finalDate;
    private Status status;

    public String getInicialDate() {
        return DateOperations.dateToString(this.inicialDate);
    }

    public void setInicialDate(String date) throws ParseException {
        this.inicialDate = DateOperations.stringToDate(date);
    }

    public String getFinalDate() {
        return DateOperations.dateToString(finalDate);
    }

    public void setFinalDate(String date) throws ParseException {
        this.finalDate = DateOperations.stringToDate(date);
    }
}
