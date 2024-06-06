/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectointerfaz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author Alan (Escritorio)
 */
public class ProyectoInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion, opcion2;
        boolean salir = true, salir2 = true;
        
        Articulo articulo = new Articulo();
        Venta venta = new Venta();
        Usuario usuario = new Usuario();

        do{
            
            System.out.println("\nMenu");
            System.out.println("(1) Modificar Articulo");
            System.out.println("(2) Agregar Nuevo Articulo");
            System.out.println("(3) Mostrar Todos los Articulo");
            System.out.println("(4) Buscar Articulo");        
            System.out.println("(5) Guardar Venta");      
            System.out.println("(6) Mostrar Usuarios");      
            System.out.println("(0) Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    do{
                        System.out.println("\n(1) Agregar Stock Articulo");
                        System.out.println("(2) Restar Stock Articulo");
                        System.out.println("(3) Nuevo Precio del Articulo");
                        System.out.println("(4) Buscar Articulo");
                        System.out.println("(0) Volver Menu Anterior");
                        opcion2 = leer.nextInt();
                        switch(opcion2){
                            case 1:
                                articulo.modificarArticulo(1);
                                salir2=true;
                                break;
                            case 2:   
                                articulo.modificarArticulo(2);  
                                salir2=true;
                                break;
                            case 3:    
                                articulo.modificarArticulo(3);  
                                salir2=true;
                                break;
                            case 0:
                                System.out.println("\nCerrando Menu");
                                salir2=false;
                                break;
                            default:
                                System.out.println("Opcion del Menu Incorrecta");
                                break;                                
                        }
                    }while(salir2 == true);                    
                    break;            
                case 2:
                    articulo.agregarArticulo();
                    break;
                case 3:
                    articulo.mostrarArticulos();
                    break;
                case 4:
                    articulo.buscarArticulo();
                    break;
                case 5:
                    venta.guardarVenta();
                    break;
                case 6:
                    usuario.mostrarUsuarios();
                    break;
                case 0:
                    System.out.println("Cerrando...");
                    salir = false;
                    break;
                default:
                    System.out.println("\nOpcion elegida incorrecta");
                    break;
            }
        }while(salir == true);
        //}
    }
    
}
