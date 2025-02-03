package farm;

/**
 * Esta clase representa un animal en una granja. Tiene atributos como las patas y los ojos,
 * y métodos para acceder y modificar estos atributos. También proporciona un método `talk`
 * que devuelve un mensaje general indicando que es un animal.
 * <p>
 * La clase es base para que otras clases de animales puedan heredar y extender su funcionalidad.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Animal {
    // El atributo 'legs' es protegido para que las clases hijas puedan acceder y modificarlo directamente.
    protected int legs;

    // El atributo 'eyes' es privado, sólo accesible a través de los métodos getter y setter.
    private int eyes;

    /**
     * Constructor de la clase `Animal` que inicializa los atributos de patas (legs) y ojos (eyes).
     *
     * @param legs Número de patas del animal.
     * @param eyes Número de ojos del animal.
     */
    public Animal(int legs, int eyes) {
        this.legs = legs;
        this.eyes = eyes;
    }

    /**
     * Establece el número de patas del animal.
     *
     * @param legs El número de patas que tendrá el animal.
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * Obtiene el número de patas del animal.
     *
     * @return El número de patas del animal.
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Establece el número de ojos del animal.
     *
     * @param ojos El número de ojos que tendrá el animal.
     */
    public void setEyes(int ojos) {
        this.eyes = ojos;
    }

    /**
     * Obtiene el número de ojos del animal.
     *
     * @return El número de ojos del animal.
     */
    public int getEyes() {
        return eyes;
    }

    /**
     * Método general para que los animales puedan "hablar".
     *
     * @return Un mensaje que indica que el objeto es un animal.
     */
    public String talk() {
        return "I am an animal";
    }
}
