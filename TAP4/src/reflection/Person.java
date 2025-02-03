package reflection;

/**
 * Clase que representa a una persona con atributos básicos: nombre y edad.
 * Permite obtener y modificar dichos atributos mediante métodos getter y setter.
 *
 * @author pedro
 */
public class Person {
    // Atributo privado que almacena el nombre de la persona.
    private String name = "empty";

    // Atributo privado que almacena la edad de la persona.
    private int age = 0;

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param name El nombre de la persona a establecer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getAge() {
        return age;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param age La edad de la persona a establecer.
     */
    public void setAge(int age) {
        this.age = age;
    }
}
