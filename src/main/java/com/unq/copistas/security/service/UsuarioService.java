package com.unq.copistas.security.service;


import com.unq.copistas.security.entity.Usuario;
import com.unq.copistas.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String emailUsuario){
        return usuarioRepository.existsByEmail(emailUsuario);
    }

    /*public void save(UsuarioRepository usuario){
        usuarioRepository.save(usuario);
    }*/
}