/*
   ide: JGrasp :)
   FlowLayout: para los JPanle's
   BorderLayout: para los hijos de JFrame
   JTextArea: tamaño,orden de palabras
   JButton: Cambio de Texto y Limpieza de JTextArea

*/

//lib principal de ventanas y componentes
import javax.swing.*;
//uso de layouts
import java.awt.*;

//Eventos en los Botones
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RepasoBaisco{
   public static void main(String[] args){
      //Creacion de la ventana principal
      JFrame frame = new JFrame("Ventana Principal");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
//------------------------------------------------------INICIO CONTNENDOR 1     
      JPanel Contenedor1 = new JPanel(new FlowLayout());
      //borde para el JPanel Contenedor1
      Contenedor1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 6)); // Establecer borde y color
      //Control del Tamaño del JPanel o Contenedor1
      Contenedor1.setPreferredSize(new Dimension(150,100));
      //Colores para los contenedores JPanle
      Contenedor1.setBackground(Color.ORANGE);
      final JLabel Label1 = new JLabel("Esta es una Prueba de posicionamiento");
      JButton boton1 = new JButton("Click me :)");
      //Agregamos los componenetes a los contenedores
      Contenedor1.add(Label1);
      Contenedor1.add(boton1);
      
      boton1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
                Label1.setText("HOla MunDo");
            }
      });
//------------------------------------------------------INICIO CONTNENDOR 2           
      JPanel Contenedor2 = new JPanel(new FlowLayout());
      Contenedor2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 6));
      Contenedor2.setPreferredSize(new Dimension(150,100));
      // Crear un JTextArea
      JTextArea textArea = new JTextArea(10,40);//ajustado a numero de filas y columnas
      textArea.setLineWrap(true); // Habilitar ajuste automático de líneas
      textArea.setWrapStyleWord(true); // Ajustar palabras completas
      //----Boton limpiador del textarea
      JButton BotonClear = new JButton("Limpiar");
      //caso especial para El TextArea agregarle un JScrollPane
      Contenedor2.add(new JScrollPane(textArea));
      Contenedor2.add(BotonClear);
      
      //Evento LImpiar el TextArea
      BotonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(""); // Limpiar el contenido del JTextArea
            }
        });
      
      //agregado a la ventana Principal
      frame.add(Contenedor1 , BorderLayout.NORTH);
      frame.add(Contenedor2 , BorderLayout.CENTER);

      
      //Visualizacion de la ventana
      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }

}