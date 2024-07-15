package com.miproyecto.swing;
import javax.swing.*;
import java.awt.*;
//posicion de los paneles
import java.awt.BorderLayout;
//acciones para botones
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundoSwing_2 {

	public static void main(String[] args) {
		//creacion de la ventana principal
		final JFrame frame = new JFrame("Hola Swing 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//-----------------paneles
		
		
		//--#Panel(Label)
		JPanel Panel1 = new JPanel();
		JLabel Label = new JLabel("Ingreso de Texto");
		Panel1.add(Label);
		
		//--#panel(Caja de texto y Boton)
		JPanel Panel2 = new JPanel();
		final JTextField CajaTxt = new JTextField(20);//caja de texto
		JButton Boton = new JButton("Click aqui");//boton
		Panel2.add(CajaTxt);
		Panel2.add(Boton);
		
		
		//---AGEREGANDO LOS PANELES AL FRAME
		frame.add(Panel1 , BorderLayout.NORTH);
		frame.add(Panel2 , BorderLayout.CENTER);
		
		//----EVENTO DEL BOTON
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---1) accediendo a ala caja de texto
				String Texto = CajaTxt.getText();
				
				//---2) creacion de un dialog
                JOptionPane.showMessageDialog(frame, Texto);

			}
			
		});		
		
		//-------Cambiar el color de fondo
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		//-------creacion de un borde personalizado
		frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 5));
		//para que la ventana principal exista
		frame.setSize(800, 400);  // Ancho: 800 píxeles, Alto: 600 píxeles
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       
	}

}
