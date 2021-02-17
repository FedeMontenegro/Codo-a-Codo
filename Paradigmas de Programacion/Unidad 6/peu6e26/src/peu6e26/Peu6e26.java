package peu6e26;

import java.util.Scanner;


public class Peu6e26 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese nombre");
        nombre = entrada.nextLine();
        
        for (int i = nombre.length()-1; i >= 0 ; i--) {
            System.out.print(nombre.charAt(i));
        }
        System.out.println("");
        System.out.println("Proceso completo.");
    }
    
}
