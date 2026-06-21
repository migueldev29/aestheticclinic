package com.migueldev.aestheticclinic.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.aestheticclinic.models.HorarioDisponivel;
import com.migueldev.aestheticclinic.models.projection.HorarioDisponivelProjection;

public interface HorarioDisponivelRepository extends JpaRepository<HorarioDisponivel, Long> {
    
    Optional<HorarioDisponivelProjection> findProjectionById(Long id);

    Optional<HorarioDisponivelProjection> findFirstByDataAndHoraInicio(String data, String horaInicio);

    Optional<HorarioDisponivelProjection> findFirstByDataAndHoraFim(String data, String horaFim);

    Optional<HorarioDisponivelProjection> findFirstByDataAndHoraInicioAndHoraFim(String data, String horaInicio, String horaFim);

    List<HorarioDisponivelProjection> findAllByDataOrderByHoraInicio(String data);

    List<HorarioDisponivelProjection> findAllByDataBetweenOrderByDataAscHoraInicioAsc(String dataInicio, String dataFim);

    boolean existsByDataAndHoraInicio(String data, String horaInicio);

    long countByData(String data);

    void deleteByDataAndHoraInicio(String data, String horaInicio);
}
