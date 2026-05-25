package com.migueldev.aestheticclinic.models.projection;

import java.time.LocalDateTime;
import java.util.Set;

import com.migueldev.aestheticclinic.models.enums.PerfilUsuarioEnum;

public interface UsuarioSistemaProjection {

    Long getIdUsuarioSistema();

    String getLogin();

    UsuarioProjection getUsuario();

    Set<PerfilUsuarioEnum> getPerfil();

    LocalDateTime getUltimoAcesso();

}
