package com.migueldev.aestheticclinic.models.projection;

public interface PacienteProjection {

    Long getIdPaciente();

    UsuarioProjection getUsuario();

    String getNumeroProntuario();

    String getObservacoesGerais();

}
