/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solid;

public class Solid {

    public static void main(String[] args) {
        // Abrir una nueva cuenta
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "123456", 1000);
        Depositar depositar = new Depositar();
        Retirar retirar = new Retirar();
        Transferir transferir = new Transferir();
        CambiarTitular cambiarTitular = new CambiarTitular();
        
        // Realizar algunas operaciones
        depositar.depositar(cuenta1, 500);
        retirar.retirar(cuenta1, 200);
        transferir.transferir(cuenta1, cuenta1, 300); // Transferencia a sí mismo para evitar excepción
        transferir.transferir(cuenta1, cuenta1, 2000); // Intentar transferir más de lo que hay en la cuenta

        // Mostrar el saldo final y el historial de transacciones
        System.out.println("Saldo final de la cuenta " + cuenta1.getNumeroCuenta() + ": " + cuenta1.getSaldo());
        cuenta1.transaccion.mostrarHistorialTransacciones(cuenta1);

        // Cambiar el titular de la cuenta
        cambiarTitular.cambiarTitular(cuenta1, "Pedro");

        // Consultar el último movimiento
        System.out.println("\nÚltimo movimiento: " + cuenta1.transaccion.consultarUltimoMovimiento());

        // Cerrar la cuenta
        cuenta1.cerrarCuenta(cuenta1);

        // Intentar realizar operaciones en una cuenta cerrada
        depositar.depositar(cuenta1, 100);
        retirar.retirar(cuenta1, 50);
        transferir.transferir(cuenta1, cuenta1, 100);
    }
}
