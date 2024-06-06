/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronadapter;

/**
 *
 * @author Alan
 */
public class MotorElectrico {
    boolean conectado;
    boolean activo;
    boolean moviendo;
    
    public void conectar(){
        if(conectado){
            System.out.println("Imposible conectar un motor electrico ya conectado!");
        }else{
            conectado = true;
            System.out.println("Motor conectado");
        }
    }
    public void Activar(){
        if(!conectado){
            System.out.println("Imposible Activar un motor electrico ya ACtivado!");
        }else{
            activo = true;
            System.out.println("Motor Activar");
        }
    }
    
    public void Mover(){
        if(conectado && activo){
            moviendo = true;
            System.out.println("Moviendo vehiculo con motor electrico");
        }else{
            System.out.println("El motor debera estar conectado y activo");
        }
    }
    
    public void Parar(){
        if(moviendo){
            System.out.println("Parando vehiculo con motor electrico");
        }else{
            System.out.println("Imposible parar un motor que no este en movimiento");
        }
    }
    
    public void Desconectar(){
        if(conectado){
            System.out.println("Motor desconectado");
        }else{
            System.out.println("Motor conectado");
        }
    }
    
    public void Desactivar(){
        if(activo){
            activo = false;
            System.out.println("Apagando motor electrico");
        }
    }
    
    public void Enchufar(){
        if(!activo){
            activo = false;
            System.out.println("Motor cargando las baterias");
        }else{
            System.out.println("Imposible enchufar un motor activo");
        }
    }
}
