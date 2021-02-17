package poou6.Ventana;

import java.awt.*;
import javax.swing.*;

public class Ventana6 extends JFrame {
    
    private Container contenedor;
    private JLabel etiqueta = new JLabel();
    private JTextField texto = new JTextField();

    public Ventana6() {
        
        contenedor = this.getContentPane();
        contenedor.setLayout(null);
        this.setTitle("Ventana con etiquetas");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        contenedor.add(etiqueta);
        etiqueta.setLayout(null);
        etiqueta.setText("Nombre");
        etiqueta.setBounds(50, 100, 60, 100);
        
        contenedor.add(texto);
        texto.setLayout(null);
        texto.setBounds(120, 135, 100, 30);
    }
    
    
}
