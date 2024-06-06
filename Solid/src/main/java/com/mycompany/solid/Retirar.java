/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

public class Retirar {
    public void retirar(CuentaBancaria cuenta, double cantidad) {
        if (!cuenta.isCerrada()) {
            if (cantidad <= cuenta.getSaldo()) {
                double saldoActual = cuenta.getSaldo();
                cuenta.setSaldo(saldoActual - cantidad);
                cuenta.transaccion.registrarTransaccion("Retiro de " + cantidad + " realizado. Saldo actual: " + cuenta.getSaldo());
            } else {
                cuenta.transaccion.registrarTransaccion("Intento de retiro de " + cantidad + " fallido: saldo insuficiente.");
            }
        } else {
            System.out.println("No se puede retirar de una cuenta cerrada.");
        }
    }
}
