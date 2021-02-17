package peu6e21;

import java.util.Scanner;

public class Peu6e21 {

    
    public static void main(String[] args) {
    
        Scanner e = new Scanner(System.in);
        
        String p1 ="", p2="", p3="";
        
        System.out.println("Ingrese términos");
        p1 = e.next();
        p2 = e.next();
        p3 = e.next();
        
        String cadena = p3+" "+p2+" "+p1;
        
        System.out.println("Mostrando resultado...");
        System.out.println("Cadena = "+ cadena + ", con longitud = "+ cadena.length());
        
        
        
    }
    
}
