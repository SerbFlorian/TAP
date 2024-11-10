package generics;

/**
 * Clase que representa un gato, que es una subclase de la clase Animal.
 * El gato hereda las características de la clase Animal, como el número de patas y ojos,
 * y sobrescribe el método `talk` para ofrecer un comportamiento específico.
 *
 * @author Pedro García
 */
public class Cat extends Animal {

    /**
     * Constructor de la clase Cat.
     * Llama al constructor de la clase padre (Animal) para inicializar las propiedades
     * del gato como el número de patas y ojos.
     *
     * @param patas Número de patas del gato
     * @param ojos  Número de ojos del gato
     */
    public Cat(int patas, int ojos) {
        super(patas, ojos);  // Llama al constructor de Animal para inicializar las propiedades
    }

    /**
     * Método sobrescrito de la clase Animal.
     * Este método devuelve un mensaje específico para el gato.
     *
     * @return Un mensaje indicando que el animal es un gato
     */
    @Override
    public String talk() {
        return "Soy un Gato";  // El gato habla, y su mensaje es específico
    }
}
