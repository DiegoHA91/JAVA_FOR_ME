package com.diego.curso1;

import com.diego.curso1.cmps.Alumno;
import com.diego.curso1.cmps.Cliente;
import com.diego.curso1.cmps.IfaceCliente;
import com.diego.curso1.cmps.ImplCliente;
import com.diego.curso1.cmps.OtraPersona;
import com.diego.curso1.cmps.Persona;
import com.diego.curso1.vo.VOCliente;
import java.util.List;
/**
 *
 * @author Diego Huamán Arancibia
 * @github DiegoHA91
 * @correo diegohsistemas@gmail.com
 * @facebook https://www.facebook.com/diieguiito.ar
 *
 */
public class Principal {
    public static void main(String[] args) {
        Persona persona = new Cliente();
        Cliente cliente = (Cliente)persona;
        System.out.println("Id: " + Alumno.id);
        Alumno.borrar(Alumno.id);
        
        IfaceCliente nuevoCliente = new ImplCliente();
        List<VOCliente> clientes = nuevoCliente.obtenerLista();
        for(VOCliente nuevoObjeto: clientes){
            System.out.println("Id: "+nuevoObjeto.getId());
            System.out.println("Nombre: "+nuevoObjeto.getNombre()+" "+nuevoObjeto.getApp());
            System.out.println("Edad: "+nuevoObjeto.getEdad());
        }
    }
}
