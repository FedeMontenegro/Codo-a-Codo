package Interface;

import java.util.*;

public class Pila implements IColeccion {
    
    private List<Object> coleccion = new ArrayList<Object>();
    private int contador;

    public Pila(int contador) {
        this.contador = contador;
    }

    @Override
    public boolean EstaVacia() {
        if (coleccion.isEmpty()) {
            return true;
        }else{
            return true;
        }
    }

    @Override
    public Object Extraer() {
        if (coleccion.size()== 0) {
            return null;
        }else{
            contador--;
            return coleccion.get(contador);
        }
    }

    @Override
    public Object Primero() {
        if (coleccion.size()==0) {
            return null;
        }else{
            return coleccion.get(contador);
        }
    }

    @Override
    public boolean Agregar(List<Object>coleccion, Object object) {
        this.coleccion = coleccion;
        if (this.contador<=coleccion.size()) {
            coleccion.add(object);
            contador++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String colec = "";
        contador = 0;
        for (int i = 0; i < coleccion.size(); i++) {
            colec = colec.concat("Posicion: " + contador + "; Objeto: " + coleccion.get(i) + "\n");
            contador++;
        }
        
        return colec;
    }

}


//Pegar este codigo en la clase principal para ejecutar el programa.
/*package poou5;

import Interface.Pila;
import java.util.*;

public class Poou5 {

    public static void main(String[] args) {

        Pila p = new Pila(0);
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        Object e = new Object();
        List<Object>coleccion = new ArrayList<>();
        
        p.Agregar(coleccion, a);
        p.Agregar(coleccion, b);
        p.Agregar(coleccion, c);
        p.Agregar(coleccion, d);
        p.Agregar(coleccion, e);
        
        System.out.println(p.toString());
    }
    
}*/