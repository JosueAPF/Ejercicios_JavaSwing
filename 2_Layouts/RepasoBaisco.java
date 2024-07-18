/*
   ide: JGrasp :)
   FlowLayout: para los JPanle's
   BorderLayout: para los hijos de JFrame
*/

//lib principal de ventanas y componentes
import javax.swing.*;
//uso de layouts
import java.awt.*;

public class RepasoBaisco{
   public static void main(String[] args){
      //Creacion de la ventana principal
      JFrame frame = new JFrame("Ventana Principal");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      JPanel Contenedor1 = new JPanel(new FlowLayout());
      //borde para el JPanel Contenedor1
      Contenedor1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 6)); // Establecer borde y color
      //Control del Tamaño del JPanel o Contenedor1
      Contenedor1.setPreferredSize(new Dimension(150,100));
      //Colores para los contenedores JPanle
      Contenedor1.setBackground(Color.ORANGE);
      JLabel Label1 = new JLabel("Esta es una Prueba de posicionamiento");
      JButton boton1 = new JButton("Click me :)");
      //Agregamos los componenetes a los contenedores
      Contenedor1.add(Label1);
      Contenedor1.add(boton1);
            
      JPanel Contenedor2 = new JPanel(new FlowLayout());
      Contenedor2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 6));
      Contenedor2.setPreferredSize(new Dimension(150,100));

      
      frame.add(Contenedor1 , BorderLayout.NORTH);
      frame.add(Contenedor2 , BorderLayout.CENTER);

      
      //Visualizacion de la ventana
      frame.setSize(600, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }

}