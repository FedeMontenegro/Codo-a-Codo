package Figura;

public abstract class Figura {

    private String nombre;
    private int grosorBorde;
    private int color;

    public Figura() {
    }

    public Figura(String nombre, int grosorBorde, int color) {
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrosorBorde() {
        return grosorBorde;
    }

    public int getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    abstract public void Dibujar();
}
