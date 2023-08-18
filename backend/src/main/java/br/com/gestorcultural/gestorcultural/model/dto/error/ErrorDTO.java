package br.com.gestorcultural.gestorcultural.model.dto.error;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDTO {
    @NotBlank
    private int status;
    @NotBlank
    private String message;
}
