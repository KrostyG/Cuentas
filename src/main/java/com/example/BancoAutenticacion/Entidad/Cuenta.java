package com.example.BancoAutenticacion.Entidad;

import javax.persistence.*;

@Entity
@Table(name = "cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCuenta;
    private Integer idUsuario;
    private String tipoCuenta;
    private String monedaCuenta;
    private double saldo;

    public Cuenta(Integer idCuenta, String tipoCuenta, String monedaCuenta, Integer idUsuario, double saldo) {
        this.idCuenta = idCuenta;
        this.tipoCuenta = tipoCuenta;
        this.monedaCuenta = monedaCuenta;
        this.idUsuario = idUsuario;
        this.saldo=saldo;
    }

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getMonedaCuenta() {
        return monedaCuenta;
    }

    public void setMonedaCuenta(String monedaCuenta) {
        this.monedaCuenta = monedaCuenta;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
