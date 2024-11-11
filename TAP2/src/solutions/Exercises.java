package solutions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Clase `Exercises` que contiene los ejemplos solicitados utilizando funcionalidades
 * de Java como Streams, Lambdas, Predicados, Funciones, Enums y Polimorfismo.
 */
public class Exercises {
    public static void main(String[] args) {
        // Ejecución de cada uno de los ejercicios
        ejercicio1Stream();
        ejercicio2Map();
        ejercicio3Filter();
        ejercicio4Closures();
        ejercicio5Predicate();
        ejercicio6Function();
        ejercicio7Iterable();
        ejercicio8Enums();
        ejercicio9PolimorfismoHerencia();
        ejercicio10PolimorfismoParametrico();
    }

    /**
     * Ejercicio 1: Uso de Stream para recorrer una lista e imprimir sus elementos.
     * En este ejercicio, se utiliza un Stream para recorrer los elementos de una lista
     * e imprimirlos en consola.
     */
    public static void ejercicio1Stream() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("Ejercicio 1: Stream");
        // Recorre la lista y la imprime utilizando un stream
        names.stream().forEach(System.out::println);
    }

    /**
     * Ejercicio 2: Uso de map para transformar los nombres en mayúsculas.
     * Aquí se utiliza la operación `map` para transformar todos los nombres de la lista
     * a mayúsculas y luego se imprime el resultado.
     */
    public static void ejercicio2Map() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("\nEjercicio 2: Map");
        // Transforma los nombres a mayúsculas utilizando map y luego los imprime
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        upperCaseNames.forEach(System.out::println);
    }

    /**
     * Ejercicio 3: Uso de filter para obtener nombres que empiecen con 'A'.
     * En este ejercicio, se utiliza el filtro (`filter`) para seleccionar solo los nombres
     * que comienzan con la letra 'A'.
     */
    public static void ejercicio3Filter() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("\nEjercicio 3: Filter");
        // Filtra los nombres que empiezan con la letra 'A'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        filteredNames.forEach(System.out::println);
    }

    /**
     * Ejercicio 4: Uso de una closure para modificar el estado de una variable externa en un lambda.
     * En este ejemplo, se usa una closure para capturar y utilizar una variable externa (`increment`)
     * dentro de una operación lambda.
     */
    public static void ejercicio4Closures() {
        System.out.println("\nEjercicio 4: Closures");
        final int increment = 10;  // Esta variable externa se captura dentro de la lambda
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        // Se aplica un incremento a cada número utilizando la variable externa 'increment'
        List<Integer> incrementedNumbers = numbers.stream()
                .map(num -> num + increment) // Captura el valor de increment
                .collect(Collectors.toList());
        incrementedNumbers.forEach(System.out::println);
    }

    /**
     * Ejercicio 5: Uso de Predicate para comprobar si un número es par.
     * En este ejercicio se utiliza un `Predicate` para verificar si un número dado es par o no.
     */
    public static void ejercicio5Predicate() {
        System.out.println("\nEjercicio 5: Predicate");
        Predicate<Integer> isEven = num -> num % 2 == 0;
        // Se verifica si los números son pares
        System.out.println(isEven.test(4));  // true
        System.out.println(isEven.test(7));  // false
    }

    /**
     * Ejercicio 6: Uso de Function para aplicar una operación a una cadena de texto.
     * En este ejemplo, se usa una `Function` para concatenar un prefijo a una cadena.
     */
    public static void ejercicio6Function() {
        System.out.println("\nEjercicio 6: Function");
        Function<String, String> addPrefix = str -> "Hello, " + str;
        // Se aplica la función para añadir el prefijo "Hello, " a la cadena "World"
        System.out.println(addPrefix.apply("World"));
    }

    /**
     * Ejercicio 7: Uso de Iterable para recorrer un conjunto de objetos sin usar streams.
     * Este ejercicio demuestra cómo utilizar un objeto `Iterable` para recorrer y imprimir
     * los elementos de una lista sin usar Streams.
     */
    public static void ejercicio7Iterable() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("\nEjercicio 7: Iterable");
        Iterable<String> iterableNames = names;
        // Se recorre la lista utilizando un Iterable (sin Stream)
        for (String name : iterableNames) {
            System.out.println(name);
        }
    }

    /**
     * Ejercicio 8: Uso de un Enum para representar los tipos de cuentas.
     * En este ejercicio, se utiliza un `Enum` para representar diferentes tipos de cuentas bancarias.
     */
    public static void ejercicio8Enums() {
        System.out.println("\nEjercicio 8: Enums");
        AccountType accountType = AccountType.SAVINGS;
        // Se muestra el tipo de cuenta utilizando un Enum
        System.out.println("Tipo de cuenta: " + accountType);
    }

    /**
     * Ejercicio 9: Creación de clases con herencia y polimorfismo.
     * Se muestra un ejemplo básico de herencia y polimorfismo donde la clase `Dog`
     * sobrescribe el método `makeSound` de la clase `Animal`.
     */
    public static void ejercicio9PolimorfismoHerencia() {
        System.out.println("\nEjercicio 9: Polimorfismo de Herencia");
        Animal dog = new Dog();
        // Llamada al método sobrescrito en la clase Dog
        dog.makeSound();  // Salida: Woof!
    }

    /**
     * Ejercicio 10: Uso de generics (polimorfismo paramétrico) en una función.
     * En este ejercicio se usa polimorfismo paramétrico (generics) para crear una función
     * que recibe una lista de elementos de tipo genérico y calcula su suma si los elementos son enteros.
     */
    public static void ejercicio10PolimorfismoParametrico() {
        System.out.println("\nEjercicio 10: Polimorfismo Paramétrico");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        // Se calcula la suma de los elementos de la lista
        System.out.println("Suma de enteros: " + sum(intList));  // Salida: 15
    }

    // Ejemplo de polimorfismo de herencia
    static class Animal {
        void makeSound() {
            System.out.println("Some sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
    }

    // Ejemplo de enum
    enum AccountType {
        CHECKING, SAVINGS, CREDIT
    }

    // Ejemplo de polimorfismo paramétrico (Generics)
    public static <T> int sum(List<T> list) {
        int sum = 0;
        for (T item : list) {
            if (item instanceof Integer) {
                sum += (Integer) item;
            }
        }
        return sum;
    }
}
