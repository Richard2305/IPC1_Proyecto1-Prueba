package proyecto_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Andreé
 */
public class RegistroP extends JFrame implements ActionListener {
    
    private JTextField PNombreField;
    private JTextField SNombreField;
    private JTextField EdadField;
    private JTextField ContraseñaField;
    
    JButton registerButton;

    private JComboBox<String> generoComboBox;
    
    public RegistroP() {
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

        JLabel contraLabel = new JLabel("Contraseña:");
        contraLabel.setBounds(50, 170, 80, 25);
        this.add(contraLabel);
        
        ContraseñaField = new JTextField();
        ContraseñaField.setBounds(130, 170, 260, 25);
        this.add(ContraseñaField);
        
        JLabel GeneroLabel = new JLabel("Género:");
        GeneroLabel.setBounds(70, 210, 80, 25);
        this.add(GeneroLabel);

        String[] generos = {"Masculino", "Femenino"};
        generoComboBox = new JComboBox<>(generos);
        generoComboBox.setBounds(130, 210, 150, 25);
        this.add(generoComboBox);
        

        registerButton = new JButton("Registrarse");
        registerButton.setBounds(180, 300, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(214, 225, 50));
        registerButton.addActionListener(this);
        this.add(registerButton);
        
        //Ventana del registro
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
            String Contraseña = ContraseñaField.getText();
            String GeneroElejido = (String) generoComboBox.getSelectedItem();
            
            Proyecto_1.agregarPaciente(Proyecto_1.contador, PNombre, SNombre, GeneroElejido, edad, Contraseña);
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