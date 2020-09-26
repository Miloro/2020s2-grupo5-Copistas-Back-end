package com.unq.copistas.repository;

import com.unq.copistas.model.Hoja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HojaDeRutaRepository extends JpaRepository<Hoja, Long> {
    Hoja findAllByLibro_Id(Long libroId);
}
