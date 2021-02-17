package peu6e5;

import java.util.Scanner;


public class Peu6e5 {

    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        String[] a = new String[5];
        
        System.out.println("Ingresando nombres...");
        for (int i = 0; i < a.length; i++) {
            a[i] = e.next();
        }
    
        System.out.println("Ha ingresado los siguientes nombres");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Casilla "+i+", nombre: "+ a[i]);
        }
    }
    
}
