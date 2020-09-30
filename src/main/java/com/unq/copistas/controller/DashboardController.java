package com.unq.copistas.controller;


import com.unq.copistas.controller.dtos.DashboardSexoDTO;
import com.unq.copistas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class DashboardController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/dashboard")
    public DashboardSexoDTO getDashboard(){
        return clienteService.getCantidadDeClientesFemeninos();

    }
}
