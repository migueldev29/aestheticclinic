package com.migueldev.aestheticclinic.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = Usuario.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {
    
    public static final String TABLE_NAME = "usuario";

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100, nullable = false)
    @Size(min = 2, max = 100)
    @NotBlank
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "sexo", length = 1)
    private String sexo;

    @Column(name = "telefone", length = 11)
    @Size(min = 10, max = 11)
    private String telefone;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @Column(name = "endereco", length = 255)
    private String endereco;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;
    
    @Column(name = "ativo", nullable = false)
    private Boolean ativo;
    
}
