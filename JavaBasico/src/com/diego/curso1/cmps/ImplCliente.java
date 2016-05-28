package com.diego.curso1.cmps;

import com.diego.curso1.vo.VOCliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Diego Huamán Arancibia
 * @github DiegoHA91
 * @correo diegohsistemas@gmail.com
 * @facebook https://www.facebook.com/diieguiito.ar
 *
 */
public class ImplCliente implements IfaceCliente{

    @Override
    public void guardar(VOCliente obj) {
        System.out.println("Id a guardar: "+obj.getId());
    }
        
    @Override
    public void borrar(VOCliente obj) {
        System.out.println("Id a borrar: "+obj.getId());
    }

    @Override
    public void actualizar(VOCliente obj) {
        System.out.println("Id a actualizar : "+obj.getId());
    }

    @Override
    public VOCliente consultar(VOCliente obj) {
        VOCliente nuevo = new VOCliente();
        nuevo.setId(obj.getId());
        nuevo.setNombre("Diego");
        nuevo.setApp("Huaman");
        nuevo.setEdad(25);
        
        return null;
    }

    @Override
    public List<VOCliente> obtenerLista() {
        //Framework Collections
        Collection<VOCliente> col = new ArrayList<VOCliente>();
        List<VOCliente> lista = new ArrayList<VOCliente>();
        Map<String, VOCliente > mapa = new HashMap<String, VOCliente >();
        Set<String> set = new HashSet<String>();
        
        for(int i = 0; i < 5; i++){
            VOCliente nuevo = new VOCliente();
            nuevo.setId(i+1);
            nuevo.setNombre("Diego"+nuevo.getId());
            nuevo.setApp("Huaman"+nuevo.getId());
            nuevo.setEdad(25+nuevo.getId());
            lista.add(nuevo);
        }
        
        return lista;
    }
    
}
