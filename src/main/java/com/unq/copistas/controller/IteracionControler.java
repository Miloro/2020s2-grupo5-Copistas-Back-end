package com.unq.copistas.controller;

import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Iteracion;
import com.unq.copistas.service.IteracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class IteracionControler {

    @Autowired
    private IteracionService iteracionService;

    @PutMapping("/iteracion/completar/{id}")
    public ResponseEntity<Iteracion> completarIteracionConElID(@PathVariable(value = "id") Long iteracionId) throws ResourceNotFoundException {
        Iteracion iteracion = iteracionService.completarIteracionConElID(iteracionId);
        return ResponseEntity.ok().body(iteracion);
    }

}
