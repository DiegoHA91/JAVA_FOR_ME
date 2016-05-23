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
public class Clase2 extends Clase1{
    
    public Clase2(){
        super("Diego");
    }
    
    public int restar(int n1,int n2){
        return (n1 - n2);
    }

    @Override
    public int sumar(int n1, int n2) {
              
        
        return (n1 * n2); 
    }
    
    
}
