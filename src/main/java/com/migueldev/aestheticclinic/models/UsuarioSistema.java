package com.migueldev.aestheticclinic.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.migueldev.aestheticclinic.models.enums.PerfilUsuarioEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = UsuarioSistema.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioSistema {

    public static final String TABLE_NAME = "usuario_sistema";

    @Id
    @Column(name = "id_usuario_sistema", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", unique = true, nullable = false)
    private Usuario usuario;
    
    @Column(name = "login", length = 50, unique = true, nullable = false)
    @Size(min = 5, max = 50)
    @NotBlank
    private String login;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "senha", length = 60, nullable = false)
    @NotBlank
    @Size(min = 8, max = 60)
    private String senha;

    @Column(name = "perfil", nullable = false)
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "usuario_perfil", joinColumns = @JoinColumn(name = "usuario_id"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Set<Integer> perfil = new HashSet<>();

    @Column(name = "data_hora_ultimo_acesso", nullable = false)
    private LocalDateTime ultimoAcesso;

    public Set<PerfilUsuarioEnum> getPerfil() {
        return this.perfil.stream().map(x -> PerfilUsuarioEnum.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(PerfilUsuarioEnum perfilUsuarioEnum) {
        this.perfil.add(perfilUsuarioEnum.getCode());
    }
}