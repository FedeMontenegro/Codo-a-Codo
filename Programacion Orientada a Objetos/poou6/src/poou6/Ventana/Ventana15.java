package poou6.Ventana;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana15 extends JFrame implements ActionListener{
    
    /**
     * Confeccionar un menú de opciones. Al desplegarlo, deberá contener 3 (tres) opciones de
     * colores (rojo, verde y azul) que permitan cambiar el color de fondo del JFrame.
     */
    
    Container contenedor;
    JButton aceptar = new JButton();
    JButton salir = new JButton();
    JMenuBar menu = new JMenuBar();
    JMenu opciones = new JMenu("Opciones");
    JMenuItem rojo = new JMenuItem("Rojo");
    JMenuItem verde = new JMenuItem("Verde");
    JMenuItem azul = new JMenuItem("Azul");

    public Ventana15() {
        
        this.Contenedor(contenedor);
        this.Ventana();
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
        this.Menu();
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
    
    //configura el menú y sus diferentes ítems
    public void Menu(){
        
        contenedor.add(this.menu);
        menu.setBounds(10, 10, 75, 25);
        menu.add(this.opciones);
        opciones.add(rojo);
        opciones.add(verde);
        opciones.add(azul);
        
        rojo.addActionListener(this);
        verde.addActionListener(this);
        azul.addActionListener(this);
        
        opciones.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.salir) {
            System.exit(0);
        }
        
        if (e.getSource() == this.rojo) {
            
            contenedor.setBackground(Color.red);
        }else if (e.getSource() == this.verde) {
            
            contenedor.setBackground(Color.green);
        }else if (e.getSource() == this.azul) {
            
            contenedor.setBackground(Color.blue);
        }
        
    }
    
}
