package pe.egcc.model;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String email;

    
    
    public Estudiante(){
        nombre = "Diego";
        apellido = "Huaman";
        edad = 30;
        email = "dioegojava01@gmail.com";
        casado = true;
    }
    
    /**
     * @param nombre
     * @param apellido
     * @param edad
     * @param email
     * @param casado 
     */
    
    public Estudiante(String nombre,String apellido, int edad, String email,boolean casado){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.casado = casado;
        
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    @Override
    public String toString(){
        String repo = "";
        
        repo += "Nombre     : " + nombre +"\n" ;
        repo += "Apellido     : " + apellido +"\n";
        repo += "Edad          : " + edad +"\n";
        repo += "Email         : " +email +"\n";
        repo += "Casado      : " +casado +"\n";
        
        return repo;// to change body of generate methods,
    }
}
