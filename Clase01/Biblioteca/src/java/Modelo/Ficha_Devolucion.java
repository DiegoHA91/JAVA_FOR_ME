package Modelo;

import java.util.HashMap;


public class Ficha_Devolucion {

    private String num, fec,fecDev;
    private Lector usu;
    private Bibliotecario bibliotecario;
    private HashMap lineas = new HashMap();

    public Lector getUsu() {
        return usu;
    }

    public void setUsu(Lector usu) {
        this.usu = usu;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public HashMap getLineas() {
        return lineas;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getFecDev() {
        return fecDev;
    }

    public void setFecDev(String fecDev) {
        this.fecDev = fecDev;
    }

    public void agregarLineas(Libro libro,Bibliotecario bib,String Fecha,String FechaDev,Lector Usu,Ficha_Devolucion FichDev) {
        LineaDev lin = new LineaDev();
        lin.setLibro(libro);
        lin.setBib(bib);
        lin.setFecha(Fecha);
        lin.setFechaDev(FechaDev);
        lin.setUsuario(Usu);
        lin.setNum(FichDev);
        
        lineas.put(libro.getCod(), lin);
    }
  

}
