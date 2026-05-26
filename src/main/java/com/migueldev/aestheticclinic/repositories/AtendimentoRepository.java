package com.migueldev.aestheticclinic.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.migueldev.aestheticclinic.models.Atendimento;
import com.migueldev.aestheticclinic.models.projection.AtendimentoProjection;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {

    @Transactional(readOnly = true)
    Optional<AtendimentoProjection> findProjectionById(Long id);

    List<AtendimentoProjection> findBySessaoProcedimentoProcedimentoNomeContainingIgnoreCase(String nome);

    List<AtendimentoProjection> findBySessaoProcedimentoProfissionalNomeContainingIgnoreCase(String nome);

    List<AtendimentoProjection> findByDataHoraBetween(java.time.LocalDateTime inicio, java.time.LocalDateTime fim);

    List<AtendimentoProjection> findBySessaoProcedimentoStatusSessao(com.migueldev.aestheticclinic.models.enums.StatusSessaoEnum status);

    Page<AtendimentoProjection> findBySessaoProcedimentoProcedimentoNomeContainingIgnoreCase(
            String nome, Pageable pageable);

    Page<AtendimentoProjection> findByDataHoraBetween(
            java.time.LocalDateTime inicio, java.time.LocalDateTime fim, Pageable pageable);
}