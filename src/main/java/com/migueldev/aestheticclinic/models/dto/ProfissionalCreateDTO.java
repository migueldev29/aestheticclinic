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
public class ProfissionalCreateDTO {

    @NotNull
    private Long usuarioId;

    @NotBlank
    @Size(max = 100)
    private String especialidade;

    @NotBlank
    @Size(max = 50)
    private String registroProfissional;

    @NotBlank
    @Size(max = 50)
    private String tipoProfissional;

}
