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
public class CambiarTitular extends Cuenta {

    public CambiarTitular(String titular, String numeroCuenta, double saldoInicial) {
        super(titular, numeroCuenta, saldoInicial);
    }
        private void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }
     public void cambiarTitular(String nuevoTitular) {
        if (!cerrada) {
            titular = nuevoTitular;
            System.out.println("Titular de la cuenta cambiado a: " + nuevoTitular);
        } else {
            System.out.println("No se puede cambiar el titular de una cuenta cerrada.");
        }
    }
}
