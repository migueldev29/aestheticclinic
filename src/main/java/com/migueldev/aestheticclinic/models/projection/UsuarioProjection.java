package com.migueldev.aestheticclinic.models.projection;

import java.time.LocalDate;

import com.migueldev.aestheticclinic.models.enums.SexoUsuarioEnum;

public interface UsuarioProjection {

    Long getIdUsuario();

    String getNome();

    String getCpf();

    LocalDate getDataNascimento();

    SexoUsuarioEnum getSexo();

    String getTelefone();

    String getEmail();

    default Integer getIdade() {
        if (getDataNascimento() == null) {
            return null;
        }
        return LocalDate.now().getYear() - getDataNascimento().getYear();
    }

}
