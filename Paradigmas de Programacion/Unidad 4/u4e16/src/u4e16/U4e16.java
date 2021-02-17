package u4e16;

import java.util.Scanner;
        
public class U4e16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        int num;
        int inc;
        
        System.out.println("Ingrese número:");
        num = e.nextInt();
        inc = num+10;
        do{
            num++;
            System.out.println(num);
            
        }while(num<inc);
    }
    
}
