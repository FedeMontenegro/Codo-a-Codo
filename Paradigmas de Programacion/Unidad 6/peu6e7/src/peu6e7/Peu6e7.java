package peu6e7;

import java.util.Scanner;

public class Peu6e7 {

         
    public static void main(String[] args) {
    
        Scanner e = new Scanner(System.in);
        
        int[]a;
        int b, c;
        
        
        System.out.println("Ingrese valores");
        b = e.nextInt();
        c = e.nextInt();
        
        a = new int[b];
        
        System.out.println("Insertando multiplos de "+ c);
        for (int i = 0; i < a.length; i++) {
            
            a[i]= c*i;
            System.out.println("Casilla "+i+", multiplo = "+ a[i]);
        }
        
    }
    
}
