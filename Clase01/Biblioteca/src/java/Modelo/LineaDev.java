package Modelo;

public class LineaDev {

    private Libro libro;
    private Bibliotecario bib;
    private String  Fecha,FechaDev;
    private Lector Usuario;
    private Ficha_Devolucion num;
    
    public Bibliotecario getBib() {
        return bib;
    }

    public void setBib(Bibliotecario bib) {
        this.bib = bib;
    }
    

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getFechaDev() {
        return FechaDev;
    }

    public void setFechaDev(String FechaDev) {
        this.FechaDev = FechaDev;
    }

    public Lector getUsuario() {
        return Usuario;
    }

    public void setUsuario(Lector Usuario) {
        this.Usuario = Usuario;
    }

    public Ficha_Devolucion getNum() {
        return num;
    }

    public void setNum(Ficha_Devolucion num) {
        this.num = num;
    }

    
    
}
