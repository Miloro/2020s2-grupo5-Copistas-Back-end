package com.unq.copistas.model;

import com.unq.copistas.model.enums.Idioma;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "libros")
@EntityListeners(AuditingEntityListener.class)
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String titulo;
    private String nombreAutor;
    private String apellidoAutor;
    private String editorial;
    private String edicion;
    @Enumerated(EnumType.STRING)
    private Idioma idioma;
    private String categoria;

    private boolean retirado;

    private boolean pagado;


    public Libro( String titulo, String nombreAutor, String apellidoAutor, String editorial, String edicion, Idioma idioma, String categoria, boolean retirado, boolean pagado) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.idioma = idioma;
        this.categoria = categoria;
        this.retirado = retirado;
        this.pagado = pagado;
    }

    public Libro() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isRetirado() {
        return retirado;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}
