package com.migueldev.aestheticclinic.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = Paciente.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paciente {

    public static final String TABLE_NAME = "paciente";

    @Id
    @Column(name = "id_paciente", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", unique = true, nullable = false)
    private Usuario usuario;

    @Column(name = "numero_prontuario", length = 50, unique = true)
    private String numeroProntuario;

    @Column(name = "observacoes_gerais", length = 500)
    private String observacoesGerais;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<SessaoProcedimento> sessoesProcedimentos;
}
