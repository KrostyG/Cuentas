package com.example.BancoAutenticacion.controlador;

import com.example.BancoAutenticacion.Entidad.Cuenta;
import com.example.BancoAutenticacion.repositorio.CuentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaControlador {
    @Autowired
    CuentaRepositorio cuentaRepositorio;

    @GetMapping("/verCuentas")
    public List<Cuenta>verCuentas(){return cuentaRepositorio.cuentaList();}
}
