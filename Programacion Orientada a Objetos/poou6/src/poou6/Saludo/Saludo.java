package poou6.Saludo;

import javax.swing.JOptionPane;

public class Saludo {
    
    private String saludar;

    public Saludo() {
    }

    public Saludo(String saludar) {
        this.saludar = saludar;
    }

    public String getSaludar() {
        return saludar;
    }

    public void setSaludar(String saludar) {
        this.saludar = saludar;
    }
    
    public void Saluda(){
        
        String saludo = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Opciones", JOptionPane.QUESTION_MESSAGE, null, new String[]{"Saludar", "Despedir", "Salir"}, "Saludo");
        
        if (saludo.equals("Saludar")) {
            String nombre = JOptionPane.showInputDialog("Ingrese nombre");
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Ningún nombre ingresado.");
            }else if(Integer.parseInt(nombre) == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "Saliendo...", "mensaje", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Hola, " + nombre);
            }
        }else if (saludo.equals("Despedir")) {
                JOptionPane.showMessageDialog(null, "¡Adiós!");
        }else {
                JOptionPane.showMessageDialog(null, "Saliendo...", "mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
   
}

//Copiar este codigo en la clase principal para ejecutar el programa correctamente.
/*package poou6;

import java.util.*;
import javax.swing.JOptionPane;
import poou6.Saludo.Saludo;

public class Poou6 {

    public static void main(String[] args) {
        
    /**
     * Hacer un menú muy sencillo. El menú se mostrará por pantalla y tendrá las siguientes opciones:
     * 1. Saludar
     * 2. Despedirse
     * 3. Salir
     * Si el usuario introduce un 1, el programa le pedirá el nombre lo saludará: Hola Pepito
     * Si el usuario introduce un 2, el programa se despedirá: Adiós
     * Si el usuario introduce un 3, el programa terminará.
     * Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y
     * resultados.
     */    
        
/*        Saludo s1 = new Saludo();
        
        s1.Saluda();
    }
    
    
    
}
*/