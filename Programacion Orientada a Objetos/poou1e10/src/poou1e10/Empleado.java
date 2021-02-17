package poou1e10;


public class Empleado {

    //Atributos
    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;
    
    //Método constructor sin parámetros.
    public Empleado() {
    }
    
    //Método constructor con parámetros.
    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
       
    }
    
    /*Este método clasifica al Empleado según su edad. En caso de ser menor de 21 años, el Empleado es Junior,
      en el caso de que tenga entre 21 y 34 años, será Intermedio, y en el caso de que sea mayor de 34, será Senior.*/
    public String ClasificarEdad(){
        if (this.edad<21) {
            return "Junior";
        }else if (this.edad>21 && this.edad<34) {
            return "Intermedio";
        }else{
            return "Senior";
        }
    }

    @Override
    public String toString() {
        return "*****Empleado*****" + "\n Nombre: " + nombre + "\n Cédula: " + cedula + "\n Edad: " + edad + "\n Casado: " + casado + "\n Salario: " + salario;
    }
    
    //Permite aumentar el Salario en un porcentaje pasado por parámetro.
    public void AumentarSalario(double porcentaje){
        
        double aux = this.salario*porcentaje;
        this.salario = this.salario+aux;
    }
}
