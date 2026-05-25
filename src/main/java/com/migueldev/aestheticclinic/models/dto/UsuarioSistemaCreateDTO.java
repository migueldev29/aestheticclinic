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
public class UsuarioSistemaCreateDTO {
   
    @NotNull
    private Long usuarioId;
    
    @NotBlank
    @Size(min = 5, max = 50)
    private String login;

    @NotBlank
    @Size(min = 8, max = 60)
    private String senha;

}
