/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronstrategy;

/**
 *
 * @author Alan (Escritorio)
 */
public class Resta implements Operacion {
    @Override
    public double ejecutar(double numero1, double numero2){
        if(numero1 > numero2){
            return numero1 - numero2;
        }else{
            return numero2 - numero1;
        }
    }
}
