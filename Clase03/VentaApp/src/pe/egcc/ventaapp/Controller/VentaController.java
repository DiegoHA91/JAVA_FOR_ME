package pe.egcc.ventaapp.Controller;

import pe.egcc.ventaapp.dto.ConceptoDto;
import pe.egcc.ventaapp.service.BoletaModel;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaModel;

/**
 *
 * @author Alumno
 * @blog www.desarrollasoftware.com
 * @email diegojava01@gmail.com
 * @githug github.com/DiegoHA91/
 *
 */

public class VentaController {
    
    public static final String COMP_FACTURA ="FACTURA";
    public static final String COM_BOLETA = "BOLETA";
    
    public String[] getTipo(){
        String[] tipos = {COMP_FACTURA, COM_BOLETA};
        return tipos;
    }

    public ConceptoDto[] procesar(String tipo, double total) {
        CompAbstract comp = null;
        switch(tipo){
            case COMP_FACTURA:
                comp = new FacturaModel();
                break;
            case COM_BOLETA:
                comp = new BoletaModel();
        }
        
        return comp.procesar(total);
    }
    
    
}
