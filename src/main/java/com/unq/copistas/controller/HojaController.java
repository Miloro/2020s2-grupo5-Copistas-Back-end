package com.unq.copistas.controller;

import com.unq.copistas.controller.dtos.HojaDTO;
import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.*;
import com.unq.copistas.security.service.UsuarioService;
import com.unq.copistas.service.ClienteService;
import com.unq.copistas.service.HojaService;
import com.unq.copistas.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/api")
public class HojaController {

    @Autowired
    private HojaService hojaService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private LibroService libroService;

    @Autowired
    private UsuarioService usuarioService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/hojaderuta")
    public Hoja crearHojaDeRuta(@Valid @RequestBody HojaDTO hojaDTO) throws ResourceNotFoundException {


        Cliente destinatario =  clienteService.getClientePorId(hojaDTO.getDestinatario_id());
        Cliente solicitante =  clienteService.getClientePorId(hojaDTO.getSolicitante_id());
        Libro libro = libroService.getLibroById(hojaDTO.getLibro_id());

        Hoja hojaNueva = new Hoja(solicitante,destinatario,libro);

        return hojaService.crearHojaDeRuta(hojaNueva);
    }

    @GetMapping("/hojaderutas")
    public List<Hoja> getAllHojaDeRutas()
    {
        return hojaService.getAllHojaDeRutas();

    }

    @GetMapping("hojaderuta/{id}")
    public ResponseEntity<Hoja> getHojaDeRutaPorId(@PathVariable(value = "id") Long hojaDeRutaId) throws ResourceNotFoundException {
        Hoja hoja = hojaService.getUserById(hojaDeRutaId);
        return ResponseEntity.ok().body(hoja);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/hojaderuta/{id}")
    public ResponseEntity<Hoja> updateHojaDeRuta(
            @PathVariable(value = "id") Long hojaDeRutaId,
            @Valid @RequestBody Hoja hojaDetails)
            throws ResourceNotFoundException {
        final Hoja updatedHoja = hojaService.updatehojaDeRuta(hojaDeRutaId, hojaDetails);
        return ResponseEntity.ok(updatedHoja);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/hojaderuta/{id}")
    public Map<String,Boolean> deleteHojaDeRuta(@PathVariable(value = "id") Long hojaDeRutaId) throws  Exception{
        Hoja hoja = hojaService.deleteHojaDeRuta(hojaDeRutaId);
        Map<String,Boolean> response  = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("hojaderuta/libro/{id}")
    public ResponseEntity<Hoja> buscarHojaDeRutaPorIdDeLibro(@PathVariable(value = "id") Long libroId){
        Hoja hoja = hojaService.buscarHojaDeRutaPorIdDeLibro(libroId);
        return ResponseEntity.ok().body(hoja);
    }

    @GetMapping("hojaderuta/libro")
    public ResponseEntity<Hoja> buscarHojaDeRutaPorIdDeLibro(@RequestParam(value="titulo") String titulo){
        Hoja hoja = hojaService.getHojaPorTituloLibro(titulo);
        return ResponseEntity.ok().body(hoja);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/hojaderuta/historial/{id}")
    public ResponseEntity<Hoja> updateHistorialHojaDeRuta(
            @PathVariable(value = "id") Long hojaDeRutaId,
            @Valid @RequestBody Iteracion nuevaIteracion)
            throws ResourceNotFoundException {
        if(usuarioService.existsByNombreUsuario(nuevaIteracion.getPersonaEncargada())){
            nuevaIteracion.setTareaTerminada(false);
            final Hoja updatedHoja = hojaService.updateHistorialHojaDeRuta(hojaDeRutaId, nuevaIteracion);
            return ResponseEntity.ok(updatedHoja);
        }else{
            return new ResponseEntity(new Mensaje("no existe un colaborador con ese nombre"), HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/hojaderuta/historial/colaborador")
    public List<Hoja> getTareasAsignadasAlColaborador(
            @RequestParam(value="usuario") String usuarioColaborador){
            return hojaService.getTareasAsignadasAlColaborador(usuarioColaborador);
    }

}
