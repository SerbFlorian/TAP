package others;

import java.io.Serializable;

/**
 * La clase Person representa a una persona con un nombre y una edad.
 * Implementa la interfaz Serializable para permitir la serialización de sus instancias.
 */
public class Person implements Serializable {
    // Atributos de la clase Person
    String name;  // Nombre de la persona
    int age;      // Edad de la persona

    /**
     * Constructor que inicializa los atributos de la clase Person.
     *
     * @param name El nombre de la persona.
     * @param age  La edad de la persona.
     */
    public Person(String name, int age) {
        this.name = name;  // Asigna el nombre recibido al atributo name
        this.age = age;    // Asigna la edad recibida al atributo age
    }
}
