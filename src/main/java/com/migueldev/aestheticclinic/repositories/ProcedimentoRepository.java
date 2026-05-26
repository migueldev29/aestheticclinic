package com.migueldev.aestheticclinic.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.migueldev.aestheticclinic.models.Procedimento;
import com.migueldev.aestheticclinic.models.projection.ProcedimentoProjection;


@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {

    @Transactional(readOnly = true)
    Optional<ProcedimentoProjection> findProjectionById(Long id);

    Optional<ProcedimentoProjection> findByNome(String nome);

    boolean existsByNome(String nome);

    List<ProcedimentoProjection> findByValorBetween(Double valorMin, Double valorMax);

    List<ProcedimentoProjection> findByDuracaoMinutosBetween(Integer duracaoMin, Integer duracaoMax);

    List<ProcedimentoProjection> findByExigeProfissionalHabilitado(Boolean exige);

    List<ProcedimentoProjection> findByNomeContainingIgnoreCase(String nome);

    Page<ProcedimentoProjection> findByNomeContainingIgnoreCase(
            String nome, Pageable pageable);

    List<ProcedimentoProjection> findByValorLessThanEqual(Double valorMax);

    List<ProcedimentoProjection> findByDuracaoMinutosLessThanEqual(Integer duracaoMax);
}