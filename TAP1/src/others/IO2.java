package others;

import java.io.*;

/**
 * La clase IO2 muestra cómo escribir y leer datos de un archivo utilizando FileWriter, PrintWriter,
 * FileReader y BufferedReader.
 */
public class IO2 {
    /**
     * Método principal que demuestra el uso de FileWriter, PrintWriter, FileReader y BufferedReader
     * para escribir y leer datos desde un archivo de texto.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     * @throws IOException Si ocurre un error de entrada/salida al manipular los archivos.
     */
    public static void main(String[] args) throws IOException {
        // Crear un FileWriter para escribir en el archivo "pedro.txt"
        FileWriter fos = new FileWriter("pedro.txt");

        // Crear un PrintWriter que utiliza el FileWriter para imprimir datos
        PrintWriter pos = new PrintWriter(fos);

        // Escribir dos líneas de texto en el archivo
        pos.println("Hello");
        pos.println("Bye");

        // Cerrar el PrintWriter y el FileWriter para liberar los recursos
        pos.close();

        // Crear un FileReader para leer desde el archivo "pedro.txt"
        FileReader fis = new FileReader("pedro.txt");

        // Crear un BufferedReader para leer el archivo de manera más eficiente
        BufferedReader dis = new BufferedReader(fis);

        // Leer y mostrar el contenido del archivo
        System.out.println(dis.readLine());  // Lee y muestra la primera línea del archivo
        System.out.println(dis.readLine());  // Lee y muestra la segunda línea del archivo

        // Cerrar el BufferedReader y el FileReader después de leer los datos
        dis.close();
    }
}
