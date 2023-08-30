package br.com.gestorcultural.gestorcultural.model.entity.project.publicity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Publicity {
    @Id
    private String id;
    private String description;
    private String action;
    private double quantity;
    private double unitPay;
    private double totalPay;

    public void setQuantity(double quantity) {
        this.quantity = quantity;
        this.totalPay = quantity * this.unitPay;
    }

    public void setUnitPay(double unitPay){
        this.unitPay = unitPay;
        this.totalPay = this.quantity * unitPay;
    }
}
