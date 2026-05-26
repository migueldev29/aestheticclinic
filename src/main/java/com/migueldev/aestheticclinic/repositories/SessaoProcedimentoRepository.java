package com.migueldev.aestheticclinic.repositories;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.migueldev.aestheticclinic.models.SessaoProcedimento;
import com.migueldev.aestheticclinic.models.enums.StatusSessaoEnum;
import com.migueldev.aestheticclinic.models.projection.SessaoProcedimentoProjection;

@Repository
public interface SessaoProcedimentoRepository extends JpaRepository<SessaoProcedimento, Long> {

    @Transactional(readOnly = true)
    Optional<SessaoProcedimentoProjection> findProjectionById(Long id);

    List<SessaoProcedimentoProjection> findByPacienteId(Long pacienteId);

    List<SessaoProcedimentoProjection> findByProfissionalId(Long profissionalId);

    List<SessaoProcedimentoProjection> findByProcedimentoId(Long procedimentoId);

    List<SessaoProcedimentoProjection> findByStatusSessao(StatusSessaoEnum status);

    List<SessaoProcedimentoProjection> findByDataHoraInicioBetween(LocalDateTime inicio, LocalDateTime fim);

    List<SessaoProcedimentoProjection> findByPacienteUsuarioNomeContainingIgnoreCase(String nome);

    List<SessaoProcedimentoProjection> findByProfissionalUsuarioNomeContainingIgnoreCase(String nome);

    List<SessaoProcedimentoProjection> findByProcedimentoNomeContainingIgnoreCase(String nome);

    Page<SessaoProcedimentoProjection> findByDataHoraInicioBetween(
            LocalDateTime inicio, LocalDateTime fim, Pageable pageable);

    Page<SessaoProcedimentoProjection> findByPacienteUsuarioNomeContainingIgnoreCase(
            String nome, Pageable pageable);

    Page<SessaoProcedimentoProjection> findByProfissionalUsuarioNomeContainingIgnoreCase(
            String nome, Pageable pageable);

    Page<SessaoProcedimentoProjection> findByProcedimentoNomeContainingIgnoreCase(
            String nome, Pageable pageable);

    List<SessaoProcedimentoProjection> findByDataHoraInicioAfter(LocalDateTime data);

    List<SessaoProcedimentoProjection> findByDataHoraFimBefore(LocalDateTime data);
}
