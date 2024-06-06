/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronstrategy;

/**
 *
 * @author Alan (Escritorio)
 */
public class PatronStrategy {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        calculadora.setEstrategia(new Suma());
        double resultadoSuma = calculadora.ejecutarOperacion(10, 9);
        System.out.println("Resultado de la suma: "+resultadoSuma);
        
        calculadora.setEstrategia(new Resta());
        double resultadoResta = calculadora.ejecutarOperacion(10, 1);
        System.out.println("\nResultado de la Resta: "+resultadoResta);
    }
}
