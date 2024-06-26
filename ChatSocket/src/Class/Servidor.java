package Class;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import views.ServidorView;

/**
 *
 * @author Alan (Escritorio)
 */
public class Servidor extends Observable implements Runnable {
    
    private ServerSocket server;
    private Socket sc;
    private int puerto;
    private ServidorView vistaServidor;

    public Servidor(int puerto) {
        this.puerto = puerto;        
    }
   
    public void setVistaServidor(ServidorView vistaServidor){
        this.vistaServidor = vistaServidor;
    }

    @Override
    public void run() {
        System.out.println("se inicio el servidor");
        try {
            server = new ServerSocket(puerto);

            while (true) {
                sc = server.accept();
                vistaServidor.notificarConexion("NUEVO CLIENTE CONECTADO");
                Asistente asistente = new Asistente(sc, this);
                Thread t = new Thread(asistente);
                t.start();
            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void notificacion(String mensaje) {
        this.setChanged();
        this.notifyObservers(mensaje + "\n");
        this.clearChanged();
    }

    public void desconectarCliente(String mensaje) {
        vistaServidor.notificarConexion(mensaje);

    }
}
