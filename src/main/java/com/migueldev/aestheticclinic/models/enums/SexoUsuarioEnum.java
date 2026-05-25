package com.migueldev.aestheticclinic.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SexoUsuarioEnum {

    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino"),
    OUTRO(3, "Outro");

    private Integer code;
    private String description;

    public static SexoUsuarioEnum toEnum(Integer code) {
        if (code == null) {
            return null;
        }
        for (SexoUsuarioEnum x : SexoUsuarioEnum.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + code);
    }
}

