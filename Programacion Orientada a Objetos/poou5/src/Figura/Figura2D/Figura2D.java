package Figura.Figura2D;

import Figura.Figura;

public abstract class Figura2D extends Figura{

    public Figura2D() {
    }

    public Figura2D(String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
    }
    
    abstract double CalcularArea();
    
    abstract public double CalcularPerimetro();
}
