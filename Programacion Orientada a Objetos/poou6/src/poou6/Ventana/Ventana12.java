package poou6.Ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana12 extends JFrame implements ActionListener{
    
    Container contenedor;
    JComboBox <String> combo = new JComboBox <String>();
    JButton aceptar;
    JButton salir;

    public Ventana12() {
        
        this.Contenedor(contenedor);
        this.Ventana();
        this.Combo(combo);
        this.Aceptar(aceptar);
        this.Salir(salir);
        
     }
    
    //Configura el contenedor
    public void Contenedor(Container c){
        this.contenedor = c;
        contenedor = this.getContentPane();
        contenedor.setLayout(null);
    }
    
    //Configuracion de la ventana.
    public void Ventana(){
        
        this.setSize(550, 450);
        this.setLocationRelativeTo(null);
        this.setTitle("Nombre de flor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //configura el objeto JComboBox
    public void Combo(JComboBox combo){
        
        contenedor.add(combo);
        combo.setBounds(25, 25, 100, 25);
        combo.addItem("Ceibo");
        combo.addItem("Rosa");
        combo.addItem("Margarita");
        combo.addItem("Diente de león");
    }
    
    //configura los aspectos del botón aceptar
    public void Aceptar(JButton a){
        this.aceptar = a;
        
        aceptar = new JButton();
        contenedor.add(aceptar);
        aceptar.setBounds(150, 300, 100, 25);
        aceptar.setText("Aceptar");
        aceptar.addActionListener(this);
    }
    
    //configura los aspectos del botón salir
    public void Salir(JButton a){
        
        salir = new JButton();
        contenedor.add(salir);
        salir.setBounds(300, 300, 100, 25);
        salir.setText("Salir");
        salir.addActionListener(this);
        
    }
    
    //Acciones que se desencadenen ante los eventos correspondientes.
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.salir) {
            System.exit(0);
        }
        
        if (e.getSource() == this.aceptar) {
            this.setTitle((String)combo.getSelectedItem());
        }
    }
}
