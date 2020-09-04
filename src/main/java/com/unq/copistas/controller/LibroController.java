package com.unq.copistas.controller;

import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Libro;
import com.unq.copistas.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
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

    @DeleteMapping("/libro/{id}")
    public Map<String,Boolean> deleteLibro(@PathVariable(value = "id") Long libroId) throws  Exception{
        Libro libro = libroService.deleteLibro(libroId);
        Map<String,Boolean> response  = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("/libro")
    public List<Libro> buscarLibroPorNombre(@RequestParam(value="titulo") String titulo){
        return libroService.buscarLibroPorTitulo(titulo);
    }
}
