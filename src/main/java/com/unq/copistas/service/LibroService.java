package com.unq.copistas.service;


import com.unq.copistas.model.Libro;
import com.unq.copistas.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public Libro crearLibro(Libro libro){
        return libroRepository.save(libro);
    }

    public List<Libro> getAllLibros(){
        return libroRepository.findAll();
    }



}
