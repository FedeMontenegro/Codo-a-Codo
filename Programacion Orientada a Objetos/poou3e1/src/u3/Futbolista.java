package u3;

public class Futbolista {

    private String nombre;
    private int numero;
    private Posicion pos;
    
    public Futbolista() {
    }

    public Futbolista(String nombre, int numero, Posicion pos) {
        this.nombre = nombre;
        this.numero = numero;
        this.pos = pos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public Posicion getPos() {
        return pos;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "*****Futbolista*****" + "\n nombre: " + nombre + "\n numero: " + numero + "\n pos: " + pos;
    }
    
}