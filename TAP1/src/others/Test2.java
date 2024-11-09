package others;

import java.io.*;

/**
 * Clase de ejemplo para demostrar la serialización y deserialización de un objeto en Java.
 */
public class Test2 {

    /**
     * <strong>Serializable permite que el objeto pueda ser convertido en una secuencia de bytes, que pueda ser almacenada en un archivo,
     * transmitida a través de la red o almacenada en una base de datos. La serialización es el proceso de convertir un objeto
     * en una secuencia de bytes, y la deserialización es el proceso inverso de convertir una secuencia de bytes en un objeto.
     * </strong>
     * <br><br>
     * <p>
     * Método principal que demuestra cómo serializar y deserializar un objeto.
     * <p>
     * Primero, crea un objeto `Person` y lo serializa en un archivo llamado "pedro.ser".
     * Luego, deserializa ese archivo para leer el objeto y muestra los datos de la persona en consola.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String args[]) {
        try {
            // Crear un objeto de tipo Person
            Person p = new Person("Pedro", 24);

            // Crear un flujo de salida para guardar el objeto en un archivo
            FileOutputStream f = new FileOutputStream("pedro.ser");
            ObjectOutputStream fos = new ObjectOutputStream(f);

            // Serializar el objeto p en el archivo "pedro.ser"
            fos.writeObject(p);
            fos.close(); // Cerrar el flujo de salida

            // Crear un flujo de entrada para leer el archivo serializado
            ObjectInputStream fis = new ObjectInputStream(new FileInputStream("pedro.ser"));

            // Deserializar el objeto desde el archivo
            Person w = (Person) fis.readObject();
            fis.close(); // Cerrar el flujo de entrada

            // Imprimir los datos del objeto deserializado
            System.out.println(w.name + " " + w.age);

        } catch (FileNotFoundException e) {
            // Manejar la excepción si no se encuentra el archivo
            e.printStackTrace();
        } catch (IOException e2) {
            // Manejar la excepción si ocurre un error de entrada/salida
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            // Manejar la excepción si no se encuentra la clase durante la deserialización
            e3.printStackTrace();
        }
    }
}
