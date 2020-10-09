package com.unq.copistas.controller;

import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Cliente;
import com.unq.copistas.service.ClienteService;
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
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/cliente")
    public Cliente createCliente(@Valid @RequestBody Cliente cliente){return clienteService.createCliente(cliente);}

    @GetMapping("/clientes")
    public List<Cliente> getAllClientes(){return clienteService.getAllClientes();}

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> getClientePorId(@PathVariable(value = "id") long clienteId) throws ResourceNotFoundException{
        Cliente cliente = clienteService.getClientePorId(clienteId);
        return ResponseEntity.ok().body(cliente);
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<Cliente> updateCliente(
            @PathVariable(value = "id") Long clienteId,
            @Valid @RequestBody Cliente clienteDetails)
            throws ResourceNotFoundException {
        System.out.print(clienteId);
        final Cliente updatedCliente = clienteService.updateCliente(clienteId, clienteDetails);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/cliente/{id}")
    public Map<String, Boolean> deleteCliente(@PathVariable (value = "id") Long clienteId) throws Exception{
        Cliente cliente = clienteService.deleteCliente(clienteId);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("/cliente")
    public List<Cliente> buscarClientePorDNI(@RequestParam(value="dni") Integer dni){
        return clienteService.buscarClientePorDni(dni);
    }
}
