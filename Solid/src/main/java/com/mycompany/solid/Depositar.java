/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

public class Depositar {
    
    public void depositar(CuentaBancaria cuenta, double cantidad) {
        if (!cuenta.isCerrada()) {
            double saldoActual = cuenta.getSaldo();
            cuenta.setSaldo(saldoActual + cantidad);
            cuenta.transaccion.registrarTransaccion("Depósito de " + cantidad + " realizado. Saldo actual: " + cuenta.getSaldo());
        } else {
            System.out.println("No se puede depositar en una cuenta cerrada.");
        }
    }
}
