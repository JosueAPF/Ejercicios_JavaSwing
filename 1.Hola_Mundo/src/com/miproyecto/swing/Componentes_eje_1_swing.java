package com.miproyecto.swing;


//lib para los componentes
import javax.swing.*;
//realacionado a tamaños y posiciones de los componenetes
import java.awt.BorderLayout;

//Eventos de Botones
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//SE USO PARA EL FILEcHOOSER
import java.io.File;


public class Componentes_eje_1_swing {

	public static void main(String[] args) {
		//----creacion del frame o ventana principal
		final JFrame frame = new JFrame("Ventana 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//-----------------------------------------Barra de Carga y Boton---------------------------------------		
		//----Barra de progreso
		JPanel Panel_1 = new JPanel();
		JProgressBar BarraProgreso = new JProgressBar(0,100);
		BarraProgreso.setValue(75); // Valor inicial
		BarraProgreso.setStringPainted(true);
		Panel_1.add(BarraProgreso);
		
		//----Area boton para el FILECHOSER
		JPanel Panel_2 = new JPanel();
		JButton Boton_1 = new JButton("Click aqui!");
		Panel_2.add(Boton_1);
		
		
		
//-----------------------------------------File Chooser---------------------------------------		
		//---Evento Boton_1
		Boton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser FilesCh = new JFileChooser();
				//-------------------------------------------
				int result = FilesCh.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = FilesCh.getSelectedFile();
                    JOptionPane.showMessageDialog(frame, "Archivo seleccionado: " + selectedFile.getAbsolutePath());
                }
			}
			
		});		
		
//-----------------------------------------Radio Button---------------------------------------	
		
		JPanel Panel_3 = new JPanel();
		JRadioButton RBtn_opcion1= new JRadioButton();
		JRadioButton RBtn_opcion2= new JRadioButton();
		ButtonGroup Grupo = new ButtonGroup();
		Grupo.add(RBtn_opcion1);
		Grupo.add(RBtn_opcion2);
		
		Panel_3.add(RBtn_opcion1);
		Panel_3.add(RBtn_opcion2);
		
		
		//----añadiendo los componentes al frame (ventana principal)
		frame.add(Panel_1, BorderLayout.NORTH);
		frame.add(Panel_2, BorderLayout.CENTER);
		frame.add(Panel_3, BorderLayout.WEST);
		
		//----apartado : para que la ventana se vizualice o exista
		frame.setSize(800,300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
