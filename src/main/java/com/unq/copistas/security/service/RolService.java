package com.unq.copistas.security.service;

import com.unq.copistas.security.entity.Rol;
import com.unq.copistas.security.enums.RolNombre;
import com.unq.copistas.security.repository.RolRepository;
import com.unq.copistas.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
       return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
