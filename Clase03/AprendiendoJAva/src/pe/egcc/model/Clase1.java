/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;

/**
 *
 * @author Alumno
 */
public class Clase1 {
    
    public Clase1(){
        System.out.println("Hola desde Clase 1");
    }
    
    public Clase1(String nombre){
        System.out.println("Hola " + nombre + " desde Clase 1");
    }
    
    public int sumar(int n1, int n2){
        return (n1+n2);
    }
}
