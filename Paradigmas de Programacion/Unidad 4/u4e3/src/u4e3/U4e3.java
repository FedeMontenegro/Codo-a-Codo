package u4e3;

import java.util.Scanner;
public class U4e3 {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
    int dividendo;
    int divisor;
    int cociente;
    
        System.out.println("Ingrese dividendo:");
        dividendo = entrada.nextInt();
        System.out.println("Ingrese divisor:");
        divisor = entrada.nextInt();
        
        cociente = dividendo/divisor;
        
        
        System.out.println("Resultado =" + (double)cociente);
        
        
    }
    
}
