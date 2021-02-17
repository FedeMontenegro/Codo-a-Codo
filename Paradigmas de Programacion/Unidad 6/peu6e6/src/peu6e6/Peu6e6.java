package peu6e6;

import java.util.Scanner;

public class Peu6e6 {

    
    public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    int[] a = new int[5];
    int valor;
    
        System.out.println("Ingresando valores...");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }
        
        System.out.println("valores ingresados ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Casilla "+i+", valor = "+a[i]);
        }
        
        System.out.println("Indique valor a localizar");
        valor = e.nextInt();
        
        for(int i = 0; i<a.length;i++){
            if (valor==a[i]) {
                System.out.println("El valor ingresado "+ valor +", se encuentra en la posicion " + i);
            }
        
        }
}
}