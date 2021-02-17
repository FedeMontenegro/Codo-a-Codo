package Figura.Figura3D;

public final class Esfera extends Figura3D {
    
    private int radio;

    public Esfera() {
    }

    public Esfera(int radio, String nombre, int grosorBorde, int color) {
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
    public double CalcularVolumen() {
        double volumen = (Math.PI*this.getRadio()/3)*(Math.pow(this.getRadio(), 3));
        return volumen;
    }
    
    @Override
    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
