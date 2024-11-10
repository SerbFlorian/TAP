package functional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase demuestra el uso de listeners en un botón utilizando tanto una clase anónima como una expresión lambda.
 * El programa crea una ventana con un botón, y cada vez que se hace clic en el botón, se imprime un mensaje en la consola.
 *
 * @author MikeW
 */
public class ListenerTest {

    /**
     * Método principal que inicializa la interfaz gráfica de usuario (GUI).
     * Crea un botón con dos listeners, uno usando una clase anónima y otro usando una expresión lambda.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {

        // Se crea un botón con el texto "Test Button"
        JButton testButton = new JButton("Test Button");

        // Se añade un listener con una clase anónima que detecta el evento de clic
        testButton.addActionListener(new ActionListener() {
            /**
             * Método que se ejecuta cuando el botón es presionado.
             * Imprime un mensaje en la consola indicando que se ha detectado el clic.
             *
             * @param ae El evento de acción (clic) generado por el botón.
             */
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Click Detected by Anon Class");
            }
        });

        // Se añade un segundo listener utilizando una expresión lambda para detectar el clic
        testButton.addActionListener(e ->
                System.out.println("Click Detected by Lambda Listener")
        );

        // Creación de la ventana (JFrame) para mostrar el botón
        JFrame frame = new JFrame("Listener Test");

        // Define el comportamiento de la ventana cuando se cierra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Se añade el botón al centro de la ventana
        frame.add(testButton, BorderLayout.CENTER);

        // Se ajusta el tamaño de la ventana según el contenido
        frame.pack();

        // Hace visible la ventana
        frame.setVisible(true);
    }
}
