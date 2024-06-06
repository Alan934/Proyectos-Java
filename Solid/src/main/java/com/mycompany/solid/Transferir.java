/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

public class Transferir {
    Depositar depositar = new Depositar();

    public void transferir(CuentaBancaria cuenta, CuentaBancaria destino, double cantidad) {
        if (!cuenta.isCerrada()) {
            if (cantidad <= cuenta.getSaldo()) {
                double saldoActual = cuenta.getSaldo();
                cuenta.setSaldo(saldoActual - cantidad);
                depositar.depositar(destino, cantidad);
                cuenta.transaccion.registrarTransaccion("Transferencia de " + cantidad + " realizada a la cuenta " + destino.getNumeroCuenta());
            } else {
                cuenta.transaccion.registrarTransaccion("Intento de transferencia de " + cantidad + " fallido: saldo insuficiente.");
            }
        } else {
            System.out.println("No se puede transferir desde una cuenta cerrada.");
        }
    }
}
