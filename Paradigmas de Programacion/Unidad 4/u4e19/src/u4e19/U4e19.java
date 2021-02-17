package u4e19;

import java.util.Scanner;

public class U4e19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese numero:");
        num = e.nextInt();
        
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            num--;
            System.out.println("");
        }
    }
    
}
