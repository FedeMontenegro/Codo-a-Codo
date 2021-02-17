package poou6.Ventana;

import java.awt.Container;
import javax.swing.*;
import javax.swing.JFrame;

public class Ventana9 extends JFrame{
    
    /** 
     *Título= “Ventana con casillas de selección múltiple”
     *Ubicación= centrada - Tamaño= “650 píxeles * 550 píxeles”
     *Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
     *Dentro de la ventana se debe colocar un conjunto casillas de selección múltiple con 5
     *lenguajes de programación (ejemplo: Java, PHP, Python, C, C++).
     */
    
    private Container cont;
    private JCheckBox Java = new JCheckBox();
    private JCheckBox php = new JCheckBox();
    private JCheckBox Python = new JCheckBox();
    private JCheckBox c = new JCheckBox();
    private JCheckBox html  = new JCheckBox();


    public Ventana9() {
        
        cont = this.getContentPane();
        cont.setLayout(null);
        this.setSize(650, 550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        cont.add(Java);
        Java.setBounds(150, 25, 100, 25);
        Java.setText("Java");
        
        cont.add(php);
        php.setBounds(150, 50, 100, 25);
        php.setText("PHP");
        
        cont.add(Python);
        Python.setBounds(150, 75, 100, 25);
        Python.setText("Python");
        
        cont.add(c);
        c.setBounds(150, 100, 100, 25);
        c.setText("C");
        
        cont.add(html);
        html.setBounds(150, 125, 100, 25);
        html.setText("html");
    }
    
    
}
