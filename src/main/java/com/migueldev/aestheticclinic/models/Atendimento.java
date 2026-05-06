package com.migueldev.aestheticclinic.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = Atendimento.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Atendimento {

    public static final String TABLE_NAME = "atendimento";
    
    @Id
    @Column(name = "id_atendimento", unique = true)
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idAtendimento;

    @Column(name = "data_hora", nullable = false)
    @NotBlank
    private LocalDateTime dataHora;

    @Column(name = "avaliacao", length = 500)
    private String avaliacao;

    @Column(name = "evolucao", length = 500)
    private String evolucao;

    @Column(name = "observacoes", length = 500)
    private String observacoes;

    @OneToOne
    @JoinColumn(name = "id_sessao", referencedColumnName = "id_sessao", nullable = false)
    private SessaoProcedimento sessaoProcedimento;
}
