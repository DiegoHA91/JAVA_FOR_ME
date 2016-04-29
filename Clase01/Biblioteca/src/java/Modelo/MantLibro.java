/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import datos.Operacion;
import java.util.List;


public class MantLibro {
    public static Libro buscar(String codLib){
        Libro l = null;
        String sql = "SELECT * FROM LIBRO WHERE COD_LIB='"+codLib+"' ";
        Object[] fila = Operacion.getFila(sql);
        if(fila!=null){
            l = new Libro();
            l.setCod(fila[0].toString());
            l.setTit(fila[1].toString());
            l.setAut(fila[2].toString());
        }
        else{
            l=null;
        }
        return l;
    }
   
    public static String grabar(Libro l){
        String sql = "INSERT INTO LIBRO VALUES('"+l.getCod()+"','"+l.getTit()
                                                +"','"+l.getAut()+"')";
        return Operacion.ejecutar(sql);
    }
    
    public static String Acualizar(Libro l){
        String sql = "UPDATE LIBRO SET NOM_LIB='"+l.getTit()+"',AUT_LIB='"
                      +l.getAut()+"' WHERE COD_LIB='"+l.getCod()+"'";
        return Operacion.ejecutar(sql);
    }   
    
    public static List listar(){
        return Operacion.getTabla("SELECT COD_LIB,NOM_LIB,AUT_LIB FROM LIBRO"
                                 + "  ORDER BY NOM_LIB ASC");
    }
}
