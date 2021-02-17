package poou6.Ventana;

import java.awt.*;
import javax.swing.*;

public class Ventana5 extends JFrame {

    private Container contenedor;
    
    public Ventana5() {
        contenedor = this.getContentPane();
        contenedor.setLayout(null);
        this.setTitle("Nueva ventana");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}
