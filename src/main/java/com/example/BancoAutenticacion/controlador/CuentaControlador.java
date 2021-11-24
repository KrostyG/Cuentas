package com.example.BancoAutenticacion.controlador;

import com.example.BancoAutenticacion.Configuracion.noExistenCuentas;
import com.example.BancoAutenticacion.Entidad.Cuenta;
import com.example.BancoAutenticacion.Entidad.Usuario;
import com.example.BancoAutenticacion.repositorio.CuentaRepositorio;
import com.example.BancoAutenticacion.repositorio.CuentaRepositorioDAO;
import com.example.BancoAutenticacion.servicio.UsuarioServicio;
import com.example.BancoAutenticacion.servicio.CuentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaControlador {
    @Autowired
    CuentaServicio cuentaServicio;
    @Autowired
    CuentaRepositorio cuentaRepositorio;
    @Autowired
    UsuarioServicio usuarioServicio;
    @Autowired
    CuentaRepositorioDAO cuentaRepositorioDAO;

    private List<Cuenta> listaCuenta;

    @PostMapping("/crear")
    public ResponseEntity<String> crearNuevaCuenta(@RequestBody Cuenta cuenta) {
        if (cuentaServicio.crearNuevaCuenta(cuenta)){
            return new ResponseEntity<>("Transaccion Finalizada", HttpStatus.OK);
        }
        return new ResponseEntity<>("Transaccion Fallida", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/cuentaByIdUsuario/{idUsuario}")
    public List<Cuenta> cuentaByIdUsuario(@PathVariable("idUsuario")Integer idUsuario) throws noExistenCuentas {
        listaCuenta=cuentaRepositorioDAO.findCuentaByIdUsuario(idUsuario);
        if (listaCuenta.isEmpty()){
            throw new noExistenCuentas();
        }
        return cuentaRepositorioDAO.findCuentaByIdUsuario(idUsuario);
    }

    @GetMapping("/verUsuarios")
    public List<Usuario> usuarioList(){return usuarioServicio.getUsuarios();}
}
