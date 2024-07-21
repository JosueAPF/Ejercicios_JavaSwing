import javax.swing.*;
import java.awt.*;
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
        Btn1 = new JButton("Click aqui");
        Btn2 = new JButton("Click aqui");
        TextoUser = new JTextField();
        textArea = new JTextArea(10,40);
    }
    
   //area de dimenciones y mas para los componenetes
   public void DimencionesComponents(){
       TextoUser.setPreferredSize(new Dimension(200, 30));//dimencion para la caja de texto
       textArea.setLineWrap(true); // Habilitar ajuste automático de líneas
       textArea.setWrapStyleWord(true); // Ajustar palabras completas

   
   }
       
   public void Inicializar(){
      JComponent[] components = {TextoUser,Btn1,textArea,Btn2}; 
      // Crear y agregar componentes centrados al panel principal
      for (JComponent component : components) {
         JPanel SubPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));//centrara a los componentes con espacio entre componentes
         SubPanel.add(component);
         panelPrincipal.add(SubPanel);
      }
      DimencionesComponents();
      frame.add(panelPrincipal);
      
   }
    // Método para configurar y mostrar la ventana
    public void mostrarVentana() {
        frame.setSize(800, 450);
        frame.setLocationRelativeTo(null);//aparece enmedio la ventana
        frame.setVisible(true);
    }
}


public class SalarioInvremento_Swing {
    public static void main(String[] args) {
        // Crear una instancia de la clase VentanaPrincipal
        VentanaPrincipal ventana = new VentanaPrincipal("Nueva Ventana");
        ventana.Inicializar();
        ventana.mostrarVentana();
        
    }
}
