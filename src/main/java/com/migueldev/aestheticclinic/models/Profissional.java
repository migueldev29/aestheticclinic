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
@Table(name = Profissional.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Profissional {
    
    public static final String TABLE_NAME = "profissional";

    @Id
    @Column(name = "id_profissional", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", unique = true, nullable = false)
    private Usuario usuario;

    @Column(name = "especialidade", length = 100)
    private String especialidade;

    @Column(name = "registro_profissional", length = 50, unique = true)
    private String registroProfissional;

    @Column(name = "tipo_profissional", length = 50)
    private String tipoProfissional;

    @Column(name = "ativo_agenda")
    private Boolean ativoAgenda;

    @OneToMany(mappedBy = "profissional")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<SessaoProcedimento> sessoesProcedimentos;

    @OneToOne(mappedBy = "profissional", cascade = CascadeType.ALL)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Agenda agenda;
}
