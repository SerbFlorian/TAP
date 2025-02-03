package structures;

/**
 * Clase que representa a una persona con atributos básicos como DNI, nombre y edad.
 */
public class Person {
    private String dni;
    private String name;
    private int age;

    /**
     * Constructor para inicializar los atributos de la persona.
     *
     * @param dni El DNI de la persona.
     * @param name El nombre de la persona.
     * @param age La edad de la persona.
     */
    public Person(String dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    /**
     * Devuelve el DNI de la persona.
     *
     * @return El DNI de la persona.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI de la persona.
     *
     * @param dni El DNI a asignar a la persona.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param name El nombre a asignar a la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getAge() {
        return age;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param age La edad a asignar a la persona.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sobrescribe el método `toString` para proporcionar una representación
     * en formato de cadena de la persona.
     *
     * @return Una cadena que representa al objeto `Person`.
     */
    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
