package peu6e11;

import java.util.Scanner;

public class Peu6e11 {

    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }
        
        System.out.println("Mostrando contenido del array...");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Casilla "+i+" = "+a[i]);
        }
        
        System.out.println("Seleccione casilla a eliminar");
        int n = e.nextInt();
        
        System.out.println("Eliminando casilla...");
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n){
                a[i] = 0;
            }
        }
        
        System.out.println("Mostrando contenido del array...");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Casilla "+i+" = "+a[i]);
        }
        System.out.println("Proceso finalizado correctamente.");
    }
    
}
