package com.unq.copistas.service;

import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.*;
import com.unq.copistas.repository.HojaDeRutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class HojaService {


    @Autowired
    private HojaDeRutaRepository hojaDeRutaRepository;

    @Transactional
    public Hoja crearHojaDeRuta(Hoja hoja){
        return hojaDeRutaRepository.save(hoja);
    }

    @Transactional
    public List<Hoja> getAllHojaDeRutas(){

        return hojaDeRutaRepository.findAll();
    }

    @Transactional
    public Hoja getUserById(Long hojaDeRutaId) throws ResourceNotFoundException {
        Hoja hoja = hojaDeRutaRepository.findById(hojaDeRutaId).orElseThrow(() -> new ResourceNotFoundException("hojaDeRuta no encontrado con la id" + hojaDeRutaId));
        return hoja;

    }

    @Transactional
    public Hoja updatehojaDeRuta(Long hojaDeRutaId, Hoja hojaDetails) throws ResourceNotFoundException {
        Hoja hoja =
                hojaDeRutaRepository
                        .findById(hojaDeRutaId)
                        .orElseThrow(() -> new ResourceNotFoundException("hojaDeRuta no encontrado con la id :: " + hojaDeRutaId));

        hoja.setSolicitante(hojaDetails.getSolicitante());
        hoja.setDestinatario(hojaDetails.getDestinatario());
        hoja.setLibro(hojaDetails.getLibro());
        hoja.setHistorialDeEstado(hojaDetails.getHistorialDeEstado());

        return  hojaDeRutaRepository.save(hoja);    }

    @Transactional
    public Hoja deleteHojaDeRuta(Long hojaDeRutaId) throws ResourceNotFoundException {
        Hoja hoja = hojaDeRutaRepository.findById(hojaDeRutaId).orElseThrow(()-> new ResourceNotFoundException("hojaDeRuta no encontrado con la id " + hojaDeRutaId));
        hojaDeRutaRepository.delete(hoja);
        return hoja;
    }

}
