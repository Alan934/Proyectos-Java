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
public class Main {
      public static void main(String[] args) throws SQLException {
    
     Bd bd = new Bd();
     bd.BD();
     
    // bd.reroll();
      Discografia Dis = new Discografia();
      Dis.Cancion();
      Dis.Autor();
    }
}
