/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Andreé
 */
public class Registro extends JFrame implements ActionListener {
    
    private JTextField PNombreField;
    private JTextField SNombreField;
    private JTextField EdadField;
    private JTextField TelefonoField;
    
    JButton registerButton;

    private JComboBox<String> generoComboBox;
    private JComboBox<String> especialidadComboBox;
    
    public Registro() {
        JLabel titleLabel = new JLabel("Registro");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(200, 10, 100, 30);
        this.add(titleLabel);

        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        PNombreField = new JTextField();
        PNombreField.setBounds(130, 50, 260, 25);
        this.add(PNombreField);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(70, 90, 80, 25);
        this.add(lastNameLabel);

        SNombreField = new JTextField();
        SNombreField.setBounds(130, 90, 260, 25);
        this.add(SNombreField);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(85, 130, 80, 25);
        this.add(edadLabel);

        EdadField = new JTextField();
        EdadField.setBounds(130, 130, 260, 25);
        this.add(EdadField);

        JLabel TelefonoLabel = new JLabel("Teléfono:");
        TelefonoLabel.setBounds(65, 170, 80, 25);
        this.add(TelefonoLabel);
        
        TelefonoField = new JTextField();
        TelefonoField.setBounds(130, 170, 260, 25);
        this.add(TelefonoField);
        
        JLabel GeneroLabel = new JLabel("Género:");
        GeneroLabel.setBounds(70, 210, 80, 25);
        this.add(GeneroLabel);

        String[] generos = {"Masculino", "Femenino"};
        generoComboBox = new JComboBox<>(generos);
        generoComboBox.setBounds(130, 210, 150, 25);
        this.add(generoComboBox);
        
        JLabel generoLabel = new JLabel("Especialidad:");
        generoLabel.setBounds(50, 250, 80, 25);
        this.add(generoLabel);

        
        String[] especialidad = {"Cardiólogo", "Pediatra", "Urólogo", "Dermatólogo" , "Ginecólogo"};
        especialidadComboBox = new JComboBox<>(especialidad);
        especialidadComboBox.setBounds(130, 250, 150, 25);
        this.add(especialidadComboBox);

        registerButton = new JButton("Registrarse");
        registerButton.setBounds(180, 300, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(214, 225, 50));
        registerButton.addActionListener(this);
        this.add(registerButton);
        
        //Ventana del Login
        this.setTitle("Registrar");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String PNombre = PNombreField.getText();
            String SNombre = SNombreField.getText();
            String edad = EdadField.getText();
            String telefono = TelefonoField.getText();
            String GeneroElejido = (String) generoComboBox.getSelectedItem();
            String EspecialidadElejida = (String) especialidadComboBox.getSelectedItem();
            
            Proyecto_1.agregarDoctor(Proyecto_1.contador, PNombre, SNombre, GeneroElejido, edad, EspecialidadElejida, telefono);
            Proyecto_1.contador++;
            
            this.dispose();
            
            switch (Proyecto_1.accion){
                case 0: 
                    Admin vtn_admin=new Admin();
                     break;
                
                case 1:
                    Login vtn_login = new Login();
                    break;
            }
            
    }
    }
}
