package generics;

/**
 * Clase que representa un loro mutante, que es una subclase de la clase Parrot.
 * El loro mutante hereda las características de la clase Parrot, como el número de patas y ojos,
 * y agrega un comportamiento adicional que es el vuelo.
 *
 * @author Pedro García
 */
public class MutantParrot extends Parrot {

    /**
     * Constructor de la clase MutantParrot.
     * Llama al constructor de la clase padre (Parrot) para inicializar las propiedades
     * del loro mutante, como el número de patas y ojos.
     *
     * @param patas Número de patas del loro mutante
     * @param ojos  Número de ojos del loro mutante
     */
    public MutantParrot(int patas, int ojos) {
        super(patas, ojos);  // Llama al constructor de Parrot para inicializar las propiedades
    }

    /**
     * Método adicional de la clase MutantParrot.
     * Este método devuelve un mensaje indicando que el loro mutante puede volar.
     *
     * @return Un mensaje indicando que el loro mutante puede volar
     */
    public String vuela() {
        return "vuelo ...";  // El loro mutante tiene un comportamiento de vuelo
    }
}
