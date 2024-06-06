/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasededatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Bd {
      Conexion c = new Conexion();
      Statement st;
      ResultSet rs;
  
      
      public void BD() {
       
        try {
            st=c.con.createStatement();
            rs=st.executeQuery("select * from musica");
           while(rs.next()){
               System.out.println(rs.getInt("Puesto")+" "+rs.getString("Cancion")+" "+rs.getString("Autor"));
              }
         /*  
           if(rs.absolute(1)){
             System.out.println(rs.getString("Cancion"));
           }
          */   
            
        } catch (SQLException e) {
           
        }
           
}
     /*
      public void reroll() {
          
           try {
            st=c.con.createStatement();
            rs=st.executeQuery("select * from musica");
            String[][] Tabla;
           Tabla = new String[5][3];
            
            for (int fila = 0; fila < Tabla.length; fila++) {
              for (int columna = 0; columna < Tabla[fila].length; columna++) {
            switch (columna){
                case 0: 
                  Tabla[fila][columna] = "Puesto"; 
                  break;
                  case 1: 
                  Tabla[fila][columna] = "Cancion"; 
                  break;
                  case 2: 
                  Tabla[fila][columna] = "Autor";                
                break;
            }
            switch (fila){
                case 0: 
                  Tabla[fila][columna] =  rs.getInt("Puesto")+" "+rs.getString("Cancion")+" "+rs.getString("Autor"); 
                  break;
                  case 1: 
                   Tabla[fila][columna] =  rs.getInt("Puesto")+" "+rs.getString("Cancion")+" "+rs.getString("Autor");
                  break;
                  case 2: 
                  Tabla[fila][columna] =  rs.getInt("Puesto")+" "+rs.getString("Cancion")+" "+rs.getString("Autor");              
                break;
            }
                  
    }
}
           c.con.close();
            System.out.println(Tabla[2][2]+""); 
        } catch (SQLException e) {
           
        }
           
         
          
}
      
    */ 
}
