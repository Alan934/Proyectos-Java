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
public class Transferir extends Cuenta {
    
    public Transferir(String titular, String numeroCuenta, double saldoInicial) {
        super(titular, numeroCuenta, saldoInicial);
    }
        private void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }
    
       public void transferir(Depositar destino, double cantidad) {
        if (!cerrada) {
            if (cantidad <= getSaldo()) {
                double valor = getSaldo();
                valor -= cantidad;
                destino.depositar(cantidad);
                registrarTransaccion("Transferencia de " + cantidad + " realizada a la cuenta " + destino.numeroCuenta);
            } else {
                registrarTransaccion("Intento de transferencia de " + cantidad + " fallido: saldo insuficiente.");
            }
        } else {
            System.out.println("No se puede transferir desde una cuenta cerrada.");
        }
    }

}
