package u4e2;

import java.util.Scanner;
public class U4e2 {

    
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    int dividendo;
    int divisor;
    int cociente;
    int resto;
        System.out.println("Ingrese dividendo:");
        dividendo = entrada.nextInt();
        System.out.println("Ingrese divisor:");
        divisor = entrada.nextInt();
        
        cociente = (int)dividendo/divisor;
        resto = dividendo%divisor;
        
        System.out.println("Resultado =" + cociente);
        System.out.println("Resto =" + resto);
    }
    
}
