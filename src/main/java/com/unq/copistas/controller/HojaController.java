package com.unq.copistas.controller;

import com.unq.copistas.controller.dtos.HojaDTO;
import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Cliente;
import com.unq.copistas.model.Hoja;
import com.unq.copistas.model.Libro;
import com.unq.copistas.service.ClienteService;
import com.unq.copistas.service.HojaService;
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
public class HojaController {

    @Autowired
    private HojaService hojaService;

    @Autowired
    ClienteService clienteService;

    @Autowired
    LibroService libroService;


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

    @PutMapping("/hojaderuta/{id}")
    public ResponseEntity<Hoja> updateHojaDeRuta(
            @PathVariable(value = "id") Long hojaDeRutaId,
            @Valid @RequestBody Hoja hojaDetails)
            throws ResourceNotFoundException {
        final Hoja updatedHoja = hojaService.updatehojaDeRuta(hojaDeRutaId, hojaDetails);
        return ResponseEntity.ok(updatedHoja);
    }

    @DeleteMapping("/hojaderuta/{id}")
    public Map<String,Boolean> deleteHojaDeRuta(@PathVariable(value = "id") Long hojaDeRutaId) throws  Exception{
        Hoja hoja = hojaService.deleteHojaDeRuta(hojaDeRutaId);
        Map<String,Boolean> response  = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("hojaderuta/libro/{id}")
    public ResponseEntity<Hoja> buscarHojaDeRutaPorIdDeLibro(@PathVariable(value = "id") Long libroId)throws Exception{
        Hoja hoja = hojaService.buscarHojaDeRutaPorIdDeLibro(libroId);
        return ResponseEntity.ok().body(hoja);
    }
}
