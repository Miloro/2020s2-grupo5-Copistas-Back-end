package com.unq.copistas.controller;



import com.unq.copistas.model.Usuario;
import com.unq.copistas.service.UsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("user")
    public Usuario login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        String token = getJWTToken(username);
        Usuario user = new Usuario();
        user.setUserName(username);
        user.setToken(token);
        return user;
    }

    private String getJWTToken(String username) {
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                    .signWith(key).compact();

        return "Bearer " + token;
    }

    @PostMapping("/register")
    public Usuario crearUsuario(@Valid @RequestBody Usuario user){
        return  usuarioService.createUsuario(user);
    }



}
