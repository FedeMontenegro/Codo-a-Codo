package epu6e1;

import java.util.Scanner;


public class Epu6e1 {

    
    public static void main(String[] args) {
        
    Scanner e = new Scanner(System.in);
        
    
    int[] arreglo = new int[5];
    
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Inserte numero");
            arreglo[i] = e.nextInt();
        }
    
        System.out.print("Contenido de arreglo = {");
        for (int i = 0; i < arreglo.length; i++) {
            
            System.out.print( arreglo[i]);
            if (i < arreglo.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
    
}
