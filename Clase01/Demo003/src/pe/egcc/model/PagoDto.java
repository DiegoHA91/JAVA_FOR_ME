package pe.egcc.model;


public class PagoDto {
    
    private double horasxdia;
    private double dias;
    private double pagoxhora;
    
    public PagoDto(double horasxdia, double dias, double pagoxhora){
        
        this.horasxdia = horasxdia;
        this.dias = dias;
        this.pagoxhora = pagoxhora;
        
    }

    @Override
    public String toString(){
        String repo = "";
     
        
        return repo;// to change body of generate methods,
    }
    
    public double getHorasxdia() {
        return horasxdia;
    }

    public void setHorasxdia(double horasxdia) {
        this.horasxdia = horasxdia;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public double getPagoxhora() {
        return pagoxhora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoxhora = pagoxhora;
    }
    
    
}
