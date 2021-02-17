package poou6.Sueldo;

import java.util.*;
import javax.swing.JOptionPane;

public class Sueldos {
    
    private List<Meses>carga = new ArrayList();
    
    Meses meses;

    public Sueldos() {
    }

    public Sueldos(List<Meses>carga) {
        this.carga = carga;
    }
    
    public void CargarSalario(List<Meses>carga){
        
        String mes = "";
        int sueldo = 0;
        int i = 0;
        int sueldoTotal = 0;
        int fin;
        
        JOptionPane.showMessageDialog(null, "Cargando salarios...", "Carga de sueldos mensuales.", JOptionPane.INFORMATION_MESSAGE);
        
            while(sueldo >=0){
                carga.get(i).setSueldo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario correspondiente al mes de " + carga.get(i).getNombre())));
                sueldo = carga.get(i).getSueldo();
                
                if (sueldo < 0) {
                    JOptionPane.showMessageDialog(null, "Proceso Finalizado.");
                }
                sueldoTotal += sueldo;
                i++;
                
            }
        JOptionPane.showMessageDialog(null, "Salario anual = " + sueldoTotal);
       }
        
}

//Cargar este codigo en la clase principal para ejecutar el programa correctamente.
/*package poou6;

import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import poou6.Sueldo.Meses;
import poou6.Sueldo.Sueldos;

public class Poou6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Sueldos s1 = new Sueldos();
        Meses m1 = new Meses();
        List<Meses>sal = new ArrayList();
        
        m1.cargarMeses(sal);
        s1.CargarSalario(sal);
        
    }
    
}*/