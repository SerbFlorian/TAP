package functional;

/**
 * Clase que representa un animal con atributos básicos y métodos para interactuar con ellos.
 * <p>La clase {@code Animal} permite almacenar y manipular el nombre y la edad de un animal, así como
 * mostrar información sobre el mismo y realizar una acción básica.</p>
 * <p>
 * Creado por Pedro el 17/07/14.
 */
public class Animal {
    private String name; // Nombre del animal
    private int age; // Edad del animal

    /**
     * Constructor de la clase {@code Animal}.
     *
     * @param name el nombre del animal
     * @param age  la edad del animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Devuelve el nombre del animal.
     *
     * @return el nombre del animal
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del animal.
     *
     * @param name el nuevo nombre del animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la edad del animal.
     *
     * @return la edad del animal
     */
    public int getAge() {
        return age;
    }

    /**
     * Establece la edad del animal.
     *
     * @param age la nueva edad del animal
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Método que permite al animal "hablar".
     * <p>Este método imprime un saludo básico en la consola.</p>
     */
    public void talk() {
        System.out.println("hola"); // Imprime un saludo en la consola
    }

    /**
     * Retorna una representación en cadena de los atributos del animal.
     *
     * @return una cadena de texto que describe el nombre y la edad del animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
