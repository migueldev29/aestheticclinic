package com.migueldev.aestheticclinic.models.dto;

import java.time.LocalDateTime;
import com.migueldev.aestheticclinic.models.enums.StatusSessaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessaoProcedimentoResponseDTO {

    private Long id;

    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private StatusSessaoEnum statusSessao;
    private String observacoes;
}