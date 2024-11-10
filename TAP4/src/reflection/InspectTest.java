package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Clase de prueba para demostrar cómo utilizar reflexión en Java.
 * Esta clase inspecciona la clase Person mediante reflexión, invoca métodos
 * y muestra cómo crear instancias de clases de manera dinámica.
 *
 * @author pedro
 */
public class InspectTest {
    /**
     * Método principal para demostrar el uso de reflexión.
     *
     * @param args Argumentos de la línea de comandos (no utilizados aquí).
     * @throws ClassNotFoundException Si no se encuentra la clase especificada.
     * @throws NoSuchMethodException Si no se encuentra el método especificado.
     * @throws InstantiationException Si no se puede instanciar la clase.
     * @throws IllegalAccessException Si se intenta acceder ilegalmente a un método.
     * @throws IllegalArgumentException Si se pasan argumentos inválidos a un método.
     * @throws InvocationTargetException Si ocurre un error al invocar el método.
     */
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // Obtener la clase 'Person' mediante reflexión usando su nombre completo.
        Class aClass = Class.forName("reflection.Person");

        // Obtener el método 'getName' de la clase 'Person' mediante reflexión.
        Method nameMethod = aClass.getDeclaredMethod("getName");

        // Crear una nueva instancia de la clase 'Person' dinámicamente.
        Object newObject = aClass.newInstance();

        // Invocar el método 'getName' sobre la nueva instancia y almacenar el resultado.
        String output = (String) nameMethod.invoke(newObject);

        // Imprimir el resultado de invocar 'getName' a través de reflexión.
        System.out.println(output);  // Se espera "empty", ya que es el valor inicial del atributo 'name' en Person.

        // Convertir el objeto 'newObject' a un tipo 'Person' y obtener el nombre utilizando un método tradicional.
        Person p1 = (Person) newObject;
        System.out.println(p1.getName());  // Imprime el nombre de la persona (debería ser "empty").

        // Iterar sobre todos los métodos declarados en la clase 'Person' e imprimir sus nombres.
        for (Method method : aClass.getDeclaredMethods()) {
            System.out.println(method.getName());  // Imprime los nombres de todos los métodos de la clase 'Person'.
        }
    }
}
