package com.unq.copistas.repository;
import com.unq.copistas.controller.dtos.DashboardCantidadDeLibrosIdiomaDTO;
import com.unq.copistas.controller.dtos.DashboardCantidadDeLibrosRetiradosDTO;
import com.unq.copistas.controller.dtos.DashboardCantidadPagadosDTO;
import com.unq.copistas.model.Libro;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
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

    @Query("select new com.unq.copistas.controller.dtos.DashboardCantidadDeLibrosRetiradosDTO("+
            "SUM(CASE WHEN a.retirado=true then 1 else 0 END),"+
            "SUM(CASE WHEN a.retirado=false then 1 else 0 END)"+
            ") from Libro a")
    DashboardCantidadDeLibrosRetiradosDTO DashboardDTOCountbyLibrosRetirados();

    @Query("select new com.unq.copistas.controller.dtos.DashboardCantidadDeLibrosIdiomaDTO("+
            "SUM(CASE WHEN a.idioma='ESPAÑOL' then 1 else 0 END),"+
            "SUM(CASE WHEN a.idioma='INGLES' then 1 else 0 END),"+
            "SUM(CASE WHEN a.idioma='ITALIANO' then 1 else 0 END),"+
            "SUM(CASE WHEN a.idioma='ALEMAN' then 1 else 0 END),"+
            "SUM(CASE WHEN a.idioma='FRANCES' then 1 else 0 END),"+
            "SUM(CASE WHEN a.idioma='JAPONES' then 1 else 0 END),"+
            "SUM(CASE WHEN a.idioma='CHINO' then 1 else 0 END),"+
            "SUM(CASE WHEN a.idioma='HOLANDES' then 1 else 0 END)"+
            ") from Libro a")
    DashboardCantidadDeLibrosIdiomaDTO DashboardDTOCountbyLibrosIdioma();


}
