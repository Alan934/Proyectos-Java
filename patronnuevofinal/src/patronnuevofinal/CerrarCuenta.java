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
public class CerrarCuenta extends Cuenta {

    public CerrarCuenta(String titular, String numeroCuenta, double saldoInicial) {
        super(titular, numeroCuenta, saldoInicial);
    }
    
     public void cerrarCuenta() {
        cerrada = true;
        System.out.println("Cuenta cerrada.");
    }

}
