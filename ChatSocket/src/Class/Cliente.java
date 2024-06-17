/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alan (Escritorio)
 */
public class Cliente {
    private Socket socketCliente;
    private int puerto;
    private DataOutputStream out;
    final String HOST = "127.0.0.1";

    public Cliente(int puerto) {
        this.puerto = puerto;
        iniciar();
    }
    
    public int getPuerto() {
        return puerto;
    }

    public String getHOST() {
        return HOST;
    }
    public void iniciar() {
        try {
            socketCliente = new Socket(HOST, puerto);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviarMensaje(String msj) {
        if (socketCliente.isClosed()) {
            System.out.println("socket cerrado");
        } else {
            try {
                out = new DataOutputStream(socketCliente.getOutputStream());
                out.writeUTF(msj);
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
