package peu6e25;

import java.util.Scanner;

public class Peu6e25 {

    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        String cadena = "";
        
        System.out.println("Ingrese cadena");
        cadena = e.nextLine();
        
        System.out.println(Iniciales(cadena));
        
        
    }
    static String Iniciales(String cadena){
        
        
        String c = "";
        
        for (int i = 0; i < cadena.length(); i++) {
            //System.out.println(cadena.charAt(i));
            if (i==0) {
                c = cadena.substring(i, i+1);
            }else if (cadena.substring(i,i+1).equals(" ")) {
                c = c.concat(cadena.substring(i+1, i+2));
            }
        }
        
        c = c.toUpperCase();
        return c;
    }
}