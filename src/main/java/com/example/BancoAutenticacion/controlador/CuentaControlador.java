package com.example.BancoAutenticacion.controlador;

import com.example.BancoAutenticacion.Entidad.Cuenta;
import com.example.BancoAutenticacion.Entidad.Usuario;
import com.example.BancoAutenticacion.servicio.CuentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.BancoAutenticacion.repositorio.CuentaRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaControlador {
    @Autowired
    CuentaServicio cuentaServicio;
    @Autowired
    CuentaRepositorio cuentaRepositorio;

    @PostMapping("/crear")
    public ResponseEntity<String> crearNuevaCuenta(@RequestBody Cuenta cuenta) {
        if (cuentaServicio.crearNuevaCuenta(cuenta)){
            return new ResponseEntity<>("Transaccion Finalizada", HttpStatus.OK);
        }
        return new ResponseEntity<>("Transaccion Fallida", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/verCuentas")
    public List<Cuenta>verCuentas(){return cuentaRepositorio.cuentaList();}
}
