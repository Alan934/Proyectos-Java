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
public class Retiro extends Cuenta {

   
    public Retiro(String titular, String numeroCuenta, double saldoInicial) {
        super(titular, numeroCuenta, saldoInicial);
     
    }
        private void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }
    
    public void retirar(double cantidad) {
        if (!cerrada) {
            if (cantidad <= getSaldo()) {
                double valor = getSaldo();
                valor -= cantidad;
                registrarTransaccion("Retiro de " + cantidad + " realizado. Saldo actual: " + getSaldo());
            } else {
                registrarTransaccion("Intento de retiro de " + cantidad + " fallido: saldo insuficiente.");
            }
        } else {
            System.out.println("No se puede retirar de una cuenta cerrada.");
        }
    }

}
