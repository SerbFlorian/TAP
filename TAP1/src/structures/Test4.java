package structures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Clase de prueba que demuestra el uso de un `Map` (diccionario) para almacenar objetos `Client`.
 * Se accede a los elementos del mapa mediante claves, y se muestra cómo recorrer el mapa y sus valores.
 */
public class Test4 {
    /**
     * Método principal de la clase.
     * Crea un `Map` con claves tipo `String` y valores tipo `Client`.
     * Luego, muestra cómo acceder a los elementos del mapa y recorrer sus claves y valores.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Crear un mapa (diccionario) que asocia un String con un objeto Client
        Map<String, Client> dict = new HashMap<String, Client>();

        // Crear objetos Client
        Client p1 = new Client("homer", 40);
        Client p2 = new Client("marge", 40);
        Client p3 = new Client("bart", 12);
        Client p4 = new Client("lisa", 10);

        // Insertar los clientes en el mapa con claves "dni1", "dni2", etc.
        dict.put("dni1", p1);
        dict.put("dni2", p2);
        dict.put("dni3", p3);
        dict.put("dni4", p4);

        // Obtener un cliente por su clave ("dni2") y mostrar su nombre
        Client p = dict.get("dni2");
        System.out.println(p.getName());
        System.out.println("-------------------------");

        // Recorrer el conjunto de claves del mapa y obtener los valores (clientes)
        Set<String> keys = dict.keySet();
        Client x;
        for (String key : keys) {
            x = dict.get(key);
            System.out.println(x.getName());
        }

        // Imprimir una línea separadora
        System.out.println("-------------------------");

        // Recorrer los valores del mapa directamente (sin necesidad de las claves)
        Collection<Client> clients = dict.values();
        for (Client per : clients) {
            System.out.println(per.getName());
        }
    }
}
