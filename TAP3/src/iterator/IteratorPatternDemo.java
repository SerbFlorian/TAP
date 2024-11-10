package iterator;

/**
 * Clase demo para demostrar el uso del patrón de diseño *Iterator*.
 * <p>
 * Esta clase utiliza el patrón de diseño *Iterator* para iterar a través de los
 * elementos de un contenedor de nombres. La clase *NameRepository* es el contenedor
 * de los elementos, y un iterador se obtiene a través del método `getIterator()`.
 * </p>
 *
 * <p>
 * Ejemplo de conceptos clave:
 * <ul>
 *   <li>Contrato (Contract): La interfaz *{@link Iterator}, {@link Container}* define el contrato de los
 *   métodos que deben implementarse.</li>
 *   <li>Asignación Polimórfica: iter = namesRepository.getIterator()`.</li>
 *   <li>Dynamic Binding: La llamada al método `.next()` del iterador se resuelve en tiempo de ejecución.</li>
 * </ul>
 * </p>
 *
 * @author [Tu Nombre]
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        // Crear el repositorio de nombres
        NameRepository namesRepository = new NameRepository();

        // Obtener el iterador y recorrer los elementos del repositorio
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            // Obtener el siguiente elemento (nombre)
            String name = (String) iter.next();
            // Imprimir el nombre
            System.out.println("Name : " + name);
        }
    }
}
