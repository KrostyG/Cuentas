package com.example.BancoAutenticacion.repositorio;

import com.example.BancoAutenticacion.Entidad.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CuentaRepositorio {
    @Autowired
    CuentaRepositorioDAO cuentaRepositorioDAO;

    public List<Cuenta> cuentaList(){return (List<Cuenta>)cuentaRepositorioDAO.findAll();}
}
