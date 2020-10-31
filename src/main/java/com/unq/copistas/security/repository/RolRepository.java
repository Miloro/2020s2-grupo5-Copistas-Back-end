package com.unq.copistas.security.repository;
import org.springframework.data.jpa.repository.Query;
import com.unq.copistas.security.entity.Rol;
import com.unq.copistas.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
