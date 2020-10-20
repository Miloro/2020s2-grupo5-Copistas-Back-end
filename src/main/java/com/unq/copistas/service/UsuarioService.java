package com.unq.copistas.service;

import com.unq.copistas.model.Cliente;
import com.unq.copistas.model.Usuario;
import com.unq.copistas.repository.ClienteRepository;
import com.unq.copistas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class UsuarioService {

        @Autowired
        UsuarioRepository userRepository;

        @Transactional
        public Usuario createUsuario(Usuario user){
            return userRepository.save(user);
        }
}
