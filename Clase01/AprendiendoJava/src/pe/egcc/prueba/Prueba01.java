package pe.egcc.prueba;

import pe.egcc.model.Estudiante;

public class Prueba01 {
    
    public static void main(String[] args){
        
        Estudiante est01 = new Estudiante();
        
        est01.setApellido("Silca");
        est01.setNombre("Albert");
        est01.setEdad(20);
        est01.setEmail("albert@gmail.com");
        est01.setCasado(true);
           
        System.out.println("Nombre: "+ est01.getNombre());
        System.out.println("------------------------------");
        System.out.println(est01);
        
    }
    
}
