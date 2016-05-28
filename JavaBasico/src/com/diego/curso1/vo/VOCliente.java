package com.diego.curso1.vo;

import java.io.Serializable;

/**
 *
 * @author Diego Huamán Arancibia
 * @github DiegoHA91
 * @correo diegohsistemas@gmail.com
 * @facebook https://www.facebook.com/diieguiito.ar
 *
 */

//VO Value Object --Investigar o Java Bean
public class VOCliente implements Serializable{
    /***
     * 
     * 
     */
    private static final long serialVErsionUID = -1192074921810250481L;
    
    private Integer id;
    private String nombre;
    private String app;
    private Integer edad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
}
