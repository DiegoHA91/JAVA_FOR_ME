/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Modelo.Bibliotecario;
import Modelo.Ficha_Devolucion;
import Modelo.Libro;
import Modelo.LineaDev;
import Modelo.Prestamo;
import Modelo.Lector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class Prueba {
     
    public static void main (String[]args){
       
       
        try {
            
         String sql = "SELECT * FROM USUARIO";
         Object[] fil = Operacion.getFila(sql);
         if(fil!=null ){
             System.out.println(fil[0].toString());
            
         }
            
        } catch (Exception ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
          
    
}
}
