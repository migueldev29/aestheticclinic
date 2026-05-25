package com.migueldev.aestheticclinic.models.dto;

import java.time.LocalDateTime;
import com.migueldev.aestheticclinic.models.enums.StatusSessaoEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SessaoProcedimentoUpdateDTO {
    
    @NotNull
    private Long id;

    @NotNull
    private LocalDateTime dataHoraFim;

    @NotNull
    private StatusSessaoEnum statusSessao;

    @NotBlank
    @Size(max = 500)
    private String observacoes;
}
