package poou6.Compras;

import java.util.List;

public class Articulo {

    private String nombre;
    private int monto;
    private int cantidad;
    private int total;

    public Articulo() {
    }

    public Articulo(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public Articulo(String nombre, int monto, int cantidad) {
        this.nombre = nombre;
        this.monto = monto;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMonto() {
        return monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
