package com.unq.copistas.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table()
@EntityListeners(AuditingEntityListener.class)
public class Hoja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Cliente solicitante;

    @OneToOne
    private Cliente destinatario;

    @OneToOne
    private Libro libro;

    @OneToMany(mappedBy = "hoja",cascade = CascadeType.ALL)
    private List<Iteracion> historialDeEstado = new ArrayList<>();


    public Hoja(Cliente solicitante, Cliente destinatario, Libro libro, List<Iteracion> historialDeEstado) {
        this.solicitante = solicitante;
        this.destinatario = destinatario;
        this.libro = libro;
        this.historialDeEstado = historialDeEstado;
    }

    public Hoja() {
    }

    public Hoja(Cliente solicitante, Cliente destinatario, Libro libro) {
        this.solicitante = solicitante;
        this.destinatario = destinatario;
        this.libro = libro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Cliente getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Cliente solicitante) {
        this.solicitante = solicitante;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Iteracion> getHistorialDeEstado() {
        return historialDeEstado;
    }

    public void setHistorialDeEstado(List<Iteracion> historialDeEstado) {
        this.historialDeEstado = historialDeEstado;
    }

    public void siguienteEstadoDeIteracion(Iteracion iteracion){
        historialDeEstado.add(iteracion);
    }
}
