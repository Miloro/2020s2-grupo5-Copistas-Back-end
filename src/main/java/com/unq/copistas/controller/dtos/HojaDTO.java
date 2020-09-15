package com.unq.copistas.controller.dtos;

import com.unq.copistas.model.Cliente;
import com.unq.copistas.model.Iteracion;
import com.unq.copistas.model.Libro;
import com.unq.copistas.model.Sexo;

import java.time.LocalDate;
import java.util.List;

public class HojaDTO {

    private String solicitanteNombre;
    private String solicitanteApellido;
    private Integer solicitanteDni;
    private Integer solicitanteCuilORcuit;
    private String solicitanteDomicilio;
    private String solicitanteCiudad;
    private String solicitanteProvincia;
    private Integer solicitanteTelefonoFijo;
    private Integer solicitanteTelefonoMovil;
    private String solicitanteCorreoElectronico;
    private LocalDate solicitanteFechaDeNacimiento;
    private Sexo solicitanteSexo;
    private String solicitanteNivelDiscapacidadVisual;
    private String destinatarioNombre;

    private String destinatarioApellido;
    private Integer destinatarioDni;
    private Integer destinatarioCuilORcuit;
    private String destinatarioDomicilio;
    private String destinatarioCiudad;
    private String destinatarioProvincia;
    private Integer destinatarioTelefonoFijo;
    private Integer destinatarioTelefonoMovil;
    private String destinatarioCorreoElectronico;
    private LocalDate destinatarioFechaDeNacimiento;
    private Sexo destinatarioSexo;
    private String destinatarioNivelDiscapacidadVisual;
    private String libroTitulo;

    private String libroNombreAutor;
    private String libroApellidoAutor;
    private String libroEditorial;
    private String libroEdicion;
    private String libroIdioma;
    private String libroCategoria;
    private List<Iteracion> historialDeEstado;

    public HojaDTO(String solicitanteNombre, String solicitanteApellido, Integer solicitanteDni, Integer solicitanteCuilORcuit, String solicitanteDomicilio, String solicitanteCiudad, String solicitanteProvincia, Integer solicitanteTelefonoFijo, Integer solicitanteTelefonoMovil, String solicitanteCorreoElectronico, LocalDate solicitanteFechaDeNacimiento, Sexo solicitanteSexo, String solicitanteNivelDiscapacidadVisual, String destinatarioNombre, String destinatarioApellido, Integer destinatarioDni, Integer destinatarioCuilORcuit, String destinatarioDomicilio, String destinatarioCiudad, String destinatarioProvincia, Integer destinatarioTelefonoFijo, Integer destinatarioTelefonoMovil, String destinatarioCorreoElectronico, LocalDate destinatarioFechaDeNacimiento, Sexo destinatarioSexo, String destinatarioNivelDiscapacidadVisual, String libroTitulo, String libroNombreAutor, String libroApellidoAutor, String libroEditorial, String libroEdicion, String libroIdioma, String libroCategoria, List<Iteracion> historialDeEstado) {
        this.solicitanteNombre = solicitanteNombre;
        this.solicitanteApellido = solicitanteApellido;
        this.solicitanteDni = solicitanteDni;
        this.solicitanteCuilORcuit = solicitanteCuilORcuit;
        this.solicitanteDomicilio = solicitanteDomicilio;
        this.solicitanteCiudad = solicitanteCiudad;
        this.solicitanteProvincia = solicitanteProvincia;
        this.solicitanteTelefonoFijo = solicitanteTelefonoFijo;
        this.solicitanteTelefonoMovil = solicitanteTelefonoMovil;
        this.solicitanteCorreoElectronico = solicitanteCorreoElectronico;
        this.solicitanteFechaDeNacimiento = solicitanteFechaDeNacimiento;
        this.solicitanteSexo = solicitanteSexo;
        this.solicitanteNivelDiscapacidadVisual = solicitanteNivelDiscapacidadVisual;
        this.destinatarioNombre = destinatarioNombre;
        this.destinatarioApellido = destinatarioApellido;
        this.destinatarioDni = destinatarioDni;
        this.destinatarioCuilORcuit = destinatarioCuilORcuit;
        this.destinatarioDomicilio = destinatarioDomicilio;
        this.destinatarioCiudad = destinatarioCiudad;
        this.destinatarioProvincia = destinatarioProvincia;
        this.destinatarioTelefonoFijo = destinatarioTelefonoFijo;
        this.destinatarioTelefonoMovil = destinatarioTelefonoMovil;
        this.destinatarioCorreoElectronico = destinatarioCorreoElectronico;
        this.destinatarioFechaDeNacimiento = destinatarioFechaDeNacimiento;
        this.destinatarioSexo = destinatarioSexo;
        this.destinatarioNivelDiscapacidadVisual = destinatarioNivelDiscapacidadVisual;
        this.libroTitulo = libroTitulo;
        this.libroNombreAutor = libroNombreAutor;
        this.libroApellidoAutor = libroApellidoAutor;
        this.libroEditorial = libroEditorial;
        this.libroEdicion = libroEdicion;
        this.libroIdioma = libroIdioma;
        this.libroCategoria = libroCategoria;
        this.historialDeEstado = historialDeEstado;
    }

    public HojaDTO() {
    }

    public String getSolicitanteNombre() {
        return solicitanteNombre;
    }

    public void setSolicitanteNombre(String solicitanteNombre) {
        this.solicitanteNombre = solicitanteNombre;
    }

    public String getSolicitanteApellido() {
        return solicitanteApellido;
    }

    public void setSolicitanteApellido(String solicitanteApellido) {
        this.solicitanteApellido = solicitanteApellido;
    }

    public Integer getSolicitanteDni() {
        return solicitanteDni;
    }

    public void setSolicitanteDni(Integer solicitanteDni) {
        this.solicitanteDni = solicitanteDni;
    }

    public Integer getSolicitanteCuilORcuit() {
        return solicitanteCuilORcuit;
    }

    public void setSolicitanteCuilORcuit(Integer solicitanteCuilORcuit) {
        this.solicitanteCuilORcuit = solicitanteCuilORcuit;
    }

    public String getSolicitanteDomicilio() {
        return solicitanteDomicilio;
    }

    public void setSolicitanteDomicilio(String solicitanteDomicilio) {
        this.solicitanteDomicilio = solicitanteDomicilio;
    }

    public String getSolicitanteCiudad() {
        return solicitanteCiudad;
    }

    public void setSolicitanteCiudad(String solicitanteCiudad) {
        this.solicitanteCiudad = solicitanteCiudad;
    }

    public String getSolicitanteProvincia() {
        return solicitanteProvincia;
    }

    public void setSolicitanteProvincia(String solicitanteProvincia) {
        this.solicitanteProvincia = solicitanteProvincia;
    }

    public Integer getSolicitanteTelefonoFijo() {
        return solicitanteTelefonoFijo;
    }

    public void setSolicitanteTelefonoFijo(Integer solicitanteTelefonoFijo) {
        this.solicitanteTelefonoFijo = solicitanteTelefonoFijo;
    }

    public Integer getSolicitanteTelefonoMovil() {
        return solicitanteTelefonoMovil;
    }

    public void setSolicitanteTelefonoMovil(Integer solicitanteTelefonoMovil) {
        this.solicitanteTelefonoMovil = solicitanteTelefonoMovil;
    }

    public String getSolicitanteCorreoElectronico() {
        return solicitanteCorreoElectronico;
    }

    public void setSolicitanteCorreoElectronico(String solicitanteCorreoElectronico) {
        this.solicitanteCorreoElectronico = solicitanteCorreoElectronico;
    }

    public LocalDate getSolicitanteFechaDeNacimiento() {
        return solicitanteFechaDeNacimiento;
    }

    public void setSolicitanteFechaDeNacimiento(LocalDate solicitanteFechaDeNacimiento) {
        this.solicitanteFechaDeNacimiento = solicitanteFechaDeNacimiento;
    }

    public Sexo getSolicitanteSexo() {
        return solicitanteSexo;
    }

    public void setSolicitanteSexo(Sexo solicitanteSexo) {
        this.solicitanteSexo = solicitanteSexo;
    }

    public String getSolicitanteNivelDiscapacidadVisual() {
        return solicitanteNivelDiscapacidadVisual;
    }

    public void setSolicitanteNivelDiscapacidadVisual(String solicitanteNivelDiscapacidadVisual) {
        this.solicitanteNivelDiscapacidadVisual = solicitanteNivelDiscapacidadVisual;
    }

    public String getDestinatarioNombre() {
        return destinatarioNombre;
    }

    public void setDestinatarioNombre(String destinatarioNombre) {
        this.destinatarioNombre = destinatarioNombre;
    }

    public String getDestinatarioApellido() {
        return destinatarioApellido;
    }

    public void setDestinatarioApellido(String destinatarioApellido) {
        this.destinatarioApellido = destinatarioApellido;
    }

    public Integer getDestinatarioDni() {
        return destinatarioDni;
    }

    public void setDestinatarioDni(Integer destinatarioDni) {
        this.destinatarioDni = destinatarioDni;
    }

    public Integer getDestinatarioCuilORcuit() {
        return destinatarioCuilORcuit;
    }

    public void setDestinatarioCuilORcuit(Integer destinatarioCuilORcuit) {
        this.destinatarioCuilORcuit = destinatarioCuilORcuit;
    }

    public String getDestinatarioDomicilio() {
        return destinatarioDomicilio;
    }

    public void setDestinatarioDomicilio(String destinatarioDomicilio) {
        this.destinatarioDomicilio = destinatarioDomicilio;
    }

    public String getDestinatarioCiudad() {
        return destinatarioCiudad;
    }

    public void setDestinatarioCiudad(String destinatarioCiudad) {
        this.destinatarioCiudad = destinatarioCiudad;
    }

    public String getDestinatarioProvincia() {
        return destinatarioProvincia;
    }

    public void setDestinatarioProvincia(String destinatarioProvincia) {
        this.destinatarioProvincia = destinatarioProvincia;
    }

    public Integer getDestinatarioTelefonoFijo() {
        return destinatarioTelefonoFijo;
    }

    public void setDestinatarioTelefonoFijo(Integer destinatarioTelefonoFijo) {
        this.destinatarioTelefonoFijo = destinatarioTelefonoFijo;
    }

    public Integer getDestinatarioTelefonoMovil() {
        return destinatarioTelefonoMovil;
    }

    public void setDestinatarioTelefonoMovil(Integer destinatarioTelefonoMovil) {
        this.destinatarioTelefonoMovil = destinatarioTelefonoMovil;
    }

    public String getDestinatarioCorreoElectronico() {
        return destinatarioCorreoElectronico;
    }

    public void setDestinatarioCorreoElectronico(String destinatarioCorreoElectronico) {
        this.destinatarioCorreoElectronico = destinatarioCorreoElectronico;
    }

    public LocalDate getDestinatarioFechaDeNacimiento() {
        return destinatarioFechaDeNacimiento;
    }

    public void setDestinatarioFechaDeNacimiento(LocalDate destinatarioFechaDeNacimiento) {
        this.destinatarioFechaDeNacimiento = destinatarioFechaDeNacimiento;
    }

    public Sexo getDestinatarioSexo() {
        return destinatarioSexo;
    }

    public void setDestinatarioSexo(Sexo destinatarioSexo) {
        this.destinatarioSexo = destinatarioSexo;
    }

    public String getDestinatarioNivelDiscapacidadVisual() {
        return destinatarioNivelDiscapacidadVisual;
    }

    public void setDestinatarioNivelDiscapacidadVisual(String destinatarioNivelDiscapacidadVisual) {
        this.destinatarioNivelDiscapacidadVisual = destinatarioNivelDiscapacidadVisual;
    }

    public String getLibroTitulo() {
        return libroTitulo;
    }

    public void setLibroTitulo(String libroTitulo) {
        this.libroTitulo = libroTitulo;
    }

    public String getLibroNombreAutor() {
        return libroNombreAutor;
    }

    public void setLibroNombreAutor(String libroNombreAutor) {
        this.libroNombreAutor = libroNombreAutor;
    }

    public String getLibroApellidoAutor() {
        return libroApellidoAutor;
    }

    public void setLibroApellidoAutor(String libroApellidoAutor) {
        this.libroApellidoAutor = libroApellidoAutor;
    }

    public String getLibroEditorial() {
        return libroEditorial;
    }

    public void setLibroEditorial(String libroEditorial) {
        this.libroEditorial = libroEditorial;
    }

    public String getLibroEdicion() {
        return libroEdicion;
    }

    public void setLibroEdicion(String libroEdicion) {
        this.libroEdicion = libroEdicion;
    }

    public String getLibroIdioma() {
        return libroIdioma;
    }

    public void setLibroIdioma(String libroIdioma) {
        this.libroIdioma = libroIdioma;
    }

    public String getLibroCategoria() {
        return libroCategoria;
    }

    public void setLibroCategoria(String libroCategoria) {
        this.libroCategoria = libroCategoria;
    }

    public List<Iteracion> getHistorialDeEstado() {
        return historialDeEstado;
    }

    public void setHistorialDeEstado(List<Iteracion> historialDeEstado) {
        this.historialDeEstado = historialDeEstado;
    }

    public Cliente getSolicitanteConverted(){

        return new Cliente(
                solicitanteNombre,
                solicitanteApellido,
                solicitanteDni,
                solicitanteCuilORcuit,
                solicitanteDomicilio,
                solicitanteCiudad,
                solicitanteProvincia,
                solicitanteTelefonoFijo,
                solicitanteTelefonoMovil,
                solicitanteCorreoElectronico,
                solicitanteFechaDeNacimiento,
                solicitanteSexo,
                solicitanteNivelDiscapacidadVisual);
    }

    public void setSolicitante(Cliente cliente) {
        this.setSolicitanteNombre(cliente.getNombre());
        this.setSolicitanteApellido(cliente.getApellido());
        this.setSolicitanteDni(cliente.getDni());
        this.setSolicitanteCuilORcuit(cliente.getCuilORcuit());
        this.setSolicitanteDomicilio(cliente.getDomicilio());
        this.setSolicitanteCiudad(cliente.getCiudad());
        this.setSolicitanteProvincia(cliente.getProvincia());
        this.setSolicitanteTelefonoFijo(cliente.getTelefonoFijo());
        this.setSolicitanteTelefonoMovil(cliente.getTelefonoMovil());
        this.setSolicitanteCorreoElectronico(cliente.getCorreoElectronico());
        this.setSolicitanteFechaDeNacimiento(cliente.getFechaDeNacimiento());
        this.setSolicitanteSexo(cliente.getSexo());
        this.setSolicitanteNivelDiscapacidadVisual(cliente.getNivelDiscapacidadVisual());
    }

    public Cliente getDestinatarioConverted(){

        return new Cliente(
                destinatarioNombre,
                destinatarioApellido,
                destinatarioDni,
                destinatarioCuilORcuit,
                destinatarioDomicilio,
                destinatarioCiudad,
                destinatarioProvincia,
                destinatarioTelefonoFijo,
                destinatarioTelefonoMovil,
                destinatarioCorreoElectronico,
                destinatarioFechaDeNacimiento,
                destinatarioSexo,
                destinatarioNivelDiscapacidadVisual);
    }

    public void setDestinatario(Cliente cliente) {
        this.setDestinatarioNombre(cliente.getNombre());
        this.setDestinatarioApellido(cliente.getApellido());
        this.setDestinatarioDni(cliente.getDni());
        this.setDestinatarioCuilORcuit(cliente.getCuilORcuit());
        this.setDestinatarioDomicilio(cliente.getDomicilio());
        this.setDestinatarioCiudad(cliente.getCiudad());
        this.setDestinatarioProvincia(cliente.getProvincia());
        this.setDestinatarioTelefonoFijo(cliente.getTelefonoFijo());
        this.setDestinatarioTelefonoMovil(cliente.getTelefonoMovil());
        this.setDestinatarioCorreoElectronico(cliente.getCorreoElectronico());
        this.setDestinatarioFechaDeNacimiento(cliente.getFechaDeNacimiento());
        this.setDestinatarioSexo(cliente.getSexo());
        this.setDestinatarioNivelDiscapacidadVisual(cliente.getNivelDiscapacidadVisual());
    }

    public Libro getLibroConverted(){
        return new Libro(
                libroTitulo,
                libroNombreAutor,
                libroApellidoAutor,
                libroEditorial,
                libroEdicion,
                libroIdioma,
                libroCategoria
        );
    }

    public void setLibro(Libro libro) {
        this.setLibroTitulo(libro.getTitulo());
        this.setLibroNombreAutor(libro.getNombreAutor());
        this.setLibroApellidoAutor(libro.getApellidoAutor());
        this.setLibroEditorial(libro.getEditorial());
        this.setLibroEdicion(libro.getEdicion());
        this.setLibroIdioma(libro.getIdioma());
        this.setLibroCategoria(libro.getCategoria());
    }

}
