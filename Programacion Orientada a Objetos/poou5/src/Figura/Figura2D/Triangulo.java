package Figura.Figura2D;

import Figura.Figura;
import java.util.Scanner;

public final class Triangulo extends Figura2D {
    
    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(String nombre, int base, int altura, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double CalcularArea() {
        double area = (this.base*this.altura)/2;
        return area;
    }
    
    @Override
    public double CalcularPerimetro() {
        double perimetro;
        double a = 0, b = 0;
        Scanner e = new Scanner(System.in);
        Figura f = null;
        
        if(this.altura == this.base) {
            System.out.println("Triángulo equilátero");
            perimetro = this.altura*3;
            return perimetro;
        }else{
            System.out.println("Especifique lado a");
            a = e.nextInt();
            if (this.altura == a) {
                System.out.println("Triangulo isóseles");
                
            }else{
                System.out.println("Triángulo escaleno");
            }
            perimetro = this.altura + a + this.base;
            return perimetro;
    }
    }

    @Override
    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int CambiarTamanio(){
        return 0;
    }
    
}
