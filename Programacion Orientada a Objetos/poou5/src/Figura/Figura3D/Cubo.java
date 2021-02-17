package Figura.Figura3D;

import Figura.Figura2D.Cuadrado;

public final class Cubo extends Figura3D{
    
    private Cuadrado cuadrado;

    public Cubo() {
    }

    public Cubo(String nombre, int grosorBorde, int color, Cuadrado cuadrado) {
        super(nombre, grosorBorde, color);
    }

    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    @Override
    public double CalcularVolumen() {
        double volumen = Math.pow(this.cuadrado.getLado(), 3);
        return volumen;
    }

    @Override
    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
