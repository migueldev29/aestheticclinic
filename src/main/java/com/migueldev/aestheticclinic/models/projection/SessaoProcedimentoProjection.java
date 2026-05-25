package com.migueldev.aestheticclinic.models.projection;

import java.time.LocalDateTime;

import com.migueldev.aestheticclinic.models.enums.StatusSessaoEnum;

public interface SessaoProcedimentoProjection {

    Long getIdSessao();

    LocalDateTime getDataHoraInicio();

    LocalDateTime getDataHoraFim();

    StatusSessaoEnum getStatusSessao();

    String getObservacoes();

    PacienteProjection getPaciente();

    ProfissionalProjection getProfissional();

    ProcedimentoProjection getProcedimento();

}
