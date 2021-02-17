package poou6.Ventana;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Ventana14 extends JFrame implements ActionListener{
    
    /**
     *Crear 3 listas desplegables con valores entre 0 y 255. Cada lista representa la cantidad de rojo,
     *verde y azul que se pueden combinar para formar colores. Al seleccionar una determinada
     *combinación de RGB (Red Green Blue) y hacer clic en el botón, se deberá modificar el fondo
     *del mismo (es decir, del botón).
     */
    
    private Container contenedor;
    private JLabel e1 = new JLabel();
    private JLabel e2 = new JLabel();
    private JLabel e3 = new JLabel();
    private JComboBox c1 = new JComboBox();
    private JComboBox c2 = new JComboBox();
    private JComboBox c3 = new JComboBox();
    private JButton salir = new JButton();
    private JButton aceptar = new JButton();

    public Ventana14() {
        
        this.Contenedor(contenedor);
        this.Ventana();
        this.Etiqueta(e1, 20, 75, 100, 25, "Rojo:");
        this.Etiqueta(e2, 20, 125, 100, 25, "Verde:");
        this.Etiqueta(e3, 20, 175, 100, 25, "Azul:");
        this.Combo(c1, 75, 75, 50, 25);
        this.Combo(c2, 75, 125, 50, 25);
        this.Combo(c3, 75, 175, 50, 25);
        this.Aceptar();
        this.Salir();
    }
    
    //Configura el contenedor
    public void Contenedor(Container c){
        this.contenedor = c;
        contenedor = this.getContentPane();
        contenedor.setLayout(null);
    }
    
    //Configuracion de la ventana.
    public void Ventana(){
        
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pasajero");
    }
    
    public void Etiqueta(JLabel l, int x, int y, int a, int b, String texto){
        
        contenedor.add(l);
        l.setBounds(x, y, a, b);
        l.setText(texto);
    }
    
    //Configura las listas desplegables
    public void Combo(JComboBox c, int x, int y, int a, int b){
        
        contenedor.add(c);
        c.setBounds(x, y, a, b);
        c.addActionListener(this);
        
        for (int i = 0; i <= 255; i++) {
            c.addItem(i);
        }
    }
    
    //configura los aspectos del botón aceptar
    public void Aceptar(){
        
        aceptar = new JButton();
        contenedor.add(aceptar);
        aceptar.setBounds(150, 300, 100, 25);
        aceptar.setText("Aceptar");
        aceptar.addActionListener(this);
    }
    
    //configura los aspectos del botón salir
    public void Salir(){
        
        salir = new JButton();
        contenedor.add(salir);
        salir.setBounds(300, 300, 100, 25);
        salir.setText("Salir");
        salir.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.salir) {
            System.exit(0);
        }
        
        if (e.getSource() == this.aceptar) {
            
            int r, g, b;
            
            r = Integer.parseInt(this.c1.getSelectedItem().toString());
            g = Integer.parseInt(this.c2.getSelectedItem().toString());
            b = Integer.parseInt(this.c3.getSelectedItem().toString());
            
            
            Color color = new Color(r, g, b);
            this.aceptar.setBackground(color);
        }
    
    }
    
    
}
