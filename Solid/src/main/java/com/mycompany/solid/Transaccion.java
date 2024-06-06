/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

import java.util.ArrayList;
import java.util.List;

public class Transaccion {
    private List<String> historialTransacciones;
    
    public Transaccion() {
        this.historialTransacciones = new ArrayList<>();
    }
    
    public void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }
    
    public void mostrarHistorialTransacciones(CuentaBancaria cuenta) {
        System.out.println("Historial de transacciones de la cuenta " + cuenta.getNumeroCuenta() + ":");
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
