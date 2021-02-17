package Figura.Figura3D;

import Figura.Figura;

public abstract class Figura3D extends Figura {

    public Figura3D() {
    }

    public Figura3D(String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
    }

    public abstract double CalcularVolumen();
}
