package structures;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que demuestra el uso de un mapa (HashMap) para almacenar objetos de tipo `Person`
 * asociados a una clave (DNI en este caso).
 */
public class MapSample {
    /**
     * Punto de entrada principal del programa.
     * <p>
     * Crea objetos `Person`, los almacena en un `HashMap` donde la clave es el DNI de la persona,
     * y luego imprime el valor asociado a la clave "222".
     *
     * @param args Argumentos de la línea de comandos (no se usan en este ejemplo).
     */
    public static void main(String args[]) {
        // Creación de objetos Person con DNI, nombre y edad
        Person p1 = new Person("111", "pedro", 1);
        Person p2 = new Person("222", "pep", 2);
        Person p3 = new Person("333", "pere", 3);

        // Creación de un mapa (HashMap) que mapea el DNI (clave) a un objeto Person (valor)
        Map<String, Person> persons = new HashMap<String, Person>();

        // Insertar elementos en el mapa, utilizando el DNI como clave
        persons.put(p1.getDni(), p1);
        persons.put(p2.getDni(), p2);
        persons.put(p3.getDni(), p3);

        // Obtener e imprimir el objeto Person asociado al DNI "222"
        System.out.println(persons.get("222"));
    }
}
