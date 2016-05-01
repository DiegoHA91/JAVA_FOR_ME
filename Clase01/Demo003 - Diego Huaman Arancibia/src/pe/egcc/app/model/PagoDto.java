package pe.egcc.app.model;


public class PagoDto {
    
    private double horasDia;
    private double dias;
    private double pagoHora;
    private double ingresos;
    private double renta;
    private double neto;
    
    public PagoDto(double horasDia, double dias, double pagoHora){
        
        this.horasDia = horasDia;
        this.dias = dias;
        this.pagoHora = pagoHora;          
        
    }
    
    public double getHorasxdia() {
        return horasDia;
    }

    public void setHorasxdia(double horasxdia) {
        this.horasDia = horasxdia;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public double getPagoxhora() {
        return pagoHora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoHora = pagoxhora;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
        
}
