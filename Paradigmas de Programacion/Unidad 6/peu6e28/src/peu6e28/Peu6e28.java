package peu6e28;

import java.util.Scanner;

public class Peu6e28 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cadena;
        int conteo = 0;
        
        System.out.println("Ingrese cadena");
        cadena = entrada.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            
            if (cadena.substring(i, i+1).equals(" ")|| i+1==cadena.length()) {
                conteo++;
            }
        }
        
        System.out.println("La cadena contiene "+ conteo+ " palabras.");
    }
    
}
