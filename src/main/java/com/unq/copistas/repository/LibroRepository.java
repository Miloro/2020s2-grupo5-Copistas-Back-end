package com.unq.copistas.repository;


import com.unq.copistas.controller.dtos.DashboardCantidadPagadosDTO;
import com.unq.copistas.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findAllByTituloContaining(String titulo);


    @Query("select new com.unq.copistas.controller.dtos.DashboardCantidadPagadosDTO("+
            "SUM(CASE WHEN a.pagado=true then 1 else 0 END),"+
            "SUM(CASE WHEN a.pagado=false then 1 else 0 END)"+
            ") from Libro a")
    DashboardCantidadPagadosDTO DashboardDTOCountbyLibrosPagados();
}
