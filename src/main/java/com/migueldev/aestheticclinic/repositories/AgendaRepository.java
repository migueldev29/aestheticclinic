package com.migueldev.aestheticclinic.repositories;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.migueldev.aestheticclinic.models.Agenda;
import com.migueldev.aestheticclinic.models.projection.AgendaProjection;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    
    Optional<AgendaProjection> findProjectionById(Long id);

    List<AgendaProjection> findAllByDateBetween(String startDate, String endDate);

    List<AgendaProjection> findAllByClientNameContainingIgnoreCase(String clientName);

    boolean existsByDateAndTime(LocalDate date, LocalTime time);
    
}
