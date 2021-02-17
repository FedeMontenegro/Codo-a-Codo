package u4;

public class Precio {

    private double importeNeto;
    private double porcentajeIva;

    public Precio() {
    }

    public Precio(double importeNeto, double porcentajeIva) {
        this.importeNeto = importeNeto;
        this.porcentajeIva = porcentajeIva;
    }

    public double getImporteNeto() {
        return importeNeto;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setImporteNeto(double importeNeto) {
        this.importeNeto = importeNeto;
    }

    public void setPorcentajeIva(double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }
    
    public double GetImporteTotal(double importeNeto, double porcentajeIva){
        double importeTotal = importeNeto + importeNeto*porcentajeIva;
        return importeTotal;
    }
    
    public double GetimporteIva(double porcentajeIva){
        double importeIva = this.importeNeto*porcentajeIva;
        return importeIva;
    }

    @Override
    public String toString() {
        return "*****Precio*****" + "\n Importe Neto: " + importeNeto + "\n Porcentaje Iva: " + porcentajeIva + "\n Importe Total: " + this.GetImporteTotal(importeNeto, porcentajeIva) + "\n Importe Iva: " + this.GetimporteIva(porcentajeIva);
    }
    
    
}