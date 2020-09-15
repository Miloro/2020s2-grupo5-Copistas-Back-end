package com.unq.copistas.controller;

import com.unq.copistas.controller.dtos.HojaDTO;
import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Hoja;
import com.unq.copistas.service.ClienteService;
import com.unq.copistas.service.HojaService;
import com.unq.copistas.service.LibroService;
import org.modelmapper.ModelMapper;
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
    private ModelMapper modelMapper;

    @Autowired
    ClienteService clienteService;

    @Autowired
    LibroService libroService;


    @PostMapping("/hojaderuta")
    public HojaDTO crearHojaDeRuta(@Valid @RequestBody HojaDTO hojaDTO){
        Hoja hoja = convertToEntity(hojaDTO);
        clienteService.createCliente(hoja.getDestinatario());
        clienteService.createCliente(hoja.getSolicitante());
        libroService.crearLibro(hoja.getLibro());
        Hoja hojaCreated = hojaService.crearHojaDeRuta(hoja);
        return convertToDto(hojaCreated);
    }

    @GetMapping("/hojaderutas")
    public List<Hoja> getAllHojaDeRutas()
    {
        return hojaService.getAllHojaDeRutas();

    }

    @GetMapping("hojaderuta/{id}")
    public ResponseEntity<HojaDTO> getHojaDeRutaPorId(@PathVariable(value = "id") Long hojaDeRutaId) throws ResourceNotFoundException {
        HojaDTO hojaDTO = convertToDto(hojaService.getUserById(hojaDeRutaId));
        return ResponseEntity.ok().body(hojaDTO);
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

    private HojaDTO convertToDto(Hoja hoja) {
        HojaDTO hojaDTO = modelMapper.map(hoja, HojaDTO.class);
        hojaDTO.setSolicitante(hoja.getSolicitante());
        hojaDTO.setDestinatario(hoja.getDestinatario());
        hojaDTO.setLibro(hoja.getLibro());
        return hojaDTO;
    }

    private Hoja convertToEntity(HojaDTO hojaDTO) {
        Hoja hoja = modelMapper.map(hojaDTO, Hoja.class);
        hoja.setSolicitante(hojaDTO.getSolicitanteConverted());
        hoja.setDestinatario(hojaDTO.getDestinatarioConverted());
        hoja.setLibro(hojaDTO.getLibroConverted());
        return hoja;
    }
}
