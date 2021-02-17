package poou6.Compras;

import java.util.*;
import javax.swing.JOptionPane;

public class Compra {

    
    private List<Articulo>inventario = new ArrayList();
    private List<Articulo> compra = new ArrayList();
    private Articulo articulo;
    private int montoTotal;
    
    

    public Compra() {
    }

    public Compra(List <Articulo> inventario) {
        
        inventario = this.inventario;
        
        
    }
    
    public void AgregarArticulo(List<Articulo>inventario, Articulo articulo){
        
        this.inventario = inventario;
        inventario.add(articulo);
        
    }
    
    public void CargarCompra(List<Articulo>compra){
        this.compra = compra;
        int cantidad = 0;
        int respuesta = 0;
        while(respuesta == JOptionPane.YES_OPTION){
        String ax = JOptionPane.showInputDialog("Ingrese articulo");
        
        for (int i = 0; i < this.inventario.size(); i++) {
            if (inventario.get(i).getNombre().equalsIgnoreCase(ax)) {
                compra.add(inventario.get(i));
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de articulos:"));
                inventario.get(i).setCantidad(cantidad);
                inventario.get(i).setTotal(inventario.get(i).getMonto()*inventario.get(i).getCantidad());
                //montoTotal += inventario.get(i).getTotal();
                //inventario.get(i).setMontoTotal(inventario.get(i).getMontoTotal()+inventario.get(i).getTotal());
                
            }
        }
        
        
        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea seguir ingresando productos?");
            if (respuesta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Compra finalizada.", null, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public void ImprimirTicket(List<Articulo>compra){
        
        String cabecera = "***********************Compra************************" + "\nNombre de producto\tPrecio\tCantidad\tTotal";
        String cuerpo = "";
        String ultimaLinea = "\nPrecio Final                                 \t";
        int j = 0;
        
        //this.total = total = compra.get(j).getMonto()*compra.get(j).getCantidad();
        for (Articulo com: compra) {
            cuerpo = cuerpo.concat("\n"+ com.getNombre() + this.Esp(compra, j) +"\t"+ com.getMonto() + "\t" + com.getCantidad() + "\t"+ "\t" + com.getTotal());
            j++;
            this.montoTotal += com.getTotal();
        }
        ultimaLinea += this.montoTotal;
        String ticket = cabecera + cuerpo + ultimaLinea;
        System.out.println(ticket);
        JOptionPane.showMessageDialog(null, ticket);
    }
    
    public String Esp(List<Articulo>compra, int j){
        String titulo = "Nombre de producto";
        int espacio = 0;
        String aux = "";
        if (compra.get(j).getNombre().length()<titulo.length()) {
            espacio = titulo.length() - compra.get(j).getNombre().length();
        }else if (compra.get(j).getNombre().length()>titulo.length()) {
            espacio = compra.get(j).getNombre().length()-titulo.length();
        }else{
            espacio = titulo.length();
        }
        for (int i = 0; i < espacio; i++) {
            aux = aux.concat(" ");
        }
        return aux;
    }
    
    
}

/*cuerpo = cuerpo.concat("\n"+ com.getNombre() + "                   " + com.getMonto() + "          " + com.getCantidad() + "             ");
String cabecera = "***********************Compra***********************" + "\nNombre de producto     Precio     Cantidad     Total";*/


//Pegar este codigo en la clase principal para ejecutar el programa correctamente
/*package poou6;

import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import poou6.Compras.*;

public class Poou6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "Creando lista de productos...");
        Articulo a1 = new Articulo("Milanesa", 100);
        Articulo a2 = new Articulo("Arroz", 35);
        Articulo a3 = new Articulo(" Fideo tallarines", 40);
        Articulo a4 = new Articulo("Pure de tomate", 25);
        Articulo a5 = new Articulo("Arvejas", 15);
        Articulo a6 = new Articulo("Leche", 10);
        Articulo a7 = new Articulo("Ravioles", 50);
        Articulo a8 = new Articulo("Harina", 20);
        Articulo a9 = new Articulo("Huevos", 5);
        Articulo a10 = new Articulo("Galletas", 25);
        
        JOptionPane.showMessageDialog(null, "Hecho", "suceso!!", JOptionPane.INFORMATION_MESSAGE);
        List <Articulo>Inventario = new ArrayList<Articulo>();
        
        JOptionPane.showMessageDialog(null, "Cargando productos en inventario...");
        Compra c1 = new Compra();
        c1.AgregarArticulo(Inventario, a1);
        c1.AgregarArticulo(Inventario, a2);
        c1.AgregarArticulo(Inventario, a3);
        c1.AgregarArticulo(Inventario, a4);
        c1.AgregarArticulo(Inventario, a5);
        c1.AgregarArticulo(Inventario, a6);
        c1.AgregarArticulo(Inventario, a7);
        c1.AgregarArticulo(Inventario, a8);
        c1.AgregarArticulo(Inventario, a9);
        c1.AgregarArticulo(Inventario, a10);
        
        JOptionPane.showMessageDialog(null, "Hecho", "suceso!!", JOptionPane.INFORMATION_MESSAGE);
        
        List<Articulo> c = new ArrayList();
        
        c1.CargarCompra(c);
        c1.ImprimirTicket(c);
        
    }
    
}*/