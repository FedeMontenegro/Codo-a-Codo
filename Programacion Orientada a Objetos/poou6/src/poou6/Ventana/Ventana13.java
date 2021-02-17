package poou6.Ventana;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana13 extends JFrame implements ActionListener {
    
    /** Actividad nº13
     * Confeccionar una ventana con:
     * Título: Pasajero
     * Tamaño: 700 px x 500 px
     * Debe contener:
     * 1 etiqueta Nombre y su campo de texto
     * 1 etiqueta Apellido y su campo de texto
     * 1 grupo de botones alternativos con los posibles estados civiles
     * 1 lista desplegable con la lista de países a los que puede viajar
     * 1 cuadros de selección múltiple con los idiomas que habla el pasajero.
     * 1 botón de Aceptar, al hacer clic en el botón en un cuadro desplegable deben
     * aparecer el nombre y el apellido, el país de destino, el estado civil y los idiomas
     * que habla el pasajero
     * 1 botón de Salir, debe cerrar la aplicación
     */
    
    Container contenedor;
    JLabel nombre = new JLabel();
    JLabel apellido = new JLabel();
    JTextField nom = new JTextField();
    JTextField ape = new JTextField();
    JButton aceptar = new JButton();
    JButton salir = new JButton();
    ButtonGroup grupo = new ButtonGroup();
    JRadioButton b1 = new JRadioButton();
    JRadioButton b2 = new JRadioButton();
    JRadioButton b3 = new JRadioButton();
    JRadioButton b4 = new JRadioButton();
    JRadioButton b5 = new JRadioButton();
    JComboBox combo = new JComboBox();
    JCheckBox c1 = new JCheckBox();
    JCheckBox c2 = new JCheckBox();
    JCheckBox c3 = new JCheckBox();
    JCheckBox c4 = new JCheckBox();
    JCheckBox c5 = new JCheckBox();

    public Ventana13() {
        
        this.Ventana();
        this.Contenedor(contenedor);
        this.Nombre();
        this.Apellido();
        this.Campo(nom, 100, 100, 100, 25);
        this.Campo(ape, 100, 150, 100, 25);
        this.Aceptar();
        this.Salir();
        this.SeleccionUnica(b1, 250, 50, 100, 25);
        this.SeleccionUnica(b2, 250, 75, 100, 25);
        this.SeleccionUnica(b3, 250, 100, 100, 25);
        this.SeleccionUnica(b4, 250, 125, 100, 25);
        this.SeleccionUnica(b5, 250, 150, 100, 25);
        this.Grupo();
        this.Combo();
        this.SeleccionMultiple(c1, 350, 50, 100, 25, "Ingles");
        this.SeleccionMultiple(c2, 350, 75, 100, 25, "Español");
        this.SeleccionMultiple(c3, 350, 100, 100, 25, "Aleman");
        this.SeleccionMultiple(c4, 350, 125, 100, 25, "Italiano");
        this.SeleccionMultiple(c5, 350, 150, 100, 25, "Frances");
       
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
    
    public void SeleccionUnica(JRadioButton boton, int x, int y, int a, int b){
        
        contenedor.add(boton);
        boton.setBounds(x, y, a, b);
        boton.addActionListener(this);
        b1.setText("Casado");
        b2.setText("Soltero");
        b3.setText("Divorciado");
        b4.setText("Viudo");
        b5.setText("Otro");
    }
    
    public void Grupo(){
        
        grupo.add(b1);
        grupo.add(b2);
        grupo.add(b3);
        grupo.add(b4);
        grupo.add(b5);
    }
    
    
    public void Combo(){
        
        contenedor.add(combo);
        combo.setBounds(10, 200, 100, 25);
        combo.addItem("Uruguay");
        combo.addItem("Brasil");
        combo.addItem("Italia");
        combo.addItem("Alemania");
        combo.addItem("Japón");
        
    }
    
    public void SeleccionMultiple(JCheckBox c, int x, int y, int a, int b, String t){
        
        contenedor.add(c);
        c.setBounds(x, y, a, b);
        c.addActionListener(this);
        c.setText(t);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.salir) {
            System.exit(0);
        }
        
        if (e.getSource()==this.aceptar) {
            
            JComboBox com = new JComboBox();
            contenedor.add(com);
            com.setBounds(250, 200, 100, 25);
            com.addItem(this.nom.getText());
            com.addItem(this.ape.getText());
            
            if(this.b1.isSelected()){
            com.addItem(this.b1.getText());
            }else if (this.b2.isSelected()) {
                com.addItem(this.b2.getText());
            }else if (this.b3.isSelected()) {
                com.addItem(this.b3.getText());
            }else if (this.b4.isSelected()) {
                com.addItem(this.b4.getText());
            }else if (this.b5.isSelected()) {
                com.addItem(this.b5.getText());
            }
            
            if(this.c1.isSelected()){
            com.addItem(this.c1.getText());
            }
            if (this.c2.isSelected()) {
                com.addItem(this.c2.getText());
            }
            if (this.c3.isSelected()) {
                com.addItem(this.c3.getText());
            }
            if (this.c4.isSelected()) {
                com.addItem(this.c4.getText());
            }
            if (this.c5.isSelected()) {
                com.addItem(this.c5.getText());
            }
            
            com.addItem(this.combo.getSelectedItem());
            com.addActionListener(this);
        }
    }
}
