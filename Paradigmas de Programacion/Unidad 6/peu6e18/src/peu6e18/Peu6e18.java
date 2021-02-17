package peu6e18;

public class Peu6e18 {

    
    public static void main(String[] args) {
    
        int a = 4, b =4, conteo = 0;
        boolean[][]c = new boolean[a][b];
        c[0][0] = true;
        c[0][1] = false;
        c[0][2] = true;
        c[0][3] = true;
        c[1][0] = true;
        c[1][1] = false;
        c[1][2] = false;
        c[1][3] = false;
        c[2][0] = true;
        c[2][1] = true;
        c[2][2] = true;
        c[2][3] = true;
        c[3][0] = false;
        c[3][1] = false;
        c[3][2] = false;
        c[3][3] = true;
                
        System.out.println("Realizando conteo de butacas vacias...");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (c[i][j]==false) {
                    conteo++;
                }
            }
            
        }
        System.out.println("El numero de butacas vacias es " + conteo);
        System.out.println("Proceso finalizado correctamente");
    }
    
}
