package Modelo;

import java.util.HashMap;


public class Prestamo {

    private String num, fec,fecdev;
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
        return fecdev;
    }

    public void setFecDev(String fecdev) {
        this.fecdev = fecdev;
    }

    public void agregarLineas(Libro libro) {
        LineaPres lin = new LineaPres();
        lin.setLibro(libro);
        lineas.put(libro.getCod(), lin);
    }

    public void quitarLinea(String cod) {
        lineas.remove(cod);
    }
}
