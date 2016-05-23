/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import pe.egcc.model.Clase4;

/**
 *
 * @author Alumno
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase4 bean = new Clase4();
        System.out.println("7 + 8 = " + bean.sumar(7,8));
        System.out.println("8 - 3 = " + bean.restar(8, 3));
    }
    
}
