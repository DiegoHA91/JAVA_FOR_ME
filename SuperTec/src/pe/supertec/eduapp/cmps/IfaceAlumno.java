/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.supertec.eduapp.cmps;

import java.util.List;

/**
 *
 * @author CHERRES
 */
public interface IfaceAlumno {
    void guardar(AlumnoDto obj);
    
    
    AlumnoDto consultar(AlumnoDto obj);
    List<AlumnoDto> obtenerLista();
}
