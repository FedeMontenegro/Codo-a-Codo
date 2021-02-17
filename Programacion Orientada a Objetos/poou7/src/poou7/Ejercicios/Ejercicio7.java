package poou7.Ejercicios;

public class Ejercicio7 {

    public Ejercicio7(String s) {
    }
    
    public String CaracterEn(String a, int b)throws ExcepcionE7{
        
        String msj = "Carácter = ";
        char car;
        
        if (b<0 || b> a.length()-1) {
            
            throw new ExcepcionE7("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }else{
            car = a.charAt(b);
            msj += car;
        
            return msj;
        }
    }
}
