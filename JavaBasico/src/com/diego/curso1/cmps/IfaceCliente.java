package com.diego.curso1.cmps;

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
public interface IfaceCliente {
    void guardar(VOCliente obj);
    void borrar(VOCliente obj);
    void actualizar(VOCliente obj);
    VOCliente consultar(VOCliente obj);
    List<VOCliente> obtenerLista();
}
