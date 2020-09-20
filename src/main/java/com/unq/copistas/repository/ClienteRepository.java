package com.unq.copistas.repository;

import com.unq.copistas.model.Cliente;
import com.unq.copistas.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findAllByDniContaining(int dni);
}
