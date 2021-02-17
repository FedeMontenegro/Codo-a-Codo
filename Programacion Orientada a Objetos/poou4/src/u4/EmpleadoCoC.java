package u4;

public class EmpleadoCoC {
    
    protected String nombre;
    protected String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public EmpleadoCoC() {
    }

    public EmpleadoCoC(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public String GetCategoria(int edad){
        if (edad<=21) {
            return "Principiante";
        }else if (edad >= 22 && edad<=55) {
            return "Intermedio";
        }else{
            return "Senior";
        }
    }

    @Override
    public String toString() {
        return "*****Empleado Codo a Codo*****" + "\n Nombre: " + nombre + "\n Cédula: " + cedula + "\n Edad: " + edad + "\n Casado: " + casado + "\n Salario: " + salario;
    }
    
    public boolean IncrementarSalario(double porcentaje){
        this.salario += this.salario*porcentaje;
        return true;
    }
   
}
