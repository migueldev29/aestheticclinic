package com.migueldev.aestheticclinic.models.projection;

public interface ProfissionalProjection {

    Long getIdProfissional();

    UsuarioProjection getUsuario();

    String getEspecialidade();

    String getRegistroProfissional();

    String getTipoProfissional();

}
