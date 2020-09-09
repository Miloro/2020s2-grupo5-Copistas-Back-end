package com.unq.copistas.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "iteracion")
@EntityListeners(AuditingEntityListener.class)
public class Iteracion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String personaEncargada;

    private LocalDate fechaAsignacion;

    private EstadoDeIteracion tareaAsignada;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hoja hoja;

    public Iteracion(String personaEncargada, LocalDate fechaAsignacion, EstadoDeIteracion tareaAsignada) {
        this.personaEncargada = personaEncargada;
        this.fechaAsignacion = fechaAsignacion;
        this.tareaAsignada = tareaAsignada;
    }

    public Iteracion() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }

    public void setPersonaEncargada(String personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public EstadoDeIteracion getTareaAsignada() {
        return tareaAsignada;
    }

    public void setTareaAsignada(EstadoDeIteracion tareaAsignada) {
        this.tareaAsignada = tareaAsignada;
    }

    public Hoja getHoja() {
        return hoja;
    }

    public void setHoja(Hoja hoja) {
        this.hoja = hoja;
    }
}


