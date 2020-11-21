package com.unq.copistas.repository;

import com.unq.copistas.controller.dtos.TareaAsignadaDTO;
import com.unq.copistas.model.Hoja;
import com.unq.copistas.model.Iteracion;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HojaDeRutaRepository extends JpaRepository<Hoja, Long> {
    Hoja findAllByLibro_Id(Long libroId);

    Hoja findHojaByLibro_Titulo(String titulo);

    @Query("select new com.unq.copistas.controller.dtos.TareaAsignadaDTO("+
            "i.id,i.personaEncargada,i.fechaAsignacion,i.tareaAsignada,h.libro.titulo)"+
            "FROM Iteracion i JOIN i.hoja h WHERE i.personaEncargada = :colaborador and i.tareaTerminada = false")
    List<TareaAsignadaDTO> getTareasAsignadasPara(@Param("colaborador") String colaborador);


}
