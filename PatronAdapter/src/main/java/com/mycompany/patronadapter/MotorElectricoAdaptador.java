/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronadapter;

/**
 *
 * @author Alan
 */
public class MotorElectricoAdaptador extends Motor{
    MotorElectrico motorElectrico = new MotorElectrico();
    public void Acelerar(){
        motorElectrico.Mover();
    }
    public void Arrancar(){
        motorElectrico.conectar();
        motorElectrico.Activar();
    }
    public void Detener(){
        motorElectrico.Parar();
        motorElectrico.Desactivar();
    }
    public void CargarCombustible(){
        motorElectrico.Enchufar();
    }
}
