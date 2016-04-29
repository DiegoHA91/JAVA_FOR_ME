/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import datos.Operacion;
import java.util.List;


public class MantBiblio {
    
    public static Prestamo buscar(String codBib){
        Prestamo b = null;
        Bibliotecario bib = null;
        Lector lec= null;
//        String sql2 =   "SELECT d.cod_lib\n" +
//                        "  FROM ficha_prestamo fp\n" +
//                        "  INNER JOIN detalle d\n" +
//                        "  ON fp.num_prestamo = d.num_prestamo\n" +
//                        "  WHERE d.num_prestamo = '"+codBib+"'";
        String sql = "SELECT * FROM ficha_prestamo WHERE num_prestamo='"+codBib+"'";
        Object[] fila = Operacion.getFila(sql);
//        List lista = Operacion.getTabla(sql2);
        if(fila!=null){
            b = new Prestamo();
            bib = new Bibliotecario();
            lec = new Lector();
            
            b.setNum(fila[0].toString());
            b.setFec(fila[1].toString());
            b.setFecDev(fila[2].toString());
            bib.setCod(fila[3].toString());
            lec.setCod(fila[4].toString());
            b.setBibliotecario(bib);
            b.setUsu(lec);
        }
        
//        if(lista!=null){
//            
//        }
//        else{
//            b=null;
//        }
        return b;
    }
   
    public static String grabar(Bibliotecario b){
        String sql = "INSERT INTO BIBLIOTECARIO VALUES('"+b.getCod()+"','"
                    +b.getNom()+"','"+b.getPass()+"','"+b.getUsua()+"')";
        return Operacion.ejecutar(sql);
    }
    
    public static String Acualizar(Prestamo b){
        String sql = " update ficha_prestamo set fecha_prest = '"+b.getFec()+"', fecha_dec='"+b.getFecDev()+"' where num_prestamo = '"+b.getNum()+"'";
        return Operacion.ejecutar(sql);
    }   
    
    public static List listar(String numpre){
        return Operacion.getTabla("SELECT d.cod_lib,l.nom_lib\n" +
                                    "  FROM ficha_prestamo fp\n" +
                                    "  INNER JOIN detalle d\n" +
                                    "  ON fp.num_prestamo = d.num_prestamo\n" +
                                    "  INNER JOIN libro l\n" +
                                    "  on l.cod_lib = d.cod_lib\n" +
                                    "  WHERE d.num_prestamo = '"+numpre+"'");
    }
}
