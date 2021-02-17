package u4e1;

import java.util.Scanner;
import java.math.*;
public class U4e1 {

   
    public static void main(String[] args) {
    
        Scanner entrada =new Scanner (System.in);
        
        int area;
        int perimetro;
        
        System.out.println("Ingrese área:");
        area = entrada.nextInt();
        
        area = (int) Math.sqrt(area);
        perimetro = area*4;
        System.out.println("El perímetro es = " + perimetro);
    }
    
}
