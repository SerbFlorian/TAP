package farm;

/**
 * Esta clase representa un loro, que es una subclase de `Animal`.
 * Los loros heredan los atributos y métodos de la clase base `Animal`
 * y pueden modificar el comportamiento heredado, como el método `talk`,
 * para proporcionar una implementación más específica para los loros.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Parrot extends Animal {
    /**
     * Constructor de la clase `Parrot`.
     * Llama al constructor de la clase base `Animal` para inicializar los atributos de patas y ojos.
     *
     * @param legs Número de patas del loro.
     * @param eyes Número de ojos del loro.
     */
    public Parrot(int legs, int eyes) {
        super(legs, eyes);
    }

    /**
     * Este método sobrescribe el método `talk` de la clase base `Animal`
     * para proporcionar una implementación específica para los loros.
     * En lugar de simplemente decir "I am an animal", el loro agrega información adicional
     * diciendo que es un loro.
     *
     * @return Un mensaje indicando que el animal es un loro.
     */
    public String talk() {
        return "I am a parrot and " + super.talk();
    }
}
