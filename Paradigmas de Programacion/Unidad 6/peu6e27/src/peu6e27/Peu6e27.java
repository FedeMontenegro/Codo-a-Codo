package peu6e27;

import java.util.Scanner;

public class Peu6e27 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String palabra;
        int conteoVocal = 0;
        int conteoConsonante = 0;
        
        System.out.println("Ingrese palabra");
        palabra = entrada.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.substring(i, i+1).equalsIgnoreCase("a")||palabra.substring(i, i+1).equalsIgnoreCase("e")||palabra.substring(i, i+1).equalsIgnoreCase("i")||palabra.substring(i, i+1).equalsIgnoreCase("o")||palabra.substring(i, i+1).equalsIgnoreCase("u")){
                conteoVocal++;
            }else{
                conteoConsonante++;
            }
        }
        
        System.out.println("La palabra contiene "+ conteoVocal+ " vocales y "+conteoConsonante+" consonantes.");
    }
    
}
