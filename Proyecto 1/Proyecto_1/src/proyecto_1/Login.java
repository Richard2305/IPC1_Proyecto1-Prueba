package proyecto_1;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static proyecto_1.Proyecto_1.listaPacientes;
/**
 *
 * @author Andreé
 */
public class Login extends JFrame implements ActionListener {
    
    private JTextField usernameField;
    private JPasswordField passwordField; 
    public Login() {
        
        // Etiqueta para bienvenida
        JLabel titleLabel= new JLabel("Bienvenido");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20)); 
        titleLabel.setBounds(200, 10, 100, 30);
        
        //Imagen para el login
        ImageIcon imagenIcono = new ImageIcon(getClass().getResource("../imagenes_proyecto/perfil.png"));
        Image imageDemension = imagenIcono.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        ImageIcon adjustedImageIcon = new ImageIcon(imageDemension);
        JLabel imageLabel = new JLabel(adjustedImageIcon);
        imageLabel.setBounds(190, 20, 120, 100);
        this.add(imageLabel);
        
        //Boton Login
        JButton botonLogin = new JButton ("Iniciar Sesión");
        botonLogin.setBounds(180, 220, 150, 25); 
        botonLogin.setForeground(Color.WHITE); 
        botonLogin.setBackground(Color.GRAY); 
        botonLogin.addActionListener(this); 
        this.add(botonLogin);
        
        //Boton Registro Doctor
        JButton botonRegistroD = new JButton ("Registrarse como Doctor");
        botonRegistroD.setBounds(155, 260, 200, 25); 
        botonRegistroD.setForeground(Color.WHITE); 
        botonRegistroD.setBackground(Color.GRAY); 
        botonRegistroD.addActionListener(this);
        this.add(botonRegistroD);
        
        //Boton Registro Paciente
        JButton botonRegistroP = new JButton ("Registrarse como Paciente");
        botonRegistroP.setBounds(155, 300, 200, 25); 
        botonRegistroP.setForeground(Color.WHITE); 
        botonRegistroP.setBackground(Color.GRAY); 
        botonRegistroP.addActionListener(this);
        this.add(botonRegistroP);
        
        //Etiqueta para el Codigo
        JLabel usernameLabel = new JLabel("Código:");
        usernameLabel.setBounds(75, 140, 80, 25);
        this.add(usernameLabel);
        
        //Caja de Texto
        usernameField = new JTextField();
        usernameField.setBounds(130, 140, 260, 25); //(x, y, width, height)
        this.add(usernameField);
        
        //Campo para la contraseña
        passwordField = new JPasswordField();
        passwordField.setBounds(130, 180, 260, 25);
        this.add(passwordField);
        
        //Etiqueta para la contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 180, 80, 25);
        this.add(passwordLabel);
        
        //Ventana del Login
        this.setTitle("Login");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Iniciar Sesión":
                String username = usernameField.getText();
                String pwd = new String(passwordField.getPassword());
                

                
                if(username.equals("admin") && pwd.equals("proyecto1IPC1")){
                    JOptionPane.showMessageDialog(this, "Bienvenido su código es: 202111219", "Bienvenido", 1);
                    Admin vtn_admin = new Admin();
                    this.dispose();
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Código y/o contraseña incorecta", "Error con el LOGIN", 0);
                }   break;
            case "Registrarse como Doctor":
                Proyecto_1.accion=1;
                Registro vtn_DoctoresR = new Registro();
                this.dispose();
                break;
            case "Registrarse como Paciente":
                Proyecto_1.accion=1;
                RegistroP vtn_PacientesR = new RegistroP();
                this.dispose();
                break;
            default:
                break;
        }
    }
}