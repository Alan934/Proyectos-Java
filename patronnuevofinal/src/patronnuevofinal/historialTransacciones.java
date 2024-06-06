/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronnuevofinal;

/**
 *
 * @author Usuario
 */
public class historialTransacciones extends Cuenta{
    
    
    public historialTransacciones(String titular, String numeroCuenta, double saldoInicial) {
        super(titular, numeroCuenta, saldoInicial);
        registrarTransaccion("Cuenta creada con saldo inicial de " + saldoInicial);
    }
        private void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }
   
    public void mostrarHistorialTransacciones() {
        System.out.println("Historial de transacciones de la cuenta " + numeroCuenta + ":");
        for (String transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }

}
