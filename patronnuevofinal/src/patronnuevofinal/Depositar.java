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
public class Depositar extends Cuenta{

    
    public Depositar(String titular, String numeroCuenta, double saldoInicial) {
        super(titular, numeroCuenta, saldoInicial);       
    }
    private void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }
      public void depositar(double cantidad) {
        if (!cerrada) {
            double valor = getSaldo();
            valor += cantidad;
            registrarTransaccion("Depósito de " + cantidad + " realizado. Saldo actual: " + getSaldo());
        } else {
            System.out.println("No se puede depositar en una cuenta cerrada.");
        }
    }
      
      
}
