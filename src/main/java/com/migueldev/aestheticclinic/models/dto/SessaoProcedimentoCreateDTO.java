package com.migueldev.aestheticclinic.models.dto;

import java.time.LocalDateTime;
import com.migueldev.aestheticclinic.models.enums.StatusSessaoEnum;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SessaoProcedimentoCreateDTO {
    
    @NotNull
    private LocalDateTime dataHoraInicio;

    @NotNull
    private LocalDateTime dataHoraFim;

    @NotNull
    private StatusSessaoEnum statusSessao;

    @Size(max = 500)
    private String observacoes;

    @NotNull
    private Long pacienteId;

    @NotNull
    private Long profissionalId;

    @NotNull
    private Long procedimentoId;
}
