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
public class UltimoMovimiento extends Cuenta {
    
    public UltimoMovimiento(String titular, String numeroCuenta, double saldoInicial) {
        super(titular, numeroCuenta, saldoInicial);
    }
        private void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }
     public String consultarUltimoMovimiento() {
        if (!historialTransacciones.isEmpty()) {
            return historialTransacciones.get(historialTransacciones.size() - 1);
        } else {
            return "No hay movimientos registrados en esta cuenta.";
        }
    }
}
