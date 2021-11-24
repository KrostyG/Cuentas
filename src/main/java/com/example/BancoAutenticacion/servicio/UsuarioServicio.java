package com.example.BancoAutenticacion.servicio;

import com.example.BancoAutenticacion.Entidad.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UsuarioServicio {
    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public List<Usuario> getUsuarios(){
        ResponseEntity<Usuario[]> response=
                restTemplate.getForEntity(
                        "http://localhost:8080/usuarios/verUsuarios",
                        Usuario[].class);
                Usuario[] usuario = response.getBody();
                List<Usuario> usuarios= Arrays.asList(usuario);
                return usuarios;
    }
}