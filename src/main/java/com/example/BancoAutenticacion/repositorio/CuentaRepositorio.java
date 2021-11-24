package com.example.BancoAutenticacion.repositorio;

import com.example.BancoAutenticacion.Entidad.Cuenta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Repository
public class CuentaRepositorio {
    @Autowired
    CuentaRepositorioDAO cuentaRepositorioDAO;

    private RestTemplate restTemplate = new RestTemplate();

    public boolean crearNuevaCuenta(Cuenta cuenta){
        try {
            Integer usuarioId = restTemplate.getForObject("http://localhost:8080/usuarios/enviarid", Integer.class);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
