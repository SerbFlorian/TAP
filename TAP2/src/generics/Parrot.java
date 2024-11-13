package generics;

/**
 * Clase que representa un loro, que es una subclase de la clase Animal.
 * El loro hereda las características de la clase Animal, como el número de patas y ojos,
 * y además refina el comportamiento del método `talk` para agregar su propia funcionalidad.
 *
 * @author Pedro Garcia
 */
public class Parrot extends Animal {
    /**
     * Constructor de la clase Parrot.
     * Llama al constructor de la clase padre (Animal) para inicializar las propiedades
     * del loro, como el número de patas y ojos.
     *
     * @param patas Número de patas del loro
     * @param ojos  Número de ojos del loro
     */
    public Parrot(int patas, int ojos) {
        super(patas, ojos);  // Llama al constructor de Animal para inicializar las propiedades
    }

    /**
     * Método refinado de la clase Parrot.
     * Este método sobrescribe (refina) el método `talk` de la clase Animal para añadir
     * un comportamiento específico para el loro, devolviendo un mensaje indicando que
     * el loro es un loro y también llamando al método `talk` de la clase padre.
     *
     * @return Un mensaje indicando que el objeto es un loro y también la información del animal
     */
    @Override
    public String talk() {
        return "Soy un Loro y " + super.talk();  // Llama al método talk de la clase Animal y lo extiende
    }
}
