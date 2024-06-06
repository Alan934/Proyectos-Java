/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicasocket;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alan (Escritorio)
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String host = "127.0.0.1";
        int puerto = 5000;
        String nombre;
        String apellido;
        DataInputStream in;
        DataOutputStream out;       
        
        try {
            sn.useDelimiter("\n");
            Socket sc = new Socket(host, puerto);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            //out.writeUTF("Hola Desde el Cliente");
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            
            nombre = sn.next();
            out.writeUTF(nombre);
            
            ClienteHilo clienteHilo = new ClienteHilo(in, out);
            clienteHilo.start();
            clienteHilo.join();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
