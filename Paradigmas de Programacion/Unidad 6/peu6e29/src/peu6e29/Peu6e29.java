package peu6e29;

import java.util.Scanner;

public class Peu6e29 {

    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese nombre y apellido");
        nombre = entrada.nextLine();
        
        nombre = nombre.toLowerCase();
        
        for (int i = 0; i < nombre.length(); i++) {
            if (i==0) {
                nombre = nombre.toUpperCase().substring(i, i+1).concat(nombre.substring(i+1, nombre.length()));
            }else if (nombre.substring(i, i+1).equals(" ")) {
                nombre = nombre.substring(0, i+1).concat(nombre.toUpperCase().substring(i+1, i+2).concat(nombre.substring(i+2, nombre.length())));
            }
        }
        System.out.println(nombre);
    }
    
}
