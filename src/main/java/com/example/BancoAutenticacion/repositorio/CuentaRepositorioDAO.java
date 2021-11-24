package com.example.BancoAutenticacion.repositorio;

import com.example.BancoAutenticacion.Entidad.Cuenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CuentaRepositorioDAO extends CrudRepository<Cuenta,Integer> {

    List<Cuenta> findCuentaByIdUsuario(Integer idUsuario);

}

