package com.unq.copistas.controller.dtos;

import com.unq.copistas.model.enums.EstadoDeIteracion;

import java.time.LocalDate;

public class TareaAsignadaDTO {

    private long iteracion_id;
    private String iteracion_personaEncargada;
    private LocalDate iteracion_fechaAsignacion;
    private EstadoDeIteracion iteracion_tareaAsignada;
    private String libro_titulo;

    public TareaAsignadaDTO(long iteracion_id, String iteracion_personaEncargada, LocalDate iteracion_fechaAsignacion, EstadoDeIteracion iteracion_tareaAsignada, String libro_titulo) {
        this.iteracion_id = iteracion_id;
        this.iteracion_personaEncargada = iteracion_personaEncargada;
        this.iteracion_fechaAsignacion = iteracion_fechaAsignacion;
        this.iteracion_tareaAsignada = iteracion_tareaAsignada;
        this.libro_titulo = libro_titulo;
    }

    public long getIteracion_id() {
        return iteracion_id;
    }

    public void setIteracion_id(long iteracion_id) {
        this.iteracion_id = iteracion_id;
    }

    public String getIteracion_personaEncargada() {
        return iteracion_personaEncargada;
    }

    public void setIteracion_personaEncargada(String iteracion_personaEncargada) {
        this.iteracion_personaEncargada = iteracion_personaEncargada;
    }

    public LocalDate getIteracion_fechaAsignacion() {
        return iteracion_fechaAsignacion;
    }

    public void setIteracion_fechaAsignacion(LocalDate iteracion_fechaAsignacion) {
        this.iteracion_fechaAsignacion = iteracion_fechaAsignacion;
    }

    public EstadoDeIteracion getIteracion_tareaAsignada() {
        return iteracion_tareaAsignada;
    }

    public void setIteracion_tareaAsignada(EstadoDeIteracion iteracion_tareaAsignada) {
        this.iteracion_tareaAsignada = iteracion_tareaAsignada;
    }

    public String getLibro_titulo() {
        return libro_titulo;
    }

    public void setLibro_titulo(String libro_titulo) {
        this.libro_titulo = libro_titulo;
    }
}
