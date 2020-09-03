package com.unq.copistas.controller;

import com.unq.copistas.model.Libro;
import com.unq.copistas.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping("/libro")
    public Libro crearLibro(@Valid @RequestBody Libro libro){
        return libroService.crearLibro(libro);
    }

    @GetMapping("/libros")
    public List<Libro> getAllLibros(){
        return libroService.getAllLibros();
    }
}
