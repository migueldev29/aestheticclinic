package com.migueldev.aestheticclinic.repositories;

import com.migueldev.aestheticclinic.models.UsuarioSistema;
import com.migueldev.aestheticclinic.models.projection.UsuarioSistemaProjection;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioSistemaRepository extends JpaRepository<UsuarioSistema, Long> {

    /** Busca a projeção de UsuarioSistema pelo seu identificador. */
    Optional<UsuarioSistemaProjection> findProjectionById(Long id);

    /** Busca a projeção de UsuarioSistema pelo login. */
    Optional<UsuarioSistemaProjection> findByLogin(String login);

    /** Verifica se existe um UsuarioSistema com o login informado. */
    boolean existsByLogin(String login);

    /** Busca a projeção de UsuarioSistema pelo identificador do usuário associado. */
    Optional<UsuarioSistemaProjection> findByUsuarioId(Long usuarioId);

}
