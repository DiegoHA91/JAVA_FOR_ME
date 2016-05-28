package pe.supertec.eduapp.service;

import java.util.List;
import pe.supertec.eduapp.cmps.AlumnoDto;
import pe.supertec.eduapp.cmps.IfaceAlumno;

/**
 * @author Diego Huamaán Arancibia
 * @email diegohsistemas@gmail.com
 * @GitHub DiegoHA91
 */
public class ImplAlumno implements IfaceAlumno{

    @Override
    public void guardar(AlumnoDto obj) {
        
    }

    @Override
    public AlumnoDto consultar(AlumnoDto obj) {
        return null;
    }

    @Override
    public List<AlumnoDto> obtenerLista() {
        return null;
    }
    
}
