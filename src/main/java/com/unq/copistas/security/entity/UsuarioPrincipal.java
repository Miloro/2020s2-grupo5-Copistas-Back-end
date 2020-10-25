package com.unq.copistas.security.entity;

import org.aspectj.lang.reflect.UnlockSignature;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//en esta clase van implementadas los privilegios de cada usuario
//esta clase implementa una interface del security core
//aqui lo que hace es convertir la clase roles en authorities que es una clase
//del nucleo de seguridad de springboot
//el usuario quizas puede ver productos y el admin podria crear o borrar
public class UsuarioPrincipal implements UserDetails {
    private String nombre;
    private String nombre_usuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UsuarioPrincipal(String nombre, String nombre_usuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal build(Usuario usuario){
        List<GrantedAuthority> authorities=
                usuario.getRoles().stream().map(rol-> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
            return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmail(), usuario.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return nombre_usuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
