/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronadapter;

/**
 *
 * @author Alan
 */
public class PatronAdapter {

    public static void main(String[] args) {
        Motor motorNafta = new MotorNafta();
        motorNafta.Arrancar();
        motorNafta.Acelerar();
        motorNafta.Detener();
        motorNafta.CargarCombustible();

        Motor motorDiesel = new MotorDiesel();
        motorDiesel.Arrancar();
        motorDiesel.Acelerar();
        motorDiesel.Detener();
        motorDiesel.CargarCombustible();
        
        Motor motorElectrico = new MotorElectricoAdaptador();
        motorElectrico.Arrancar();
        motorElectrico.Acelerar();
        motorElectrico.Detener();
        motorElectrico.CargarCombustible();
    }
}
