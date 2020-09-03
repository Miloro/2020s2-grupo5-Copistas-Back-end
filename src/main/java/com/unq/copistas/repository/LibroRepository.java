package com.unq.copistas.repository;


import com.unq.copistas.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    @Query(value = "SELECT * FROM libros WHERE titulo LIKE %?1%", nativeQuery = true)
    List<Libro> findAllLibrosConTitulo(String titulo);
}
