/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronnuevofinal;

public class CuentaBancaria {
    
    public static void main(String[] args) {
        // Abrir una nueva cuenta
        
        Cuenta C1= new Cuenta("Juan", "123456", 1000);
        Depositar D1= new Depositar();
        Retiro R1 = new Retiro("Juan", "123456", 1000);
        Transferir T1 = new Transferir("Juan", "123456", 1000);
        UltimoMovimiento U1 = new UltimoMovimiento("Juan", "123456", 1000);
        CambiarTitular CT1 = new CambiarTitular("Juan", "123456", 1000);
        historialTransacciones H1 = new  historialTransacciones("Juan", "123456", 1000);
        CerrarCuenta CC1 = new CerrarCuenta("Juan", "123456", 1000);
        

// Realizar algunas operaciones
        D1.depositar(500);
        R1.retirar(200);
        
        T1.transferir(D1, 300);
        T1.transferir(D1, 2000);

        // Mostrar el saldo final y el historial de transacciones
        System.out.println("Saldo final de la cuenta " + C1.numeroCuenta + ": " + C1.saldo);
        H1.mostrarHistorialTransacciones();

        // Cambiar el titular de la cuenta
        CT1.cambiarTitular("Pedro");

        // Consultar el último movimiento
        System.out.println("\nÚltimo movimiento: " + U1.consultarUltimoMovimiento());

        // Cerrar la cuenta
        CC1.cerrarCuenta();

        // Intentar realizar operaciones en una cuenta cerrada
        D1.depositar(100);
        R1.retirar(50);
        T1.transferir(D1, 100);
    }
}