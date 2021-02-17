package u4;

public class Persona{
    
    private String dni = "";
    private String nombre = "";
    private int edad = 0;
    private char sexo = ' ';

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String dni, char sexo) {
        this.dni = dni;
        this.sexo = sexo;
    }

    public Persona(String dni, char sexo, String nombre, int edad) {
        this.dni = dni;
        this.sexo = sexo;
        this.nombre = nombre;
        this.edad = edad;
    }

        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public char getSexo() {
            return sexo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        @Override
        public String toString() {
            return "*****Datos Personales*****" + "\n Nombre: " + this.getNombre() + "\n Dni: " + this.getDni()  + "\n Edad: " + this.getEdad() + "\n Sexo: " + this.getSexo();
        }
    
    public boolean MayorDeEdad(int edad){
        if (edad<18) {
            return false;
        }else{
            return true;
        }
    }
    
}

//Lo que figura a continuacion corresponde a la clase principal. Debe copiarse alli para poder ejecutar el programa.
/*
package poou4;

import java.util.Scanner;
import u4.*;

public class Poou4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresando datos para p1...");
        System.out.println("Inserte el número de dni");
        String dni = entrada.nextLine();
        Persona p1 = new Persona(dni);
        System.out.println("Inserte el nombre");
        String nombre = entrada.nextLine();
        p1.setNombre(nombre);
        System.out.println("Inserte la edad");
        int edad = entrada.nextInt();
        p1.setEdad(edad);
        entrada.nextLine();
        System.out.println("Ingrese el genero");
        char sexo = entrada.next().charAt(0);
        entrada.nextLine();
        p1.setSexo(sexo);
        System.out.println("Datos ingresado correctamente.");
        System.out.println(p1.toString());
        System.out.println("-------------------------------------------------");
        
        //************************************************************************************
        
        System.out.println("Ingresando datos para p2...");
        System.out.println("Inserte el número de dni");
        dni = entrada.nextLine();
        System.out.println("Ingrese el genero");
        sexo = entrada.next().charAt(0);
        Persona p2 = new Persona(dni, sexo);
        entrada.nextLine();
        System.out.println("Inserte el nombre");
        nombre = entrada.nextLine();
        p2.setNombre(nombre);
        System.out.println("Inserte la edad");
        edad = entrada.nextInt();
        p2.setEdad(edad);
        entrada.nextLine();
        System.out.println("Datos ingresado correctamente.");
        System.out.println(p2.toString());
        System.out.println("-------------------------------------------------");
        
        //***********************************************************************************
        
        System.out.println("Ingresando datos para p3...");
        System.out.println("Inserte nombre");
        nombre = entrada.nextLine();
        System.out.println("inserte el número de dni");
        dni = entrada.nextLine();
        System.out.println("Inserte edad");
        edad = entrada.nextInt();
        System.out.println("Inserte el género");
        sexo = entrada.next().charAt(0);
        entrada.nextLine();
        Persona p3 = new Persona(dni, sexo, nombre, edad);
        System.out.println("Datos ingresado correctamente.");
        System.out.println(p3.toString());
        System.out.println("-------------------------------------------------");
        
        //***********************************************************************************
        System.out.println("Solicitando crear Cuenta para p1...");
        ControlEdad(p1);
        System.out.println("--------------------------------------");
        System.out.println("Solicitando crear Cuenta para p2...");
        ControlEdad(p2);
        System.out.println("--------------------------------------");
        System.out.println("Solicitando crear Cuenta para p3...");
        ControlEdad(p3);
        
    }
    
    static void ControlEdad(Persona p){
        
        Scanner entrada = new Scanner(System.in);
        
        if (p.MayorDeEdad(p.getEdad())) {
            Cuenta c = new Cuenta(p);
            System.out.println("Se ha creado la cuenta satisfactoriamente.");
            System.out.println("Ingrese Saldo Actual");
            int Saldo = entrada.nextInt();
            c.Depositar(Saldo);
            System.out.println("Mostrando datos de Cuenta...");
            System.out.println(c.toString());
        }else{
            System.out.println("No posee mayoría de edad.");
        }
    }
}*/