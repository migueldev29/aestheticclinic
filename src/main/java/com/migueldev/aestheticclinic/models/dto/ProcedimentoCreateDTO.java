package com.migueldev.aestheticclinic.models.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProcedimentoCreateDTO {
   
    @NotBlank
    @Size(min = 2, max = 100)
    private String nome;

    @NotBlank
    @Size(max = 500)
    private String descricao;

    @Positive
    private Integer duracaoMinutos;

    @Positive
    @DecimalMin("0.0")
    private Double valor;

    @NotNull
    private Boolean exigeProfissionalHabilitado;

    @NotBlank
    @Size(max = 500)
    private String cuidadosPre;

    @NotBlank
    @Size(max = 500)
    private String cuidadosPos;

    @NotBlank
    @Size(max = 500)
    private String contraindicacoes;

}
