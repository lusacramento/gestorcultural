package br.com.gestorcultural.gestorcultural.model.entity.project.cost;

import br.com.gestorcultural.gestorcultural.model.entity.project.event.stage.Stage;
import br.com.gestorcultural.gestorcultural.model.entity.project.event.status.Status;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cost {
    @Id
    private String id;
    private Stage stage;
    private String name;
    private String description;
    private String unit;
    private double quantity;
    private double unitPay;
    private double totalPay;
    private Status status;

    public void setQuantity(double quantity) {
        this.quantity = quantity;
        this.totalPay = quantity * this.unitPay;
    }

    public void setUnitPay(double unitPay) {
        this.unitPay = unitPay;
        this.totalPay = this.quantity * unitPay;
    }
}
