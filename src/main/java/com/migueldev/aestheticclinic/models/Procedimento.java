package com.migueldev.aestheticclinic.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = Procedimento.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Procedimento {
    
    public static final String TABLE_NAME = "procedimento";

    @Id
    @Column(name = "id_procedimento", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", length = 100, nullable = false)
    @Size(min = 2, max = 100)
    @NotBlank
    private String nome;

    @Column(name = "descricao", length = 500)
    @Size(max = 500)
    private String descricao;

    @Column(name = "duracao_minutos", nullable = false)
    @NotBlank
    private Integer duracaoMinutos;

    @Column(name = "valor", nullable = false)
    @NotBlank
    private Double valor;

    @Column(name = "exige_profissional_habilitado", nullable = false)
    private Boolean exigeProfissionalHabilitado;

    @Column(name = "cuidados_pre", length = 500)
    @Size(max = 500)
    private String cuidadosPre;

    @Column(name = "cuidados_pos", length = 500)
    @Size(max = 500)
    private String cuidadosPos;

    @Column(name = "contraindicacoes", length = 500)
    @Size(max = 500)
    private String contraindicacoes;

    @OneToMany(mappedBy = "procedimento")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<SessaoProcedimento> sessaoProcedimentos;
}
