package peu6e12;

import java.util.Scanner;

public class Peu6e12 {

    
    public static void main(String[] args) {
    
        Scanner e = new Scanner(System.in);
        
        int[]a;
        int t;
        int multiplo;
        
        System.out.println("Seleccione el tamaño del Array");
        t = e.nextInt();
        a = new int[t];
        
        System.out.println("Especifique multiplicador");
        multiplo = e.nextInt();
        
        System.out.println("Insertando filas...");
        Multiplos(a, multiplo);
        
        System.out.println("Hecho. Mostrando contenido del Array...");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Fila "+i+" = "+ a[i]);
        }
    }
    
    static int Multiplos(int[]a, int m){
        for (int i = 0; i < a.length; i++) {
            a[i] = m*i;
        }
        return 1;
    }
}
