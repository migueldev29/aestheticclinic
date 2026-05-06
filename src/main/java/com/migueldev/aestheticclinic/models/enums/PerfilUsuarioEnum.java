package com.migueldev.aestheticclinic.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PerfilUsuarioEnum {

    ADMIN(1, "ROLE_ADMIN"),
    PACIENTE(2, "ROLE_PACIENTE"),
    PROFISSIONAL(3, "ROLE_PROFISSIONAL");

    private Integer code;
    private String description;

    public static PerfilUsuarioEnum toEnum(Integer code) {
        if (code == null) {
            return null;
        }
        for (PerfilUsuarioEnum x : PerfilUsuarioEnum.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + code);
    }
}
