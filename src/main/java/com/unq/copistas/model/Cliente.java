package com.unq.copistas.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;


@Entity
@Table(name = "clientes")
@EntityListeners(AuditingEntityListener.class)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer cuilORcuit;
    private String domicilio;
    private String ciudad;
    private String provincia;
    private Integer telefonoFijo;
    private Integer telefonoMovil;
    private String correoElectronico;
    private LocalDate fechaDeNacimiento;
    private Sexo sexo;
    private String nivelDiscapacidadVisual;

    public Cliente(){

    }

    public Cliente(long id, String nombre, String apellido, Integer dni, Integer cuilORcuit, String domicilio, String ciudad, String provincia, Integer telefonoFijo, Integer telefonoMovil, String correoElectronico, LocalDate  fechaDeNacimiento, Sexo sexo, String nivelDiscapacidadVisual) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuilORcuit = cuilORcuit;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.correoElectronico = correoElectronico;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.nivelDiscapacidadVisual = nivelDiscapacidadVisual;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCuilORcuit() {
        return cuilORcuit;
    }

    public void setCuilORcuit(Integer cuilORcuit) {
        this.cuilORcuit = cuilORcuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(Integer telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public Integer getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(Integer telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate  getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate  fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNivelDiscapacidadVisual() {
        return nivelDiscapacidadVisual;
    }

    public void setNivelDiscapacidadVisual(String nivelDiscapacidadVisual) {
        this.nivelDiscapacidadVisual = nivelDiscapacidadVisual;
    }
}

