package farm;

/**
 * Esta clase representa un loro mutante, que es una subclase de `Parrot`.
 * Los loros mutantes heredan los atributos y métodos de la clase `Parrot`
 * y pueden añadir o modificar comportamientos, como el método `fly`,
 * que es específico para los loros mutantes.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class MutantParrot extends Parrot {
    /**
     * Constructor de la clase `MutantParrot`.
     * Llama al constructor de la clase base `Parrot` para inicializar los atributos de patas y ojos.
     *
     * @param legs Número de patas del loro mutante.
     * @param eyes Número de ojos del loro mutante.
     */
    public MutantParrot(int legs, int eyes) {
        super(legs, eyes);
    }

    /**
     * Este método sobrescribe el comportamiento heredado del `Parrot`
     * para proporcionar una implementación específica del loro mutante.
     * El loro mutante puede volar, por lo que el método devuelve un mensaje indicando que está volando.
     *
     * @return Un mensaje indicando que el loro mutante está volando.
     */
    public String fly() {
        return "I'm flying ...";
    }
}
