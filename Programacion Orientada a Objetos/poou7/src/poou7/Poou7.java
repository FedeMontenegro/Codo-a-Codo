package poou7;

import java.util.Scanner;
import poou7.Ejercicios.*;

public class Poou7 {

    public static void main(String[] args) throws ExcepcionE7{

        Scanner entrada = new Scanner(System.in);
        String palabra;
        String r = "";
        
        System.out.println("Ingresar palabra:");
        palabra = entrada.nextLine();
        
        System.out.println("Ingresar numero de carácter");
        int num = entrada.nextInt();
        
        Ejercicio7 e1 = new Ejercicio7(palabra);
        
        try{
           
            System.out.println(e1.CaracterEn(palabra, num));
            
        }catch(ExcepcionE7 e){
            r = e.getMessage();
            System.out.println(r);
        }
        
    }
}
