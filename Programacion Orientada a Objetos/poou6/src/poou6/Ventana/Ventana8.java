package poou6.Ventana;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Ventana8 extends JFrame{
   /**
    *Título= “Ventana con lista desplegable”
    *Ubicación= centrada - Tamaño= “500 píxeles * 500 píxeles”
    *Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
    *Dentro de la ventana se debe colocar una lista desplegable, con los 7 colores del arco
    *iris (es decir, desplegando la lista deberá aparecer el texto con los colores: “rojo”,
    *“naranja”, “amarillo”, “verde”, “cian”, “azul” y “violeta”).
    */
    
    private Container contenedor;
    private JComboBox <String>items = new JComboBox<String>();

    public Ventana8() {
        
        contenedor = this.getContentPane();
        contenedor.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Ventana con lista desplegable");
        
        
        
        items.setBounds(25, 150, 100, 25);
        items.addItem("Rojo");
        items.addItem("Naranja");
        items.addItem("Amarillo");
        items.addItem("Verde");
        items.addItem("Cian");
        items.addItem("Azul");
        items.addItem("Violeta");
        contenedor.add(items);
        
    }
}
