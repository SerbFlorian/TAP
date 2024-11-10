package generics;

/**
 * Clase que representa un animal con características básicas como patas y ojos.
 * La clase también incluye un método genérico para devolver cualquier tipo de objeto.
 *
 * @author Pedro García
 */

public class Animal {
    // Número de patas del animal
    // es accesible desde el mismo paquete generics y desde subclases de Animal(incluso si estas estan en diferentes paquetes)
    protected int legs;
    // Número de ojos del animal
    private int eyes;

    /**
     * Constructor de la clase Animal.
     *
     * @param legs Número de patas del animal
     * @param ojos Número de ojos del animal
     */
    public Animal(int legs, int ojos) {
        this.legs = legs;
        this.eyes = ojos;
    }

    /**
     * Método genérico que devuelve el objeto que se le pase como parámetro.
     *
     * @param bicho El objeto de tipo T que se quiere devolver
     * @param <T>   Tipo genérico del objeto
     * @return El objeto de tipo T que se pasa como argumento
     */
    public <T> T getThing(T bicho) {
        return bicho;
    }

    /**
     * Obtiene el número de patas del animal.
     *
     * @return El número de patas del animal
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Establece el número de patas del animal.
     *
     * @param legs El nuevo número de patas para el animal
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * Obtiene el número de ojos del animal.
     *
     * @return El número de ojos del animal
     */
    public int getEyes() {
        return eyes;
    }

    /**
     * Establece el número de ojos del animal.
     *
     * @param eyes El nuevo número de ojos para el animal
     */
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    /**
     * Método que simula una acción de hablar del animal.
     * Este método puede ser sobrescrito por clases hijas para dar un comportamiento específico.
     *
     * @return Un mensaje genérico que indica que es un animal
     */
    public String talk() {
        return "Soy un animal";
    }
}
