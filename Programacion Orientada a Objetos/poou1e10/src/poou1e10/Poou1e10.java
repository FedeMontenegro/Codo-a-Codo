package poou1e10;

public class Poou1e10 {


    public static void main(String[] args) {

        
        Empleado Fede = new Empleado("Federico Montenegro", "35967209", 28, false, 180000.000);
        
        
        System.out.println(Fede.toString());
        Fede.AumentarSalario(0.25);
        System.out.println(Fede.toString());
        System.out.println(Fede.ClasificarEdad());
    }
    
}
