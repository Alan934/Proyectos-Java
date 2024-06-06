/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solidprincipio1;

public class SolidPrincipio1 {

    public static void main(String[] args) {
       CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "123456", 1000);
       Transaccion historial = new Transaccion();

        // Realizar algunas operaciones
        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta1.transferir(cuenta1, 300); // Transferencia a sí mismo para evitar excepción
        cuenta1.transferir(cuenta1, 2000); // Intentar transferir más de lo que hay en la cuenta

        // Mostrar el saldo final y el historial de transacciones
        System.out.println("Saldo final de la cuenta " + cuenta1.getNumeroCuenta() + ": " + cuenta1.getSaldo());
        historial.mostrarHistorialTransacciones(cuenta1.getNumeroCuenta());

        // Cambiar el titular de la cuenta
        cuenta1.cambiarTitular("Pedro");

        // Consultar el último movimiento
        System.out.println("\nÚltimo movimiento: " + historial.consultarUltimoMovimiento());

        // Cerrar la cuenta
        cuenta1.cerrarCuenta();

        // Intentar realizar operaciones en una cuenta cerrada
        cuenta1.depositar(100);
        cuenta1.retirar(50);
        cuenta1.transferir(cuenta1, 100);
    }
}
