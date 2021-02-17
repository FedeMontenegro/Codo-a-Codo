package u4;

public class Compra extends Producto {

    private int total;
    private Producto producto;

    public Compra() {
    }

    public Compra(String nombre, int precio, int cantidad, int total) {
        super(nombre, precio, cantidad);
        this.total = total;
    }

    public Compra(Producto producto, int total) {
        this.total = total;
        this.producto = producto;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public int CalcularTotal(Producto producto, int total){
        
        total = producto.getPrecio() * producto.getCantidad();
        
        return total;
    }

    /*@Override
    public String toString() {
        return "***********************Compra***********************\n"+ "Nombre de producto    Precio     Cantidad      Total\n" + super.toString() + total;
    }*/

    @Override
    public String toString() {
        return super.toString() + this.getTotal();
    }
    
}

//El codigo comentado a continuacion debe ser copiado y pegado en la clase principal del programa.
/*
package poou4;

import java.util.*;
import u4.*;

public class Poou4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();
        Producto p4 = new Producto();
        Producto p5 = new Producto();
        Producto p6 = new Producto();
        
        Compra compra = new Compra();
        Supermercado s1 = new Supermercado();
        List<Compra>carrito = new ArrayList<Compra>();
        
        int total = 0;
        
        p1.setNombre("Arroz");
        p1.setPrecio(55);
        p1.setCantidad(3);
        
        Compra c1 = new Compra(p1.getNombre(), p1.getPrecio(), p1.getCantidad(), compra.CalcularTotal(p1, total));
        //System.out.println(c1.CalcularTotal(p1, total));
        
        p2.setNombre("Fideos");
        p2.setPrecio(60);
        p2.setCantidad(2);
        
        Compra c2 = new Compra(p2.getNombre(), p2.getPrecio(), p2.getCantidad(), compra.CalcularTotal(p2, total));
        //System.out.println(c1.CalcularTotal(p2, total));
        
        p3.setNombre("Coca cola");
        p3.setPrecio(110);
        p3.setCantidad(1);
        
        Compra c3 = new Compra(p3.getNombre(), p3.getPrecio(), p3.getCantidad(), compra.CalcularTotal(p3, total));
        //System.out.println(c1.CalcularTotal(p3, total));
        
        p4.setNombre("Yogurt");
        p4.setPrecio(45);
        p4.setCantidad(4);
        
        Compra c4 = new Compra(p4.getNombre(), p4.getPrecio(), p4.getCantidad(), compra.CalcularTotal(p4, total));
        //System.out.println(c1.CalcularTotal(p4, total));
        
        p5.setNombre("Aceite");
        p5.setPrecio(80);
        p5.setCantidad(2);
        
        Compra c5 = new Compra(p5.getNombre(), p5.getPrecio(), p5.getCantidad(), compra.CalcularTotal(p5, total));
        //System.out.println(c1.CalcularTotal(p5, total));
        
        p6.setNombre("Azucar");
        p6.setPrecio(35);
        p6.setCantidad(3);
        
        Compra c6 = new Compra(p6.getNombre(), p6.getPrecio(), p6.getCantidad(), compra.CalcularTotal(p6, total));
       // System.out.println(c1.CalcularTotal(p6, total));
        
        s1.InsertarProducto(carrito, c1);
        s1.InsertarProducto(carrito, c2);
        s1.InsertarProducto(carrito, c3);
        s1.InsertarProducto(carrito, c4);
        s1.InsertarProducto(carrito, c5);
        s1.InsertarProducto(carrito, c6);
        
        s1.GetCarrito(carrito);
    }
}

*/