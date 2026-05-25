package com.migueldev.aestheticclinic.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioSistemaUpdateDTO {
   
    @NotNull
    private Long id;
    
    @NotBlank
    @Size(min = 8, max = 60)
    private String senha;

}
