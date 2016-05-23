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
public abstract class CompAbstract {
    
    public static final double IGV = 0.18;
    public static final double  SERVICIO = 0.10;
    
    public abstract ConceptoDto[] procesar(double total);
}
