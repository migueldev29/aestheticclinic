package com.migueldev.aestheticclinic.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.migueldev.aestheticclinic.models.Usuario;
import com.migueldev.aestheticclinic.models.projection.UsuarioProjection;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<UsuarioProjection> findByEmail(String email);

    Optional<UsuarioProjection> findByCpf(String cpf);

    boolean existsByEmail(String email);

    boolean existsByCpf(String cpf);

    List<UsuarioProjection> findByAtivoTrue();

    List<UsuarioProjection> findAllByOrderByNomeAsc();

    List<UsuarioProjection> findByNomeContainingIgnoreCase(String nome);

    List<UsuarioProjection> findByNomeContainingIgnoreCaseAndAtivoTrue(String nome);

    Page<UsuarioProjection> findByNomeContainingIgnoreCase(
            String nome,
            Pageable pageable
    );
}
