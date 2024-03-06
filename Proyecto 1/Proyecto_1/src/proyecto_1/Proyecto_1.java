package proyecto_1;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
/**
 *
 * @author Andreé
 */
public class Proyecto_1 {
    
    
    public static ArrayList<Doctores> listaDoctores = new ArrayList<>();
    public static ArrayList<Pacientes> listaPacientes = new ArrayList<>();
    public static ArrayList<Productos> listaProductos = new ArrayList<>();
    public static int  contador=1;
    public static int  contadorProd=1;
    public static int accion=0;
    
        public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        listaDoctores.add(new Doctores(0 , "Andreé", "Paniagua", "F" , "22" , "Odontología", "5459-9711"));
        listaPacientes.add(new Pacientes(0 , "Andreé", "Paniagua", "F" , "22" , "Odontología"));
        listaProductos.add(new Productos(0 , "Vitaflenaco", "Q.5.00", "Tabletas contra el dolor muscular" , 50));
        try {

            UIManager.setLookAndFeel(new MetalLookAndFeel());
        //Login vtn_login= new Login(); 
        Admin vtn_admin=new Admin();
         } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
        public static Object[][] convertirDatosDoctores_tabla(){
        int filas= listaDoctores.size();
        Object[][] arreglo = new Object[filas][7];
        
        for (int i = 0; i < filas; i++) {
                Doctores temp_doctor= listaDoctores.get(i);
                arreglo[i][0]=temp_doctor.getCodigo();
                arreglo[i][1]=temp_doctor.getNombre();
                arreglo[i][2]=temp_doctor.getApellido();
                arreglo[i][3]=temp_doctor.getGenero();
                arreglo[i][4]=temp_doctor.getEdad();
                arreglo[i][5]=temp_doctor.getEspecialidad();
                arreglo[i][6]=temp_doctor.getTelefono();               
        }       
        return arreglo;
    }
        public static Object[][] convertirDatosPacientes_tabla(){
        int filas= listaPacientes.size();
        Object[][] arreglo1 = new Object[filas][5];
        
        for (int i = 0; i < filas; i++) {
                Pacientes temp_paciente= listaPacientes.get(i);
                arreglo1[i][0]=temp_paciente.getCodigo();
                arreglo1[i][1]=temp_paciente.getNombre();
                arreglo1[i][2]=temp_paciente.getApellido();
                arreglo1[i][3]=temp_paciente.getGenero();
                arreglo1[i][4]=temp_paciente.getEdad();
                temp_paciente.getContraseña();
        }       
        return arreglo1;
    }
        public static Object[][] convertirDatosProductos_tabla(){
        int filas= listaProductos.size();
        Object[][] arreglo2 = new Object[filas][5];
        
        for (int i = 0; i < filas; i++) {
                Productos temp_prod= listaProductos.get(i);
                arreglo2[i][0]=temp_prod.getCodigo();
                arreglo2[i][1]=temp_prod.getNombre();
                arreglo2[i][2]=temp_prod.getPrecio();
                arreglo2[i][3]=temp_prod.getDescripción();
                arreglo2[i][4]=temp_prod.getCantidad();
        }       
        return arreglo2;
    }
        
        public static void agregarDoctor(int codigo, String nombre, String apellido, String genero, String edad, String especialidad, String telefono){
        listaDoctores.add(new Doctores(codigo, nombre, apellido, genero, edad, especialidad, telefono));
    }
        public static void agregarPaciente(int codigo, String nombre, String apellido, String genero, String edad, String contraseña){
        listaPacientes.add(new Pacientes(codigo, nombre, apellido, genero, edad, contraseña));
    }
        public static void agregarProducto(int codigo, String nombre, String Precio, String Descripción, int Cantidad){
        listaProductos.add(new Productos(codigo, nombre, Precio, Descripción, Cantidad));
    }
}
