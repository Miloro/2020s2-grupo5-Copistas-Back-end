package com.unq.copistas.service;

import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Iteracion;
import com.unq.copistas.repository.IteracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class IteracionService {

    @Autowired
    private IteracionRepository iteracionRepository;

    @Transactional
    public Iteracion completarIteracionConElID(Long iteracionID) throws ResourceNotFoundException {
        Iteracion iteracion = iteracionRepository.findById(iteracionID).orElseThrow(() -> new ResourceNotFoundException("no se encontro la iteracion con la id: "  + iteracionID));
        iteracion.setTareaTerminada(true);
        iteracionRepository.save(iteracion);
        return iteracion;
    }
}
