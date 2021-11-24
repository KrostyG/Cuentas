package com.example.BancoAutenticacion.servicio;

import com.example.BancoAutenticacion.Entidad.Cuenta;
import com.example.BancoAutenticacion.Entidad.Usuario;
import com.example.BancoAutenticacion.repositorio.CuentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaServicio {
    @Autowired
    CuentaRepositorio cuentaRepositorio;

    public boolean crearNuevaCuenta(Cuenta cuenta){
        return cuentaRepositorio.crearNuevaCuenta(cuenta);
    }
}
