/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Andreé
 */
public class Admin extends JFrame implements ActionListener {

    JButton btn_salir, btnRegistro,btn_salir1, btn_salir2, btnRegistro1, btnRegistro2;
    
    public Admin() {
        //Creando el Panel con pestañas
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        JPanel pest1 = new JPanel(null);
        JPanel pest2 = new JPanel(null);
        JPanel pest3 = new JPanel(null);
        
        // Agregar opciones del panel
        tabbedPane.addTab("Doctores", pest1);
        tabbedPane.addTab("Pacientes", pest2);
        tabbedPane.addTab("Productos", pest3);
        
        getContentPane().add(tabbedPane);
        
         //Tabla Doctores
        // Crear un modelo de tabla y agregar datos de ejemplo
        String[] columnsNames = {"Codigo", "Nombre", "Apellido", "Género", "Edad", "Especialidad" , "Teléfono"};
        // Crear una instancia de JTable con los datos y nombres de columna
        JTable table_doctor = new JTable(Proyecto_1.convertirDatosDoctores_tabla(), columnsNames);
        
        // Crear un JScrollPane para la tabla (permite desplazarse por la tabla si es necesario)
        JScrollPane scrollPane = new JScrollPane(table_doctor);
        scrollPane.setBounds(25, 80, 750, 570);
        JLabel titleLabel = new JLabel("Listado de Doctores");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        titleLabel.setBounds(200, 30, 400, 30);
        pest1.add(titleLabel);
        pest1.add(scrollPane);
        
        //Tabla pacientes
        // Crear un modelo de tabla y agregar datos de ejemplo
        String[] columnsNames1 = {"Codigo", "Nombre", "Apellido", "Género", "Edad"};
        JTable table_pacientes = new JTable(Proyecto_1.convertirDatosPacientes_tabla(), columnsNames1);
        
        JScrollPane scrollPane1 = new JScrollPane(table_pacientes);
        scrollPane1.setBounds(25, 80, 750, 570);
        JLabel titleLabel1 = new JLabel("Listado de Pacientes");
        titleLabel1.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        titleLabel1.setBounds(200, 30, 400, 30);
        pest2.add(titleLabel1);
        pest2.add(scrollPane1);
        
        //Tabla Productos
        // Crear un modelo de tabla y agregar datos de ejemplo
        String[] columnsNames2 = {"Codigo", "Nombre", "Precio", "Descripción", "Cantidad"};
        JTable table_productos = new JTable(Proyecto_1.convertirDatosProductos_tabla(), columnsNames2);
        
        JScrollPane scrollPane2 = new JScrollPane(table_productos);
        scrollPane2.setBounds(25, 80, 750, 570);
        JLabel titleLabel2 = new JLabel("Listado de Productos");
        titleLabel2.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        titleLabel2.setBounds(200, 30, 400, 30);
        pest3.add(titleLabel2);
        pest3.add(scrollPane2);
        
        
        //Boton Salir
        btn_salir = new JButton("Salir");
        btn_salir.setBounds(1000, 25, 180, 50);
        btn_salir.setVisible(true);
        btn_salir.addActionListener(this);
        btn_salir1 = new JButton("Salir");
        btn_salir1.setBounds(1000, 25, 180, 50);
        btn_salir1.setVisible(true);
        btn_salir1.addActionListener(this);
        btn_salir2 = new JButton("Salir");
        btn_salir2.setBounds(1000, 25, 180, 50);
        btn_salir2.setVisible(true);
        btn_salir2.addActionListener(this);
        pest1.add(btn_salir);
        pest2.add(btn_salir1);
        pest3.add(btn_salir2);
        
        //Boton Registro
        btnRegistro = new JButton("Crear");
        btnRegistro.setBounds(800, 25, 180, 50);
        btnRegistro.setVisible(true);
        btnRegistro.setEnabled(true);
        btnRegistro.addActionListener(this);
        btnRegistro1 = new JButton("Crear");
        btnRegistro1.setBounds(800, 25, 180, 50);
        btnRegistro1.setVisible(true);
        btnRegistro1.setEnabled(true);
        btnRegistro1.addActionListener(this);
        btnRegistro2 = new JButton("Crear");
        btnRegistro2.setBounds(800, 25, 180, 50);
        btnRegistro2.setVisible(true);
        btnRegistro2.setEnabled(true);
        btnRegistro2.addActionListener(this);
        pest1.add(btnRegistro);
        pest2.add(btnRegistro1);
        pest3.add(btnRegistro2);

        //Ventana del Admin
        this.setTitle("Administrador");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Salir")) {
            this.dispose();
            Login vtn_login= new Login();
        }else if(e.getSource()==btnRegistro){
            Proyecto_1.accion=0;
            this.dispose();
            Registro vtn_registro= new Registro();
        }else if(e.getSource()==btnRegistro1){
            Proyecto_1.accion=0;
            this.dispose();
            RegistroP vtn_RegistroP= new RegistroP();
        }
        else if(e.getSource()==btnRegistro2){
            Proyecto_1.accion=0;
            this.dispose();
            RegistroProd vtn_RegistroProd= new RegistroProd();
        }
        
    }
    
}
