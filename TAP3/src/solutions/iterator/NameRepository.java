package solutions.iterator;

import java.util.*;

/**
 * Clase que representa un repositorio de nombres, la cual implementa la interfaz Iterable.
 * Esto permite recorrer los elementos (nombres) usando un iterador.
 */
public class NameRepository implements Iterable<String> {

    // Array de nombres que serán iterados.
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    /**
     * Método que devuelve un iterador para recorrer los nombres.
     *
     * @return Un iterador para los nombres almacenados en el repositorio.
     */
    @Override
    public java.util.Iterator<String> iterator() {
        return new NameIterator();
    }

    /**
     * Clase interna que implementa el iterador para recorrer los nombres.
     * Esta clase se encarga de manejar el índice y las operaciones de iteración.
     */
    private class NameIterator implements Iterator<String> {

        // Índice que lleva el control de la posición actual en el array de nombres.
        int index;

        /**
         * Método que verifica si existen más elementos para iterar.
         *
         * @return true si hay más elementos, false si ya no hay más elementos.
         */
        @Override
        public boolean hasNext() {
            // Retorna true si el índice actual es menor que la longitud del array,
            // indicando que aún hay elementos por recorrer.
            if (index < names.length) {
                return true;
            }
            return false;
        }

        /**
         * Método que devuelve el siguiente nombre en la secuencia de iteración.
         *
         * @return El siguiente nombre del array si existe, o null si no hay más elementos.
         * @throws NoSuchElementException Si no hay más elementos para iterar.
         */
        @Override
        public String next() {
            // Si hay un siguiente elemento, lo retorna y avanza el índice.
            if (this.hasNext()) {
                return names[index++];
            }
            // Si no hay más elementos, lanza una excepción.
            throw new NoSuchElementException("No hay más elementos en el repositorio.");
        }
    }
}
