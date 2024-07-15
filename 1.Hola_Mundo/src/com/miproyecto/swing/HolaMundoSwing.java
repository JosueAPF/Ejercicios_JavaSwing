package com.miproyecto.swing;

/*import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; //contenedores individuales
*/
import java.awt.BorderLayout;//para el JPanel
//eventos para los botonse
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HolaMundoSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola Mundo Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //label mustra texto
        JPanel  PanelLabel = new JPanel();//creaciond de un contenedor
        final JLabel label = new JLabel("¡Hola Mundo!");//debe ser final 
        label.setHorizontalAlignment(JLabel.CENTER);
        PanelLabel.add(label);
        
        //jbutton boton
        JPanel PanelBoton = new JPanel();
        JButton boton = new JButton("Click aqui!");
        PanelBoton.add(boton);
        // ActionListener para el botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hola A JAva");//accion 
            }
        });

        
        
        //añadido al frame los JPanel's
        frame.add(PanelLabel, BorderLayout.CENTER); // panel del label //CENTER
        frame.add(PanelBoton, BorderLayout.SOUTH);  // panel boton //SUR
        
        frame.setSize(800, 600);  // Ancho: 800 píxeles, Alto: 600 píxeles
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
