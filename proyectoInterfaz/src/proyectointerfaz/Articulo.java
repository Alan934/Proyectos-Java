/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointerfaz;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alan (Escritorio)
 */
public class Articulo implements IArticuloBasico, IGestionArticulo {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private int idUsuario;
    private int idVenta, idIngresado, cantidadIngresada;
    
    Scanner leer = new Scanner(System.in);


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public int getIdUsuario() {
        return idUsuario;
    }

    @Override
    public int getIdVenta() {
        return idVenta;
    }

    @Override
    public void modificarArticulo(int opcion) {
        try {
            int nuevoStock;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectokiosko", "root", "");
            Statement sentencia = conexion.createStatement();
            ResultSet resultados;
            
            System.out.println("Digitar ID del Articulo");
            setId(leer.nextInt());
            
            resultados = sentencia.executeQuery("SELECT `Stock`, `Nombre` FROM `articulo` WHERE IDarticulo="+id);           
            
            if(resultados.next()){
                setNombre(resultados.getString("Nombre")); 
                switch(opcion){
                    case 1: //agregar Stock
                        System.out.println("Digitar Cantidad Stock Agregar");
                        cantidadIngresada = leer.nextInt();
                        nuevoStock =  resultados.getInt("Stock") + cantidadIngresada;
                        sentencia.executeUpdate("UPDATE articulo SET Stock = "+nuevoStock+" WHERE IDarticulo = "+id);
                        System.out.println("\nStock Agregado correctamente, Stock actual de "+nombre+" es: "+nuevoStock);
                        break;
                    case 2://Restar Stock
                        System.out.println("Digitar Cantidad Stock a Restar");
                        cantidadIngresada = leer.nextInt();
                        nuevoStock = resultados.getInt("Stock") - cantidadIngresada;
                        sentencia.executeUpdate("UPDATE articulo SET Stock = "+nuevoStock+" WHERE IDarticulo = "+id);
                        System.out.println("\nStock Restado correctamente, Stock actual de "+nombre+" es: "+nuevoStock);
                        break;
                    case 3:
                        System.out.println("Digitar Precio Nuevo");
                        cantidadIngresada = leer.nextInt();
                        sentencia.executeUpdate("UPDATE articulo SET Precio = "+cantidadIngresada+" WHERE IDarticulo = "+id);
                        break;
                    default:
                        System.out.println("Opcion Elegida No Pertenece al Menu");
                        break;
                }
            }        
            
            resultados.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void agregarArticulo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectokiosko", "root", "");
            Statement sentencia = conexion.createStatement();
            
            System.out.println("\nElegio Agregar Articulo");
            System.out.println("Digitar Nombre del Articulo");
            setNombre(leer.nextLine());
            System.out.println("Digitar ID del Articulo");
            setId(leer.nextInt());
            System.out.println("Digitar el Precio del Articulo");
            setPrecio(leer.nextDouble());
            System.out.println("Digitar Cantidad Stock Agregar");
            setStock(leer.nextInt());
            
            sentencia.executeUpdate("INSERT INTO `articulo`(`IDarticulo`, `Nombre`, `Precio`, `Stock`) VALUES ('"+id+"','"+nombre+"','"+precio+"','"+stock+"')");
            System.out.println("Articulo Agregado: ID: "+id+", Nombre: "+nombre+", Precio: "+precio+", Stock: "+stock);

            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void mostrarArticulos(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectokiosko", "root", "");
            Statement sentencia = conexion.createStatement();
            ResultSet resultados;  
            
            resultados = sentencia.executeQuery("SELECT * FROM `articulo`");           
            
            System.out.println("\nArticulos:");
            while(resultados.next()){
                System.out.println("\nID: "+resultados.getInt("IDarticulo"));
                System.out.println("Nombre: "+resultados.getString("Nombre"));
                System.out.println("Precio: "+resultados.getString("Precio"));
                System.out.println("Stock: "+resultados.getInt("Stock"));
            }
                        
            resultados.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void buscarArticulo(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectokiosko", "root", "");
            Statement sentencia = conexion.createStatement();
            ResultSet resultados;
            
            resultados = sentencia.executeQuery("SELECT * FROM `articulo`");
            
            System.out.println("\nIngrese ID del Articulo a buscar: ");
            setId(leer.nextInt());
            
            while(resultados.next()){
                if(id == resultados.getInt("IDarticulo")){
                    System.out.println("\nSe encontro el Articulo:");
                    System.out.println("ID: "+resultados.getInt("IDarticulo"));
                    System.out.println("Nombre: "+resultados.getString("Nombre"));
                    System.out.println("Precio: "+resultados.getString("Precio"));
                    System.out.println("Stock: "+resultados.getInt("Stock"));                    
                }
            }
                        
            resultados.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }    
    
}
