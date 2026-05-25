package com.migueldev.aestheticclinic.models.projection;

public interface ProcedimentoProjection {

    Long getIdProcedimento();

    String getNome();

    String getDescricao();

    Integer getDuracaoMinutos();

    Double getValor();

    Boolean getExigeProfissionalHabilitado();

}
