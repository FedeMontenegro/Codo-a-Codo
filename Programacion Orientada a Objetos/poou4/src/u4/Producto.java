package u4;

public class Producto {
    
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + "                   " + precio + "          " + this.cantidad + "             ";
    }
    
    
}

/*
***********************Compra***********************
Nombre de producto    Precio     Cantidad      Total
nombre                **.**      x             **.**
*/