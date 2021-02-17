package u4;

import java.util.*;

public class Supermercado {
    
    List<Compra> carrito = new ArrayList<Compra>();

    public Supermercado() {
    }
    
    public void InsertarProducto(List<Compra>carrito, Compra compra){
        this.carrito = carrito;
        
        carrito.add(compra);
    }
    
    public void GetCarrito(List<Compra>carrito){
        
        System.out.println("***********************Compra***********************");
        System.out.println("Nombre de producto     Precio     Cantidad     Total");
        
        
        for (Compra carro : carrito) {
            System.out.println(carro.toString());
        }
        this.PrecioFinal(carrito);
    }
    
    public void PrecioFinal(List<Compra> carrito){
        
        int precioFinal = 0;
        int total = 0;
        
        for (Compra carro : carrito) {
            precioFinal += carro.getPrecio()*carro.getCantidad();
        }
        System.out.println("Precio Final                                 "+ precioFinal);
    }
}
