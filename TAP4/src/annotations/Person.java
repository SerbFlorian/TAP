package annotations;

/**
 * Clase que representa a una persona. Esta clase está anotada con @Copyright,
 * que proporciona metadatos sobre la clase, como la prioridad, el creador y las etiquetas asociadas.
 * <p>
 * La anotación @Copyright es procesada mediante reflexión para obtener la información adicional.
 */
@Copyright(
        priority = Copyright.Priority.HIGH,  // Establece la prioridad de la anotación como alta
        createdBy = "pedro",                // Indica que la clase fue creada por "pedro"
        tags = {"tap", "urv", "gei"}        // Etiquetas asociadas a la clase
)
public class Person {
    // Atributos de la clase Person
    private String name;  // Nombre de la persona
    private int age;      // Edad de la persona

    /**
     * Constructor de la clase Person.
     *
     * @param name El nombre de la persona.
     * @param age  La edad de la persona.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos getter y setter pueden ser añadidos si es necesario
}
