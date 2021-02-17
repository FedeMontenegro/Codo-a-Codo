package peu6e20;

import java.util.Scanner;

public class Peu6e20 {

    
    public static void main(String[] args) {
    
        Scanner e = new Scanner(System.in);
        String palabra;
        
        System.out.println("Ingrese una palabra");
        palabra = e.next();
        
        System.out.println("Resultado: "+ palabra.toUpperCase());
    }
    
}
