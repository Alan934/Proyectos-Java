/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private boolean cerrada;
    Transaccion transaccion = new Transaccion();

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.cerrada = false;
        transaccion.registrarTransaccion("Cuenta creada con saldo inicial de " + saldoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }
    
    public void cerrarCuenta(CuentaBancaria cuenta) {
        cerrada = true;
        System.out.println("La cuenta: " + cuenta.getNumeroCuenta()+", se cerro con exito.");
    }

    public boolean estaCerrada() {
        return cerrada;
    }
}
