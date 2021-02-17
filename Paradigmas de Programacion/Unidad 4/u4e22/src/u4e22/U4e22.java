package u4e22;

import java.util.Scanner;

public class U4e22 {

    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese valor:");
        num = e.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = num-i-1; num > j; j++) {
                System.out.print("*");
            }
            System.out.println("");
           // num--;
        }
        
    }
    
}
