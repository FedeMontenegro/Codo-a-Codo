package poou6.Sueldo;

import java.util.*;

public class Meses {
    
    
    private int sueldo;
    private String nombre;

    public Meses(){
        
    }

    public Meses(int sueldo) {
        this.sueldo = sueldo;
    }

    public Meses(String nombre) {
        this.nombre = nombre;
    }

    public Meses(int sueldo, String nombre) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cargarMeses(List<Meses>meses){
        Meses Enero = new Meses("Enero");
        Meses Febrero = new Meses("Febrero");
        Meses Marzo = new Meses("Marzo");
        Meses Abril = new Meses("Abril");
        Meses Mayo = new Meses("Mayo");
        Meses Junio = new Meses("Junio");
        Meses Julio = new Meses("Julio");
        Meses Agosto = new Meses("Agosto");
        Meses Septiembre = new Meses("Septiembre");
        Meses Octubre = new Meses("Octubre");
        Meses Noviembre = new Meses("Noviembre");
        Meses Diciembre = new Meses("Diciembre");
        
        meses.add(Enero);
        meses.add(Febrero);
        meses.add(Marzo);
        meses.add(Abril);
        meses.add(Mayo);
        meses.add(Junio);
        meses.add(Julio);
        meses.add(Agosto);
        meses.add(Septiembre);
        meses.add(Octubre);
        meses.add(Noviembre);
        meses.add(Diciembre);
    }
}
