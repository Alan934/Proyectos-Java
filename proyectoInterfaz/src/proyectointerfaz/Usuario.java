/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointerfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alan (Escritorio)
 */
public class Usuario implements IGestionUsuario, IUsuarioBasico{
    private int IdUsuario;
    private String nombre;
    private int documento;    
    
    @Override
    public int getIdUsuario() {
        return IdUsuario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getDocumento() {
        return documento;
    }
    
    @Override
    public void mostrarUsuarios(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectokiosko", "root", "");
            Statement sentencia = conexion.createStatement();
            ResultSet resultados;  
            
            resultados = sentencia.executeQuery("SELECT * FROM `usuario`");           
            
            System.out.println("\nUsuarios:");
            while(resultados.next()){
                System.out.println("\nID: "+resultados.getInt("IDusuario"));
                System.out.println("Nombre: "+resultados.getString("Nombre"));
                System.out.println("Documento: "+resultados.getString("Documento"));
            }
                        
            resultados.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }



}
