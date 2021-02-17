package poou6.Ventana;

import java.awt.*;
import javax.swing.*;


public class Ventana7 extends JFrame{
    
    /**
     * Crear una ventana con las siguientes características:
     * Título= “Ventana con botones”
     * Ubicación= centrada - Tamaño= “600 píxeles * 400 píxeles”
     * Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
     * Dentro de la ventana se debe colocar 3 botones con los textos: “Azul”, “Rojo” y “Amarillo”
     */
    
    private Container contenedor;
    private JButton azul = new JButton();
    private JButton rojo = new JButton();
    private JButton amarillo = new JButton();

    public Ventana7() {
        
        contenedor = this.getContentPane();
        contenedor.setLayout(null);
        this.setTitle("Ventana con etiquetas");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        contenedor.add(azul);
        contenedor.add(rojo);
        contenedor.add(amarillo);
        
        azul.setText("Azul");
        azul.setBounds(50, 100, 100, 20);
        
        rojo.setText("Rojo");
        rojo.setBounds(50, 150, 100, 20);
        
        amarillo.setText("Amarillo");
        amarillo.setBounds(50, 200, 100, 20);
    }
    
    
    
    
    
    
}


