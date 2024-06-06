/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicasocket;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alan (Escritorio)
 */
public class Servidor {
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        int puerto = 5000;
        String nombreCliente;
        
        try {                      
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor Iniciado");
            
            while(true){
                sc = servidor.accept();
                System.out.println("Cliente Conectado");
                
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());                
                
                //String mensaje = in.readUTF();
                //System.out.println(mensaje);
                //out.writeUTF("Hola Desde el Servidor");
                out.writeUTF("Ingresa tu Nombre");
                nombreCliente = in.readUTF();
                
                ServidorHilo serverHilo = new ServidorHilo(in, out, nombreCliente);
                serverHilo.start();
                
                System.out.println("Creada la Conexion con el cliente: " + nombreCliente);
                
                //sc.close();
                //System.out.println("Cliente Desconectado");
            }
        } catch (IOException e) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
