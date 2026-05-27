package com.migueldev.aestheticclinic.models;

import java.time.LocalDateTime;

import com.migueldev.aestheticclinic.models.enums.StatusSessaoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = SessaoProcedimento.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SessaoProcedimento {

    public static final String TABLE_NAME = "sessao_procedimento";
    
    // Renomeado para "id" para que o Spring Data JPA reconheça a propriedade padrão
    @Id
    @Column(name = "id_sessao", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "data_hora_inicio", nullable = false)
    @NotBlank
    private LocalDateTime dataHoraInicio;

    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    @Column(name = "status_sessao", nullable = false)
    private StatusSessaoEnum statusSessao;

    @Column(name = "observacoes", length = 500)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_profissional", referencedColumnName = "id_profissional", nullable = false)
    private Profissional profissional;

    @ManyToOne
    @JoinColumn(name = "id_procedimento", referencedColumnName = "id_procedimento", nullable = false)
    private Procedimento procedimento;

}
