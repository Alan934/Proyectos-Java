/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasededatos;



import java.sql.SQLException;



/**
 *
 * @author Usuario
 */
public class Discografia extends Bd implements Musica {
     
    
      
    @Override
    public void Cancion() {
       try {
            st=c.con.createStatement();
            rs=st.executeQuery("select * from musica");
           while(rs.next()){
               System.out.println("Las Canciones son: "+rs.getString("Cancion"));
              }} catch (SQLException e) {}
        } 
        
            
        
    @Override
    public void Autor() {
        try {
            st=c.con.createStatement();
            rs=st.executeQuery("select * from musica");
           while(rs.next()){
               System.out.println("Las Autores son: "+rs.getString("Autor"));
              }} catch (SQLException e) {}
    }
    
    }

    
    

