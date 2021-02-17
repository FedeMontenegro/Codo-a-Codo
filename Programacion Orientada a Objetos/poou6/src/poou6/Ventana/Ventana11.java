package poou6.Ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana11 extends JFrame implements ActionListener{
    
    Container contenedor;
    JButton aceptar;
    JButton salir;
    JLabel nombre;
    JLabel apellido;
    JTextField nom = new JTextField();
    JTextField ape = new JTextField();
    

    public Ventana11() {
        
        this.Ventana();
        this.Contenedor(contenedor);
        this.Nombre();
        this.Apellido();
        this.Campo(nom, 100, 100, 100, 25);
        this.Campo(ape, 100, 150, 100, 25);
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
        
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    
    //configura etiqueta "Nombre"
    public void Nombre(){
        
        nombre = new JLabel();
        contenedor.add(nombre);
        nombre.setText("Nombre:");
        nombre.setBounds(25, 100, 100, 25);
    }
    
    //configura la etiqueta "Apellido"
    public void Apellido(){
        
        apellido = new JLabel();
        contenedor.add(apellido);
        apellido.setText("Apellido:");
        apellido.setBounds(25, 150, 100, 25);
    }
    
    //Configura un JTextField
    public void Campo(JTextField t, int x, int y, int a, int b){
        
        contenedor.add(t);
        t.setBounds(x, y, a, b);
        t.addActionListener(this);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.salir) {
            System.exit(0);
        }
        
        if (e.getSource() == this.aceptar) {
            String titulo = this.nom.getText() + " " + this.ape.getText();
            this.setTitle(titulo);
            JOptionPane.showMessageDialog(null, titulo);
        }
    }
    
}
