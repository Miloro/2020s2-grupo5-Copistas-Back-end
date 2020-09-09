package com.unq.copistas.controller;

import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Hoja;
import com.unq.copistas.service.HojaService;
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

    @PostMapping("/hojaderuta")
    public Hoja crearHojaDeRuta(@Valid @RequestBody Hoja hoja){
        return hojaService.crearHojaDeRuta(hoja);
    }

    @GetMapping("/hojaderutas")
    public List<Hoja> getAllHojaDeRutas(){
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
        System.out.print(hojaDeRutaId);
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
}
