package Figura.Figura2D;

public final class Cuadrado extends Figura2D {
    
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        double area = this.lado*this.lado;
        return area;
    }

    @Override
    public double CalcularPerimetro() {
        double perimetro = this.lado*4;
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
