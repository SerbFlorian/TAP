package farm;

/**
 * Esta clase representa un gato, que es una subclase de `Animal`.
 * Los gatos heredan los atributos y métodos de la clase `Animal`
 * y pueden sobrescribir (reemplazar) ciertos comportamientos, como el método `talk`,
 * para proporcionar una implementación específica para los gatos.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Cat extends Animal {
    /**
     * Constructor de la clase `Cat`.
     * Llama al constructor de la clase base (`Animal`) para inicializar los atributos de patas y ojos.
     *
     * @param legs Número de patas del gato.
     * @param eyes Número de ojos del gato.
     */
    public Cat(int legs, int eyes) {
        // Llama al constructor de la clase base `Animal` para inicializar los atributos.
        super(legs, eyes);
    }

    /**
     * Sobrescribe el método `talk` de la clase `Animal` para proporcionar una implementación específica
     * para el gato. En lugar de devolver el mensaje genérico de "I am an animal", el gato devuelve
     * un mensaje indicando que es un gato.
     *
     * @return Un mensaje indicando que el objeto es un gato.
     */
    @Override
    public String talk() {
        return "I'm a cat";
    }
}
