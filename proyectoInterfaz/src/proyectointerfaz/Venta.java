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
import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author Alan (Escritorio)
 */
public class Venta implements IGestionVenta, IVentaBasico{
    private int idArticulo;
    private double total;
    private int idUsuario;

    Scanner leer = new Scanner(System.in);
    
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int getIdArticulo() {
        return idArticulo;
    }
    
    @Override
    public int getIdUsuario() {
        return idUsuario;
    }

    @Override
    public double getTotal() {
        return total;
    }
    
    @Override
    public void guardarVenta(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectokiosko", "root", "");
            Statement sentencia = conexion.createStatement();
            LocalDate fechaActual = LocalDate.now();            
            
            System.out.println("\nDigitar el id del Articulo Vendido:");
            setIdArticulo(leer.nextInt());
            System.out.println("Digitar id del Usuario");
            setIdUsuario(leer.nextInt());
            System.out.println("Digitar Total de la Venta");
            setTotal(leer.nextDouble());
            
            sentencia.executeUpdate("INSERT INTO `venta`(`IDarticulo`, `IDusuario`,`Fecha`, `Total`) VALUES ('"+idArticulo+"','"+idUsuario+"','"+fechaActual+"','"+total+"')");
            System.out.println("\nVenta Guardada");
            
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
