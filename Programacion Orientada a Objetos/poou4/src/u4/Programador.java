package u4;

public class Programador extends EmpleadoCoC{

    private int lineaCodigoPorhora;
    private String lenguajeDominante;
    
    public Programador() {
    }
    
    public Programador(int lineaCodigoPorhora, String lenguajeDominante, String nombre, String cedula, int edad, boolean casado, double salario) {
        super(nombre, cedula, edad, casado, salario);
        this.lineaCodigoPorhora = lineaCodigoPorhora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineaCodigoPorhora() {
        return lineaCodigoPorhora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLineaCodigoPorhora(int lineaCodigoPorhora) {
        this.lineaCodigoPorhora = lineaCodigoPorhora;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return super.toString() + "\n -> Programador." + "\n Linea Codigo Por hora: " + lineaCodigoPorhora + "\n Lenguaje Dominante: " + lenguajeDominante;
    }
        
}
