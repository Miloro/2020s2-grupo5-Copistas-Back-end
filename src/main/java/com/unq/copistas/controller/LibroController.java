package com.unq.copistas.controller;

import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Libro;
import com.unq.copistas.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("libro/{id}")
    public ResponseEntity<Libro> getLibroPorId(@PathVariable(value = "id") Long libroId) throws ResourceNotFoundException{
        Libro libro = libroService.getUserById(libroId);
        return ResponseEntity.ok().body(libro);
    }

    @PutMapping("/libro/{id}")
    public ResponseEntity<Libro> updateLibro(
            @PathVariable(value = "id") Long libroId,
            @Valid @RequestBody Libro libroDetails)
            throws ResourceNotFoundException {
        System.out.print(libroId);
        final Libro updatedLibro = libroService.updatelibro(libroId, libroDetails);
        return ResponseEntity.ok(updatedLibro);
    }
}
