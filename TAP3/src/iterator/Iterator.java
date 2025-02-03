package iterator;

/**
 * Interfaz que define un iterador para recorrer elementos en una colección.
 * <p>
 * Este es el componente fundamental del patrón de diseño *Iterator*. La interfaz
 * define los métodos necesarios para recorrer una secuencia de elementos de
 * manera secuencial. El iterador se utiliza para obtener elementos de un
 * contenedor sin exponer su estructura interna.
 * </p>
 *
 * @author [Tu Nombre]
 */
interface Iterator {
    /**
     * Verifica si hay más elementos para recorrer en la colección.
     * <p>
     * Este método debe retornar `true` si hay más elementos por recorrer, o `false`
     * si ya no quedan más elementos en la colección.
     * </p>
     *
     * @return {@code true} si hay más elementos, {@code false} si no los hay.
     */
    boolean hasNext();

    /**
     * Obtiene el siguiente elemento de la colección.
     * <p>
     * Este método devuelve el siguiente elemento en la secuencia de la colección,
     * si existe. Si no hay más elementos, el comportamiento dependerá de la
     * implementación, pero usualmente lanzará una excepción.
     * </p>
     *
     * @return el siguiente elemento en la colección.
     */
    Object next();
}