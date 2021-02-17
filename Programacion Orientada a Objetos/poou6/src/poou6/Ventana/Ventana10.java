package poou6.Ventana;

import java.awt.Container;
import java.awt.event.ItemListener;
import java.util.*;
import javax.swing.*;

public class Ventana10 extends JFrame {
    
    Container contenedor;
    JRadioButton b1 = new JRadioButton();
    JRadioButton b2 = new JRadioButton();
    JRadioButton b3 = new JRadioButton();
    JRadioButton b4 = new JRadioButton();
    JRadioButton b5 = new JRadioButton();
    ButtonGroup grupo = new ButtonGroup();
    
    

    public Ventana10() {
        
        contenedor = this.getContentPane();
        contenedor.setLayout(null);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Ventana con botón de selección única");
        
        
        
        contenedor.add(b1);
        b1.setBounds(50, 25, 100, 25);
        b1.setText("Soltero");
        
        contenedor.add(b2);
        b2.setBounds(50, 50, 100, 25);
        b2.setText("Casado");
        
        contenedor.add(b3);
        b3.setBounds(50, 75, 100, 25);
        b3.setText("Divorciado");
        
        contenedor.add(b4);
        b4.setBounds(50, 100, 100, 25);
        b4.setText("Viudo");
        
        contenedor.add(b5);
        b5.setBounds(50, 125, 100, 25);
        b5.setText("Otro");
        
        grupo.add(b1);
        grupo.add(b2);
        grupo.add(b3);
        grupo.add(b4);
        grupo.add(b5);
        
        
    }
    
    
}
