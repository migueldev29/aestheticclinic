package com.migueldev.aestheticclinic.models.projection;

import java.time.LocalDateTime;

public interface AtendimentoProjection {

    Long getIdAtendimento();

    LocalDateTime getDataHora();

    String getAvaliacao();

    String getEvolucao();

    String getObservacoes();

    SessaoProcedimentoProjection getSessaoProcedimento();

}
