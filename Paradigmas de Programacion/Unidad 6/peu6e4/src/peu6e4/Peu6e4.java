package peu6e4;


public class Peu6e4 {

    
    public static void main(String[] args) {
        
        int[] a = new int[5];
        int n = 0;
        int promedio;
        
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*100);
        }
        
        System.out.println("Lista de valores");
        for (int i = 0; i < a.length; i++) {
            System.out.println("casilla "+i+" = "+a[i]);
            n += a[i];
        }
        System.out.println("Realizando operación...");
        
        promedio = n/a.length;
        System.out.println("El promedio es igual a "+ promedio);
        
    }
    
}
