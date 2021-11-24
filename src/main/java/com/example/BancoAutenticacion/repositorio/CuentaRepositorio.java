package com.example.BancoAutenticacion.repositorio;

import com.example.BancoAutenticacion.Entidad.Cuenta;

import com.example.BancoAutenticacion.Entidad.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    public List<Cuenta> cuentaList(){return (List<Cuenta>)cuentaRepositorioDAO.findAll();}
}
