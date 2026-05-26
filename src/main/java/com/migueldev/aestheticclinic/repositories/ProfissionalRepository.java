package com.migueldev.aestheticclinic.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.migueldev.aestheticclinic.models.Profissional;
import com.migueldev.aestheticclinic.models.projection.ProfissionalProjection;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

    @Transactional(readOnly = true)
    Optional<ProfissionalProjection> findProjectionById(Long id);

    Optional<ProfissionalProjection> findByUsuarioEmail(String email);

    Optional<ProfissionalProjection> findByUsuarioCpf(String cpf);

    boolean existsByUsuarioEmail(String email);

    boolean existsByUsuarioCpf(String cpf);

    List<ProfissionalProjection> findByUsuarioAtivoTrue();

    List<ProfissionalProjection> findAllByOrderByUsuarioNomeAsc();

    List<ProfissionalProjection> findByUsuarioNomeContainingIgnoreCase(String nome);

    List<ProfissionalProjection> findByUsuarioNomeContainingIgnoreCaseAndUsuarioAtivoTrue(String nome);

    Page<ProfissionalProjection> findByUsuarioNomeContainingIgnoreCase(
            String nome, Pageable pageable);

    Optional<ProfissionalProjection> findByRegistroProfissional(String registroProfissional);

    boolean existsByRegistroProfissional(String registroProfissional);

    List<ProfissionalProjection> findByEspecialidadeContainingIgnoreCase(String especialidade);

    List<ProfissionalProjection> findByAtivoAgendaTrue();

    List<ProfissionalProjection> findByTipoProfissional(String tipoProfissional);
}
