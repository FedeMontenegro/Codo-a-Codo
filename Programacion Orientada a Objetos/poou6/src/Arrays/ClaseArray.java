package Arrays;

import java.util.*;
import javax.swing.JOptionPane;

public class ClaseArray {
    
    public ClaseArray() {
    }

    /**
     * Llena un ArrayList con los datos que ingrese el usuario.
     * @param El ArrayList en el que se cargarán los valores correspondientes.
     */
     
    public void LlenarArrays(List<Integer>a){
        
        int ax = 0;
        
        while(ax == JOptionPane.YES_OPTION){
            
            a.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor: ")));
            ax = JOptionPane.showConfirmDialog(null, "¿Desea seguir cargando valores?", "Array A", JOptionPane.YES_NO_OPTION);
            if (ax == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Carga finalizada.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    /**
     * @param a Primer ArrayList
     * @param b Segundo ArrayList
     * @param c Tercer ArrayList (ArrayList a + ArrayList b)
     */
    public void LlenarArrays(List<Integer>a, List<Integer>b, List<Integer>c){
        
        int suma = 0;
        
        for(int i = 0; i < a.size();i++){
            suma = a.get(i) + b.get(i);
            c.add(suma);
        }
        JOptionPane.showMessageDialog(null, "Carga finalizada.");
    }
    
    /**Muestra la información contenida en el ArrayList solicitado.
     * 
     * @param arreglo: El cual se utilizará para devolver los registros que correspondan
     * @return Devuelve los registros que posea el ArrayList.
     */
    public String toString(List<Integer>arreglo){
        
        String cadena = "";
        int j = 0;
        
        for(int i : arreglo){
            cadena += "Casilla " + j + ", valor: " + i + "\n";
            j++;
        }
        
        String mensaje = cadena + "\n";
        return mensaje;
    }
}

//Pegar el codigo a continuacion, en la clase principal, para ejecutar el programa correctamente.
/*package poou6;

import Arrays.ClaseArray;
import java.util.*;
import javax.swing.JOptionPane;

public class Poou6 {

    public static void main(String[] args) {
        
    /**
     * Ejercicio nº3, unidad 6, Programa Codo a Codo
     * Se ingresan 5 números pertenecientes al arreglo A y otros 5 números pertenecientes al arreglo
     *B. La computadora muestra un arreglo C, donde cada posición es el resultado de la suma del
     *número en la misma posición en el arreglo A con el número en la misma posición en el arreglo
     *B. Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 5 9 4 7 11. Usar la clase
     *JOptionPane tanto para cargar datos como para mostrar mensajes y resultados
     */    
        
      /*  ClaseArray a1 = new ClaseArray();
        
        List<Integer> a = new ArrayList();
        List<Integer> b = new ArrayList();
        List<Integer> c = new ArrayList();
        
        int ax = 0;
        int suma = 0;
        
        JOptionPane.showMessageDialog(null, "Array A");
        
        a1.LlenarArrays(a);
        
        ax = 0;
        JOptionPane.showMessageDialog(null, "Array B");
        
        a1.LlenarArrays(b);
        
        JOptionPane.showMessageDialog(null, "Cargando valores en Array C...");
        
        a1.LlenarArrays(a, b, c);
        
        JOptionPane.showMessageDialog(null, "Cargando información de Array a...");
        JOptionPane.showMessageDialog(null, a1.toString(a));
        JOptionPane.showMessageDialog(null, "Cargando información de Array b...");
        JOptionPane.showMessageDialog(null, a1.toString(b));
        JOptionPane.showMessageDialog(null, "Cargando información de Array c...");
        JOptionPane.showMessageDialog(null, a1.toString(c));
        
        JOptionPane.showMessageDialog(null, "Cargando información de Arrays...");
        String msj = a1.toString(a) + a1.toString(b) + a1.toString(c);
        
        JOptionPane.showMessageDialog(null, msj);
        
    }*/