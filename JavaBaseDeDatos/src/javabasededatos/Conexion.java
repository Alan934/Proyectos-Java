/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasededatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection con;
    public Conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebajava","root","");
    }catch (ClassNotFoundException | SQLException e){
        System.err.println("Error:"+e);
    }
}
    
  
    
}
