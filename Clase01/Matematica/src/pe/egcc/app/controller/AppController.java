/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.controller;

import pe.egcc.app.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 */
public class AppController {
  
    public long calcularFactorial(int numero){
        long respuesta;
        respuesta = MyMath.factorial(numero);
        return respuesta;
    }
    
    public int calcularoMcd(int n1 ,int n2){
        int mcd;
        mcd = MyMath.mcd(n1, n2);
        return mcd;
    }
    
    public int calcularoMcm(int n1 ,int n2){
        int mcm;
        mcm = MyMath.mcm(n1, n2);
        return mcm;
    }
}
