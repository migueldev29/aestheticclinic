package com.migueldev.aestheticclinic.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.migueldev.aestheticclinic.models.Paciente;
import com.migueldev.aestheticclinic.models.projection.PacienteProjection;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    @Transactional(readOnly = true)
    Optional<PacienteProjection> findProjectionById(Long id);

    Optional<PacienteProjection> findByUsuarioEmail(String email);

    Optional<PacienteProjection> findByUsuarioCpf(String cpf);

    boolean existsByUsuarioEmail(String email);

    boolean existsByUsuarioCpf(String cpf);

    List<PacienteProjection> findByUsuarioAtivoTrue();

    List<PacienteProjection> findAllByOrderByUsuarioNomeAsc();

    List<PacienteProjection> findByUsuarioNomeContainingIgnoreCase(String nome);

    List<PacienteProjection> findByUsuarioNomeContainingIgnoreCaseAndUsuarioAtivoTrue(String nome);

    Page<PacienteProjection> findByUsuarioNomeContainingIgnoreCase(
            String nome, Pageable pageable);

    Optional<PacienteProjection> findByNumeroProntuario(String numeroProntuario);

    boolean existsByNumeroProntuario(String numeroProntuario);
}