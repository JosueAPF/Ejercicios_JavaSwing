//lib principal de ventanas y componentes
import javax.swing.*;
//uso de layouts
import java.awt.*;

public class RepasoBaisco{
   public static void main(String[] args){
      //Creacion de la ventana principal
      JFrame frame = new JFrame("Ventana Principal");


      JPanel Contenedor1 = new JPanel(new FlowLayout());
      JLabel Label1 = new JLabel("Esta es una Prueba de posicionamiento");
      JButton boton1 = new JButton("Click me :)");
      Contenedor1.add(label1);
      Contenedor1.add(boton1);
            
      JPanel Contenedor2 = new JPanel(new FlowLayout());
      
      
      frame.add(Contenedor1 , BorderLayout.NORTH);
      
      //Visualizacion de la ventana
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }

}