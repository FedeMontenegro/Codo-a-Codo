package pu6e13;

public class Pu6e13 {

    
    public static void main(String[] args) {
    
        int[]a= new int[7];
        
        System.out.println("Cargando filas...");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }
        System.out.println("Proceso finalizado.");
        System.out.println("Mostrando filas...");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Fila " + i + " = "+a[i]);
        }
        
        int mayor = 0, menor = 0;
        System.out.println("Buscando el valor mayor...");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        System.out.println("Valor mayor encontrado. Buscando el segundo valor mayor...");
        for (int i = 0; i < a.length; i++) {
            if (a[i]>menor && a[i]<mayor) {
                menor = a[i];
            }
        }
        System.out.println("Hecho.");
        System.out.println("El valor mayor es " + mayor);
        System.out.println("El segundo valor mayor es " + menor);
        System.out.println("Proceso finalizado correctamente.");
    }
    
}
