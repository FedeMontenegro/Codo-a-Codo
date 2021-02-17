package Figura.Figura3D;

import Figura.Figura;
import Figura.Figura2D.Triangulo;

public final class Piramide extends Figura3D{

    private int altura;
    private Triangulo triangulo;

    public Piramide() {
    }

    public Piramide(String nombre, int grosorBorde, int color, Triangulo triangulo, int altura) {
        super(nombre, grosorBorde, color);
        this.altura = altura;
        this.triangulo = triangulo;
    }

    public int getAltura() {
        return altura;
    }

    public Triangulo GetTriangulo(){
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
    
    @Override
    public double CalcularVolumen(){
        Triangulo triangulo;
        triangulo = this.triangulo;
        double volumen = triangulo.getAltura()*triangulo.getBase()/3;
        return volumen;
    }

    @Override
    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
