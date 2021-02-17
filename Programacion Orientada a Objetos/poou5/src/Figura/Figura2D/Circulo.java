package Figura.Figura2D;

public final class Circulo extends Figura2D{
    
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        double area = Math.PI * Math.pow(this.getRadio(), 2);
        return area;
    }

    @Override
    public double CalcularPerimetro() {
        double perimetro = (Math.PI*2)*this.getRadio();
        return perimetro;
    }

    public int CambiarTamanio(){
        return 0;
    }

    @Override
    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
