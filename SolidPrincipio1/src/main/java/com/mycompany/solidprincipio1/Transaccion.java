/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solidprincipio1;
import java.util.ArrayList;
import java.util.List;

public class Transaccion {
    private List<String> historialTransacciones;

    public Transaccion() {
        this.historialTransacciones = new ArrayList<>();
    }

    public void registrarDeposito(double cantidad, double saldoActual) {
        historialTransacciones.add("Depósito de " + cantidad + " realizado. Saldo actual: " + saldoActual);
    }

    public void registrarRetiro(double cantidad, double saldoActual) {
        historialTransacciones.add("Retiro de " + cantidad + " realizado. Saldo actual: " + saldoActual);
    }

    public void registrarTransferencia(double cantidad, String cuentaDestino) {
        historialTransacciones.add("Transferencia de " + cantidad + " realizada a la cuenta " + cuentaDestino);
    }
    
    public void mostrarHistorialTransacciones(String numeroCuenta) {
        System.out.println("Historial de transacciones de la cuenta " + numeroCuenta + ":");
        for (String transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }
    
    public String consultarUltimoMovimiento() {
        if (!historialTransacciones.isEmpty()) {
            return historialTransacciones.get(historialTransacciones.size() - 1);
        } else {
            return "No hay movimientos registrados en esta cuenta.";
        }
    }
}
