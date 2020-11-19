package com.unq.copistas.repository;

import com.unq.copistas.model.Hoja;
import com.unq.copistas.model.Iteracion;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HojaDeRutaRepository extends JpaRepository<Hoja, Long> {
    Hoja findAllByLibro_Id(Long libroId);

    Hoja findHojaByLibro_Titulo(String titulo);

    List<Hoja> findAllByHistorialDeEstado_PersonaEncargadaContainingAndHistorialDeEstado_TareaTerminadaFalse(String colaborador);

    //AndHistorialDeEstado_TareaTerminadaFalse


}
