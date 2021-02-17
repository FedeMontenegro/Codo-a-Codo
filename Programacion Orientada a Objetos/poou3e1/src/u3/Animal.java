package u3;


public class Animal {
    
    private String raza;
    private String nombre;

    public Animal() {
    }

    public Animal(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Equals(Animal AnimalUno, Animal AnimalDos){
        
        System.out.println("Comparando animales...");
        if(AnimalUno.getNombre().equals(AnimalDos.getNombre())&& AnimalUno.getRaza().equals(AnimalDos.getRaza())){
            System.out.println("Ambos son el mismo animal.");
        }else{
            System.out.println("Son animales diferentes.");
        }
    }
}
