package com.unq.copistas.service;


import com.unq.copistas.controller.dtos.DashboardCantidadDeLibrosIdiomaDTO;
import com.unq.copistas.controller.dtos.DashboardCantidadDeLibrosRetiradosDTO;
import com.unq.copistas.controller.dtos.DashboardCantidadPagadosDTO;
import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Libro;
import com.unq.copistas.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Transactional
    public Libro crearLibro(Libro libro){
        return libroRepository.save(libro);
    }

    @Transactional
    public List<Libro> getAllLibros(){
        return libroRepository.findAll();
    }

    @Transactional
    public Libro getLibroById(Long libroId) throws ResourceNotFoundException {
        Libro libro = libroRepository.findById(libroId).orElseThrow(() -> new ResourceNotFoundException("libro no encontrado con la id" + libroId));
        return libro;

    }

    @Transactional
    public Libro updatelibro(Long libroId, Libro libroDetails) throws ResourceNotFoundException {
        Libro libro =
                libroRepository
                        .findById(libroId)
                        .orElseThrow(() -> new ResourceNotFoundException("Libro no encontrado con la id :: " + libroId));

        libro.setTitulo(libroDetails.getTitulo());
        libro.setNombreAutor(libroDetails.getNombreAutor());
        libro.setApellidoAutor(libroDetails.getApellidoAutor());
        libro.setEditorial(libroDetails.getEditorial());
        libro.setEdicion(libroDetails.getEdicion());
        libro.setIdioma(libroDetails.getIdioma());
        libro.setCategoria(libroDetails.getCategoria());
        libro.setPagado(libroDetails.getPagado());
        libro.setRetirado(libroDetails.getRetirado());
        final Libro updatedLibro = libroRepository.save(libro);
        return updatedLibro;
    }

    @Transactional
    public Libro deleteLibro(Long libroId) throws ResourceNotFoundException {
        Libro libro = libroRepository.findById(libroId).orElseThrow(()-> new ResourceNotFoundException("Libro no encontrado con la id " + libroId));
        libroRepository.delete(libro);
        return libro;
    }

    @Transactional
    public List<Libro> buscarLibroPorTitulo(String titulo) {
        List<Libro> libros = libroRepository.findAllByTituloContaining(titulo);
        return libros;
    }

    @Transactional
    public DashboardCantidadPagadosDTO getCantidadDeLibrosPagados() {
        return libroRepository.DashboardDTOCountbyLibrosPagados();
    }

    public DashboardCantidadDeLibrosRetiradosDTO getCantidadDeLibrosRetirados() {
        return libroRepository.DashboardDTOCountbyLibrosRetirados();
    }

    public DashboardCantidadDeLibrosIdiomaDTO getCantidadDeLibrosPorIdioma() {
        return libroRepository.DashboardDTOCountbyLibrosIdioma();
    }
}
