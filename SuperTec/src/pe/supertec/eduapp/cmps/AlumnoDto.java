package pe.supertec.eduapp.cmps;

import java.io.Serializable;

/**
 * @author Diego Huamaán Arancibia
 * @email diegohsistemas@gmail.com
 * @GitHub DiegoHA91
 */
public class AlumnoDto implements Serializable{
    private static final long serialVErsionUID = -1192074921810250481L;
    private String nombre;
    private String apellidos;
    private double[] notas = new double[4];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
    
}
