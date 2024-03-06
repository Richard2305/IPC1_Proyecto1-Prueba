package proyecto_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Andreé
 */
public class RegistroProd extends JFrame implements ActionListener{
    
    private JTextField NombreField;
    private JTextField PrecioField;
    private JTextField DescripciónField;
    private JTextField CantidadField;
    
    JButton registerButton;

    public RegistroProd() throws HeadlessException {
        JLabel titleLabel = new JLabel("Registro");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 25));
        titleLabel.setBounds(200, 20, 500, 30);
        this.add(titleLabel);

        JLabel NameLabel = new JLabel("Nombre:");
        NameLabel.setBounds(70, 70, 80, 25);
        this.add(NameLabel);

        NombreField = new JTextField();
        NombreField.setBounds(130, 70, 260, 25);
        this.add(NombreField);

        JLabel precioLabel = new JLabel("Precio Q.:");
        precioLabel.setBounds(70, 110, 80, 25);
        this.add(precioLabel);

        PrecioField = new JTextField();
        PrecioField.setBounds(130, 110, 260, 25);
        this.add(PrecioField);

        JLabel desLabel = new JLabel("Descripción:");
        desLabel.setBounds(45, 150, 80, 25);
        this.add(desLabel);

        DescripciónField = new JTextField();
        DescripciónField.setBounds(130, 150, 260, 25);
        this.add(DescripciónField);

        JLabel cantLabel = new JLabel("Cantidad:");
        cantLabel.setBounds(60, 190, 80, 25);
        this.add(cantLabel);
        
        CantidadField = new JTextField();
        CantidadField.setBounds(130, 190, 260, 25);
        this.add(CantidadField);
        
        registerButton = new JButton("Registrar");
        registerButton.setBounds(180, 250, 150, 25);
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
            String Nombre = NombreField.getText();
            String Precio = PrecioField.getText();
            String Descripción = DescripciónField.getText();
            String Cantidad = CantidadField.getText();
            int CantidadInt = Integer.parseInt(Cantidad);
            
            Proyecto_1.agregarProducto(Proyecto_1.contadorProd, Nombre, "Q."+Precio, Descripción, CantidadInt);
            Proyecto_1.contadorProd++;
            
            this.dispose();
            Admin vtn_admin=new Admin();
    }
   }
}
