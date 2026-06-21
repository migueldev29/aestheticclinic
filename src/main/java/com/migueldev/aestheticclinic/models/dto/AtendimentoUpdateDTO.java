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
public class AtendimentoUpdateDTO {
    
    @NotNull
    private Long id;

    @NotBlank
    @Size(max = 500)
    private String avaliacao;

    @NotBlank
    @Size(max = 500)
    private String evolucao;

    @NotBlank
    @Size(max = 500)
    private String observacoes;

}
