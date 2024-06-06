/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronnuevofinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cuenta {
   String titular;
   String numeroCuenta;
   double saldo;
   List<String> historialTransacciones;
   boolean cerrada;

    public Cuenta(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.historialTransacciones = new ArrayList<>();
        this.cerrada = false;
        registrarTransaccion("Cuenta creada con saldo inicial de " + saldoInicial);
    }
    private void registrarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setHistorialTransacciones(List<String> historialTransacciones) {
        this.historialTransacciones = historialTransacciones;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getHistorialTransacciones() {
        return historialTransacciones;
    }

    public boolean isCerrada() {
        return cerrada;
    }
    

    
       
  
  



}
