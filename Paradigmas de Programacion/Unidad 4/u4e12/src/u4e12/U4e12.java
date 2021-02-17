package u4e12;

import java.util.Scanner;
public class U4e12 {

    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        String letra;
        
        System.out.println("Ingrese letra:" );
        letra = e.nextLine();
        
        switch(letra){
            case "a":
                System.out.println("Ha ingresado una vocal");
                break;
            case "e":
                System.out.println("Ha ingresado una vocal");
                break;
            case "i":
                System.out.println("Ha ingresado una vocal");
                break;
            case "o":
                System.out.println("Ha ingresado una vocal");
                break;
            case "u":
                System.out.println("Ha ingresado una vocal");
                break;
            default:
                System.out.println("Ha ingresado una consonante");
        }
    }
    
}
