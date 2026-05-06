package com.migueldev.aestheticclinic.models.enums;

public enum StatusSessaoEnum {
    AGENDADA(1, "Agendada"),
    EM_ANDAMENTO(2, "Em Andamento"),
    CONCLUIDA(3, "Concluída"),
    CANCELADA(4, "Cancelada");

    private Integer code;
    private String description;

    StatusSessaoEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}