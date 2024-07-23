import javax.swing.*;
import java.awt.*;
//borde para los componenetes
import javax.swing.border.Border;
//eventos para los botones
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Clase para la ventana principal
class VentanaPrincipal {
    private JFrame frame;
    private JPanel panelPrincipal;
    private JPanel SubPanel;
    private JButton Btn1;
    private JButton Btn2;
    private JTextField TextoUser;
    private JTextArea textArea;
    
    
    // Constructor: recibe el título de la ventana
    public VentanaPrincipal(String titulo) {
        frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPrincipal = new JPanel(new GridLayout(2, 2, 10, 10));
        //panelPrincipal.setBorder(BorderFactory.createLineBorder(Color.BLUE, 6)); // Establecer borde y color
        Btn1 = new JButton("Calcular");
        Btn2 = new JButton("Borrar");
        TextoUser = new JTextField();
        textArea = new JTextArea(10,40);
        
        // Establecer un borde para el JTextArea y es reutilizable para otros componentes
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        textArea.setBorder(border);
        panelPrincipal.setBorder(border);
        TextoUser.setBorder(border);//reutilizable para otros componentes
        
    }
    
   //area de dimenciones y mas para los componenetes
   public void DimencionesComponents(){
       TextoUser.setPreferredSize(new Dimension(200, 30));//dimencion para la caja de texto
       textArea.setLineWrap(true); // Habilitar ajuste automático de líneas
       textArea.setWrapStyleWord(true); // Ajustar palabras completas

   
   }
   
   //añade los componenetes a un JPanel para luego ser añadido al frame Principal
   public void Inicializar(){
      JComponent[] components = {TextoUser,Btn1,textArea,Btn2};//componenetes en el array
      // Crear y agregar componentes centrados al panel principal
      for (JComponent component : components) {
         JPanel SubPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));//centrara a los componentes con espacio entre componentes
         SubPanel.add(component);
         panelPrincipal.add(SubPanel);
      }
      
      frame.add(panelPrincipal);
      DimencionesComponents();
      
   }
    // Método para configurar y mostrar la ventana
    public void mostrarVentana() {
        frame.setSize(800, 450);
        frame.setLocationRelativeTo(null);//aparece enmedio la ventana
        frame.setVisible(true);
    }
}

//main
public class SalarioInvremento_Swing {
    public static void main(String[] args) {
        // Crear una instancia de la clase VentanaPrincipal
        VentanaPrincipal ventana = new VentanaPrincipal("Nueva Ventana");
        ventana.Inicializar();
        ventana.mostrarVentana();
    }
}
