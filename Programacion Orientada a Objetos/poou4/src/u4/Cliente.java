package u4;

import java.util.List;
import java.util.Scanner;

public class Cliente {
    
    private int id;
    private String nombre;
    private List<Cliente>clientes;

    public Cliente() {
    }

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void AgregarCliente(List<Cliente>clientes, Cliente cliente){
        
        Scanner entrada = new Scanner(System.in);
        int id;
        String nom;
        
        System.out.println("Ingresar id");
        id = entrada.nextInt();
        cliente.setId(id);
        entrada.nextLine();
        
        System.out.println("Ingresar nombre");
        nom = entrada.nextLine();
        cliente.setNombre(nom);
        
        System.out.println("Datos ingresados correctamente.");
        System.out.println("Registrando cliente en lista...");
        clientes.add(cliente);
        System.out.println("Registrado correctamente.");
        
    }
}


//El codigo comentado a continuacion debe ser copiado en la clase principal, a fin de poder ejecutar el programa.
/*package poou4;

import java.util.*;
import u4.*;

public class Poou4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //Atributos
        String dato;
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();
        Cliente c5 = new Cliente();
        Local local = new Local();
        List<Cliente> cl = new ArrayList<Cliente>();
        
        //Ingreso de clientes
        c1.AgregarCliente(cl, c1);
        c2.AgregarCliente(cl, c2);
        c3.AgregarCliente(cl, c3);
        c4.AgregarCliente(cl, c4);
        c5.AgregarCliente(cl, c5);
        
        //Muestra de datos ingresados
        System.out.println("Mostrando datos ingresados...");
        for (int i = 0; i < cl.size(); i++) {
            System.out.println(cl.get(i).getId() + "; " + cl.get(i).getNombre());
            
        }
        
        //Busqueda de cliente
        System.out.println("Buscando cliente...");
        System.out.println("Ingrese nombre de cliente a buscar");
        dato = entrada.nextLine();
        System.out.println(local.BuscarCliente(cl, dato));
        System.out.println("Proceso finalizado.");
    }
}*/