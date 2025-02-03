package functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Ejemplo de uso de funciones funcionales en Java.
 * <p>
 * Esta clase demuestra cómo utilizar diferentes interfaces funcionales como:
 * - Consumer: realiza una acción con un solo parámetro.
 * - BiConsumer: realiza una acción con dos parámetros.
 * - Predicate: evalúa una condición con un parámetro.
 * - Function: transforma un valor de tipo T en otro valor de tipo R.
 * </p>
 *
 * @author pedro
 */
public class Functional {
    /**
     * Método principal que demuestra el uso de interfaces funcionales.
     * <p>
     * Se crean instancias de interfaces funcionales como Consumer, BiConsumer, Predicate y Function,
     * y se muestran ejemplos de su uso.
     * </p>
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String args[]) {
        // Consumer: Acepta un solo parámetro y realiza una acción con él.
        // Integer: Es una clase que envuelve un valor primitivo int y lo convierte en un objeto.
        Consumer<Integer> c = (Integer x) -> {
            System.out.println(x);
        };

        // BiConsumer: Acepta dos parámetros y realiza una acción con ambos.
        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);

        // Predicate: Evalúa una condición, devuelve true si la condición es verdadera.
        Predicate<String> p = (String s) -> {
            return (s.equals("TAP"));
        };

        // Function: Aplica una transformación a un valor, en este caso suma 1 al valor.
        // El valor primitivo int = 45 se convierte automáticamente en un objeto Integer
        // (autoboxing), se suma 1 al valor primitivo, y el resultado se convierte de nuevo
        // en un objeto Integer (autoboxing).
        Function<Integer, Integer> f = (Integer elem) -> elem + 1;

        // Imprime el resultado de evaluar el Predicate con diferentes entradas.
        System.out.println(p.test("TAP"));  // Debería devolver true
        System.out.println(p.test("JO"));   // Debería devolver false

        // Utiliza el Consumer para imprimir un valor.
        c.accept(4566);

        // Utiliza el BiConsumer para imprimir dos valores.
        b.accept(666, "pedro");

        // Aplica la función que suma 1 al número 45.
        System.out.println(f.apply(45));  // Debería devolver 46
    }
}
