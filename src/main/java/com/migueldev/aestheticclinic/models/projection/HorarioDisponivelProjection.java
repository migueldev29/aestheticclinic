package com.migueldev.aestheticclinic.models.projection;

public interface HorarioDisponivelProjection {
    
    Long getIdHorarioDisponivel();

    String getData();

    String getHoraInicio();

    String getHoraFim();

    AgendaProjection getAgenda();
}
