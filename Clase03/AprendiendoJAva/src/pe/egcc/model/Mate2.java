/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;


public class Mate2 extends ClaseAbstracta{
    @Override
    public int suma(int n1, int n2){
        int suma;
        suma = (n1 + n2 ) * (n1 - n2);
        return suma;
    }
}
