/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import datos.Operacion;
import java.util.List;


public class CosultFecha {
    

    public static List listar(){
        return Operacion.getTabla("SELECT * FROM FICHA_PRESTAMO WHERE num_prestamo=P00001 ");
    }
}
