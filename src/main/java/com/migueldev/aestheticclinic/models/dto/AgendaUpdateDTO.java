package com.migueldev.aestheticclinic.models.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AgendaUpdateDTO {
    
    @NotNull
    private Long id;
    
    @NotNull
    private Long profissionalId;
}
