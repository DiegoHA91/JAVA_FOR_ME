package com.diego.curso1.cmps;

/*
    Clase abstracta forzozamente utiliza la palabra abstrac
*/
public abstract class OtraPersona {
    
    private Integer folio;
    public static Integer id = 1;

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }
    
    public  void actualizar(){
        System.out.println("update ....");
    }
    
   public abstract void guardar();
}
