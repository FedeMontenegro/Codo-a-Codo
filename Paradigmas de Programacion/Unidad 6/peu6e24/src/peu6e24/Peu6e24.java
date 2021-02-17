package peu6e24;

import java.util.Scanner;


public class Peu6e24 {


    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        System.out.println("Ingrese numero:");
        String n = e.next();
        
        System.out.println("Cantidad de cifras del numero ingresado = "+ n.length());
        
        if (n.length()== 3) {
            if (Integer.parseInt(n.substring(0,1)) == Integer.parseInt(n.substring(2,3))) {
                System.out.println("El número ingresado es capicúa");
            }else{
                System.out.println("El numero no es capicúa");
            }
        }else if(n.length()==4){
            if (Integer.parseInt(n.substring(0,1)) == Integer.parseInt(n.substring(3,4)) && Integer.parseInt(n.substring(1,2)) == Integer.parseInt(n.substring(2,3))) {
                System.out.println("El numero es capicúa");
            }else{
                System.out.println("El numero no es capicúa");
            }
        }
    }
    
}
