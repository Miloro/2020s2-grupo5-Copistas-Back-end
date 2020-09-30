package com.unq.copistas.repository;

import com.unq.copistas.controller.dtos.DashboardNivelCegueraDTO;
import com.unq.copistas.controller.dtos.DashboardSexoDTO;
import com.unq.copistas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findAllByDni(Integer dni);
    @Query("select new com.unq.copistas.controller.dtos.DashboardSexoDTO("+
            "SUM(CASE WHEN a.sexo='MUJER' then 1 else 0 END),"+
            "SUM(CASE WHEN a.sexo='HOMBRE' then 1 else 0 END)"+
            ") from Cliente a")
    DashboardSexoDTO DashboardDTOCountbySexo();

    @Query("select new com.unq.copistas.controller.dtos.DashboardNivelCegueraDTO("+
            "SUM(CASE WHEN a.nivelDiscapacidadVisual='TOTAL' then 1 else 0 END),"+
            "SUM(CASE WHEN a.nivelDiscapacidadVisual='PARCIAL' then 1 else 0 END)"+
            ") from Cliente a")
    DashboardNivelCegueraDTO DashboardDTOCountbyNivelCeguera();
}
