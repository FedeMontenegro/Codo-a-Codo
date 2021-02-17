package poou7.Ejercicios;

public class ExcepcionE7 extends Exception{

    /**
     * Construye un programa “main” en Java que realice las siguientesacciones:
     * Crea un objeto de la clase “Scanner” y lo asocia con la entrada estándar (consola);
     * Lee un objeto de tipo “String” de la misma en un objeto “lecturaTeclado”;
     * Invoca al método “caracterEn” definido en el ejercicio anterior, con el “String” leído de la entrada estándar por consola y el entero “7”, mostrándolo por pantalla;
     * Captura la posible excepción, mostrando por pantalla un mensaje: “Has intentado recuperar una posición de la cadena de caracteres que no existe.”.
     */
    
    public ExcepcionE7(String message) {
        super(message);
    }
    
    
}
