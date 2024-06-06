/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

public class CambiarTitular {
    public void cambiarTitular(CuentaBancaria cuenta, String nuevoTitular) {
        if (!cuenta.isCerrada()) {
            cuenta.setTitular(nuevoTitular);
            System.out.println("Titular de la cuenta cambiado a: " + nuevoTitular);
        } else {
            System.out.println("No se puede cambiar el titular de una cuenta cerrada.");
        }
    }
}
