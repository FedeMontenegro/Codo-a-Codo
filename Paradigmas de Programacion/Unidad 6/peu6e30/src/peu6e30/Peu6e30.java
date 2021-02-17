package peu6e30;

import java.util.Scanner;


public class Peu6e30 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int[] a;
        int l, menor = 0, mayor = 0, aux;
        
        System.out.println("Ingrese tamaño del array");
        l = entrada.nextInt();
        
        a = new int[l];
        
        System.out.println("Insertando registros...");
        for (int i = 0; i < a.length; i++) {
            
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Mostrando registros ingresados...");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posición " + i + ", registro = " + a[i]);
        }
        
        System.out.println("Ordenando registros...");
        
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]>a[j+1]) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        
        System.out.println("Recorriendo array...");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posición " + i + ", registro = " + a[i]);
        }
    }
    
}
