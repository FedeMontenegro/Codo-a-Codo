package peu6e13;

public class Peu6e13 {

    
    public static void main(String[] args) {
    
        int b = 3, c = 3;
        int[][]a = new int [b][c];
        
        System.out.println("Cargando filas...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("Completado. Mostrando filas...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Columna "+ i + ", fila = "+ j + " = "+ a[i][j]);
            }
        }
        System.out.println("Proceso finalizado correctamente.");
    }
    
}
