/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ConceptoDto;

/**
 *
 * @author Alumno
 * @blog www.desarrollasoftware.com
 * @email diegojava01@gmail.com
 * @githug github.com/DiegoHA91/
 *
 */
public class FacturaModel extends CompAbstract{ 

    @Override
    public ConceptoDto[] procesar(double total) {
        //Variables
        double consumo, impuesto, servicio, totalGeneral;
        //Proceso
        consumo = total / (1+ IGV);
        impuesto = total - consumo;
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        //Reporte
        ConceptoDto[] repo = {
            new ConceptoDto("Consumo", consumo),
            new ConceptoDto("Impuesto", impuesto),
            new ConceptoDto("Total", total),
            new ConceptoDto("Servicio", servicio),
            new ConceptoDto("Total General", totalGeneral)
        };
        return repo;
    }
        
}
