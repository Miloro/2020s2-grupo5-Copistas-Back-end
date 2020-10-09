package com.unq.copistas.service;

import com.unq.copistas.controller.dtos.DashboardNivelCegueraDTO;
import com.unq.copistas.controller.dtos.DashboardSexoDTO;
import com.unq.copistas.exception.ResourceNotFoundException;
import com.unq.copistas.model.Cliente;
import com.unq.copistas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Transactional
    public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Transactional
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Transactional
    public Cliente getClientePorId(long clienteId)  throws ResourceNotFoundException {
        return clienteRepository.findById(clienteId).orElseThrow(() -> new ResourceNotFoundException("cliente no encontrado con la id" + clienteId));

    }


    public Cliente updateCliente(Long clienteId, Cliente clienteDetails) throws ResourceNotFoundException {
        Cliente cliente =
                clienteRepository
                        .findById(clienteId)
                        .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con la id :: " + clienteId));

        cliente.setNombre(clienteDetails.getNombre());
        cliente.setApellido(clienteDetails.getApellido());
        cliente.setDni(clienteDetails.getDni());
        cliente.setCuilORcuit(clienteDetails.getCuilORcuit());
        cliente.setDomicilio(clienteDetails.getDomicilio());
        cliente.setCiudad(clienteDetails.getCiudad());
        cliente.setProvincia(clienteDetails.getProvincia());
        cliente.setTelefonoFijo(cliente.getTelefonoMovil());
        cliente.setTelefonoMovil(clienteDetails.getTelefonoMovil());
        cliente.setCorreoElectronico(clienteDetails.getCorreoElectronico());
        cliente.setFechaDeNacimiento(clienteDetails.getFechaDeNacimiento());
        cliente.setSexo(clienteDetails.getSexo());
        cliente.setNivelDiscapacidadVisual(clienteDetails.getNivelDiscapacidadVisual());
        return clienteRepository.save(cliente);

    }


    public Cliente deleteCliente(Long clienteId) throws  ResourceNotFoundException{
        Cliente cliente = clienteRepository.findById(clienteId).orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con la id" + clienteId));
        clienteRepository.delete(cliente);
        return cliente;

    }

    @Transactional
    public List<Cliente> buscarClientePorDni(Integer dni) {
        return clienteRepository.findAllByDni(dni);
    }

    public DashboardSexoDTO getCantidadDeClientesPorSexo() {
        return clienteRepository.DashboardDTOCountbySexo();
    }


    public DashboardNivelCegueraDTO getCantidadDeNivelesDeCeguera() {
        return clienteRepository.DashboardDTOCountbyNivelCeguera();
    }
}
