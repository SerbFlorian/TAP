package others;

import java.io.*;

/**
 * La clase IO1 muestra cómo escribir y leer datos en un archivo de texto.
 * Utiliza FileOutputStream para escribir datos y FileInputStream junto con
 * DataInputStream para leerlos.
 */
public class IO1 {
    /**
     * Método principal que demuestra el uso de FileOutputStream, PrintStream,
     * FileInputStream y DataInputStream para escribir y leer datos de un archivo.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     * @throws IOException Si ocurre un error de entrada/salida al manipular los archivos.
     */
    public static void main(String[] args) throws IOException {
        // Crear un FileOutputStream para escribir en el archivo "pedro.txt"
        FileOutputStream fos = new FileOutputStream("pedro.txt");

        // Crear un PrintStream que utiliza el FileOutputStream para imprimir datos
        PrintStream pos = new PrintStream(fos);

        // Escribir dos líneas de texto en el archivo
        pos.println("Hello");
        pos.println("Bye");

        // Cerrar el PrintStream y el FileOutputStream para liberar los recursos
        pos.close();

        // Crear un FileInputStream para leer desde el archivo "pedro.txt"
        FileInputStream fis = new FileInputStream("pedro.txt");

        // Crear un DataInputStream para leer los datos del archivo de manera estructurada
        DataInputStream dis = new DataInputStream(fis);

        // Leer y mostrar el contenido del archivo
        System.out.println(dis.readLine());  // Lee y muestra la primera línea del archivo
        System.out.println(dis.readLine());  // Lee y muestra la segunda línea del archivo

        // Cerrar el DataInputStream y el FileInputStream después de leer los datos
        dis.close();
    }
}
