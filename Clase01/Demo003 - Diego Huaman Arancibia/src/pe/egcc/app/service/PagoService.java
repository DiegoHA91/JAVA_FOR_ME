package pe.egcc.app.service;


import pe.egcc.app.model.PagoDto;


public class PagoService {

    
        
    public void procesar(PagoDto dto) {
        
        double ingresos;
        double renta;
        double neto;
        
        ingresos = dto.getHorasxdia() * dto.getDias() * dto.getPagoxhora();
        
        if(ingresos>1500){
            renta = ingresos * 0.08;
       
        }else{
            renta = 0;
        }

        neto = ingresos - renta;
  
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
        
    }
       
  
}
