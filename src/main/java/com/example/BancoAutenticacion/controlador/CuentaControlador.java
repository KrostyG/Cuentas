package com.example.BancoAutenticacion.controlador;

import com.example.BancoAutenticacion.Entidad.Cuenta;
import com.example.BancoAutenticacion.Entidad.Usuario;
import com.example.BancoAutenticacion.servicio.CuentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("/cuentas")
public class CuentaControlador {
    @Autowired
    CuentaServicio cuentaServicio;

    @PostMapping("/crear")
    public ResponseEntity<String> crearNuevaCuenta(@RequestBody Cuenta cuenta) {
        if (cuentaServicio.crearNuevaCuenta(cuenta)){
            return new ResponseEntity<>("Transaccion Finalizada", HttpStatus.OK);
        }
        return new ResponseEntity<>("Transaccion Fallida", HttpStatus.BAD_REQUEST);
    }
}
