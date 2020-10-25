package com.unq.copistas.security.repository;

import com.unq.copistas.model.Usuario;
import com.unq.copistas.security.entity.Rol;
import com.unq.copistas.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
