package com.migueldev.aestheticclinic.models.dto;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AtendimentoCreateDTO {
    
    @NotNull
    private LocalDateTime dataHora;

    @NotBlank
    @Size(max = 500)
    private String avaliacao;

    @NotBlank
    @Size(max = 500)
    private String evolucao;

    @NotBlank
    @Size(max = 500)
    private String observacoes;

    @NotNull
    private Long sessaoProcedimentoId;
}
