package com.migueldev.aestheticclinic.models.projection;

public interface AgendaProjection {
    
    Long getIdAgenda();

    String getData();

    String getHoraInicio();

    String getHoraFim();

    ProfissionalProjection getProfissional();
}
