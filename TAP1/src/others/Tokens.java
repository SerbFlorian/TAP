package others;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Ejemplo de uso de StringTokenizer para leer y separar datos de un archivo.
 * Este programa lee un archivo de texto llamado "accounts.txt", donde cada línea contiene datos separados por comas,
 * y los divide utilizando el delimitador coma (',').
 */
public class Tokens {

    /**
     * Punto de entrada principal de la clase. Lee el archivo "accounts.txt" línea por línea,
     * separa cada línea en tokens utilizando una coma como delimitador y los imprime en consola.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public static void main(String[] args) throws IOException {

        // Abrir el archivo "accounts.txt" para lectura
        FileReader fis = new FileReader("accounts.txt");
        BufferedReader dis = new BufferedReader(fis);
        String line;

        // Leer el archivo línea por línea
        while ((line = dis.readLine()) != null) {
            // Imprimir un mensaje de separación para cada cuenta
            System.out.println("Account: ------------------------------");

            // Crear un StringTokenizer para dividir la línea en tokens usando la coma como delimitador
            StringTokenizer tokens = new StringTokenizer(line, ",");

            // Imprimir cada token encontrado en la línea
            while (tokens.hasMoreTokens()) {
                System.out.println(tokens.nextToken());
            }
        }

        // Cerrar el flujo de entrada una vez que se ha procesado todo el archivo
        dis.close();
    }
}
