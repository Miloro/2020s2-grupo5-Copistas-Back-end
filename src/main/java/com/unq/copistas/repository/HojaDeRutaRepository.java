package com.unq.copistas.repository;

import com.unq.copistas.model.Hoja;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HojaDeRutaRepository extends JpaRepository<Hoja, Long> {
    Hoja findAllByLibro_Id(Long libroId);

    Hoja findHojaByLibro_Titulo(String titulo);
}
