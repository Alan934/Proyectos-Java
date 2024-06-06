/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solidprincipio1;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private Transaccion transaccion;
    private boolean cerrada;

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.transaccion = new Transaccion();
        transaccion.registrarDeposito(saldoInicial, saldoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void depositar(double cantidad) {
        if (!cerrada) {
            saldo += cantidad;
            transaccion.registrarDeposito(cantidad, saldo);
        } else {
            System.out.println("No se puede depositar en una cuenta cerrada.");
        }
    }

    public void retirar(double cantidad) {
        if (!cerrada) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                transaccion.registrarRetiro(cantidad, saldo);
            } else {
                transaccion.registrarRetiro(cantidad, saldo);
                System.out.println("Intento de retiro de " + cantidad + " fallido: saldo insuficiente.");
            }
        } else {
            System.out.println("No se puede retirar de una cuenta cerrada.");
        }
    }

    public void transferir(CuentaBancaria destino, double cantidad) {
        if (!cerrada) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                destino.depositar(cantidad);
                transaccion.registrarTransferencia(cantidad, destino.getNumeroCuenta());
            } else {
                transaccion.registrarTransferencia(cantidad, "saldo insuficiente");
                System.out.println("Intento de transferencia de " + cantidad + " fallido: saldo insuficiente.");
            }
        } else {
            System.out.println("No se puede transferir desde una cuenta cerrada.");
        }
    }

    public void cambiarTitular(String nuevoTitular) {
        if (!cerrada) {
            titular = nuevoTitular;
            System.out.println("Titular de la cuenta cambiado a: " + nuevoTitular);
        } else {
            System.out.println("No se puede cambiar el titular de una cuenta cerrada.");
        }
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void cerrarCuenta() {
        cerrada = true;
        System.out.println("Cuenta cerrada.");
    }

    public boolean estaCerrada() {
        return cerrada;
    }
}
