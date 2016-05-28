package com.diego.curso1.cmps;
/**
 *
 * @author Diego Huamán Arancibia
 * @github DiegoHA91
 * @correo diegohsistemas@gmail.com
 * @facebook https://www.facebook.com/diieguiito.ar
 *
 */
public class Alumno extends OtraPersona{
    private final static String color = "Rojo";
    
    private String nuevofolio;
    public static Integer id = 1;
    
    public  Alumno(){
        
    }
    
    public Alumno(String folioDiferente){
        
    }
    
    public void actualizar(){
        System.out.println("update alumno ... " + id);
    }
    
    public static void borrar(Integer id){
        System.out.println("Id Borrado: " + id);
    }
    
    @Override
    public void guardar() {
        this.toString();
    }
    
    public void setFolio(Integer folio) {
        this.nuevofolio = "Folio: " + folio;
    }
    
    public  String toString(){
        return nuevofolio;
    }
    
    public  String toString(String cadena){
        return "Cadena - " + nuevofolio;
    }
    
    public  String toString(String cadena,String cadena2){
        return cadena + cadena2;
    }
}
