package iterator;

/**
 * Clase que implementa el contenedor de nombres y utiliza el patrón Iterator
 * para proporcionar una forma de acceder a los elementos (nombres) en la colección.
 * <p>
 * Esta clase implementa la interfaz *Container* y proporciona un iterador
 * interno para acceder a los elementos de la lista de nombres.
 *
 * @author [Tu Nombre]
 */
public class NameRepository implements Container {
    // Lista de nombres que serán accesibles a través del iterador
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    /**
     * Implementa el método de la interfaz Container para obtener un iterador
     * que permite recorrer la colección de nombres.
     *
     * @return un objeto de tipo Iterator que permite recorrer los nombres.
     */
    @Override
    public Iterator getIterator() {
        return new NameIterator(); // Retorna una instancia del iterador
    }

    /**
     * Clase privada que implementa el iterador para recorrer la lista de nombres.
     * Esta clase es interna de *NameRepository* y no puede ser utilizada fuera
     * de esta clase.
     */
    private class NameIterator implements Iterator {

        // Índice para llevar el control de la posición actual en el array de nombres
        int index;

        /**
         * Método para verificar si hay más elementos en la colección.
         *
         * @return true si hay más elementos para recorrer, false en caso contrario.
         */
        @Override
        public boolean hasNext() {
            // Verifica si el índice es menor que el tamaño del array de nombres
            return index < names.length;
        }

        /**
         * Método para obtener el siguiente elemento de la colección.
         *
         * @return el siguiente nombre si hay más elementos, null si no.
         */
        @Override
        public Object next() {
            // Si hay un siguiente elemento, lo devuelve y avanza el índice
            if (this.hasNext()) {
                return names[index++];
            }
            return null; // Si no hay más elementos, devuelve null
        }
    }
}
