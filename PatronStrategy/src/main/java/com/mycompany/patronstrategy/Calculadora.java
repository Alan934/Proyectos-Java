/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronstrategy;

/**
 *
 * @author Alan (Escritorio)
 */
public class Calculadora {
    private Operacion operacion;
    
    public void setEstrategia(Operacion operacion){
        this.operacion = operacion;
    }
    
    public double ejecutarOperacion(double numero1, double numero2){
        return operacion.ejecutar(numero1, numero2);
    }
}
