import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample {

    public static void main(String[] args) {
        // Crear un nuevo marco (ventana)
        JFrame frame = new JFrame("Ejemplo de JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Crear un JComboBox con una lista de opciones
        String[] opciones = { "Opción 1", "Opción 2", "Opción 3", "Opción 4" };
        JComboBox<String> comboBox = new JComboBox<>(opciones);

        // Crear una etiqueta para mostrar la opción seleccionada
        JLabel label = new JLabel("Seleccione una opción");

        // Agregar un ActionListener para detectar la opción seleccionada
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la opción seleccionada
                String seleccion = (String) comboBox.getSelectedItem();
                // Mostrar la opción seleccionada en la etiqueta
                label.setText("Opción seleccionada: " + seleccion);
            }
        });

        // Crear un panel y agregar el JComboBox y la etiqueta al panel
        JPanel panel = new JPanel();
        panel.add(comboBox);
        panel.add(label);

        // Agregar el panel a la ventana
        frame.add(panel);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
