package poou7.Ejercicios;

public class Ejercicio6{

    /**
     * Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:
     * Recibe como parámetros una cadena (String) y un entero(int);
     * Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length():  int”  de  la  clase  “String”)  
     * devuelve  el  carácter  en  la  posición correspondiente (puedes hacer uso del método “charAt(int)” de la clase “String”);
     * En caso contrario, construye y lanzauna excepción de tipo“Exception”.
     */
    
    public Ejercicio6() {
    }
    
    public String CaracterEn(String a, int b)throws StringIndexOutOfBoundsException{
        
        String msj = "Carácter = ";
        char car = a.charAt(b);
        
        msj += car;
        
        return msj;
    }
    
}

//Copiar el código a continuacíón en la clase principal para ejecutar el programa oorrectamente.
/*package poou7;

import poou7.Ejercicios.Ejercicio6;

public class Poou7 {

    public static void main(String[] args) throws StringIndexOutOfBoundsException{

        String msj;
        try{
        Ejercicio6 e1 = new Ejercicio6();
        System.out.println(e1.CaracterEn("cosas", 6));
        }catch(StringIndexOutOfBoundsException e){
            msj = "Error : " + e.getMessage();
            System.out.println(msj);
        }
    }
    
}*/