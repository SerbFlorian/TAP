package solutions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Clase `Exercises2` que contiene ejemplos prácticos de uso de Streams, Predicados,
 * Funciones, Enums, Polimorfismo, y otros conceptos de programación funcional en Java.
 */
public class Exercises2 {
    /**
     * Método principal que ejecuta todos los ejercicios de la clase.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Llamar a los diferentes métodos que contienen cada ejercicio
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
    }

    /**
     * Ejercicio 1: Usar Stream con Predicate para filtrar elementos de una lista
     * donde los nombres empiezan con "A".
     */
    public static void exercise1() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("Ejercicio 1: Stream + Predicate");
        // Definimos un Predicate que verifica si un nombre comienza con "A"
        Predicate<String> startsWithA = name -> name.startsWith("A");
        // Filtramos los nombres que cumplen con la condición y los mostramos
        names.stream()
                .filter(startsWithA)
                .forEach(System.out::println);
    }

    /**
     * Ejercicio 2: Usar Function con Stream para convertir todos los elementos de
     * la lista a mayúsculas.
     */
    public static void exercise2() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("\nEjercicio 2: Stream + Function");
        // Usamos map para aplicar la conversión a mayúsculas a cada elemento
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    /**
     * Ejercicio 3: Combinar Stream con Closure, utilizando una variable externa
     * que afecta a la transformación de los elementos.
     */
    public static void exercise3() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("\nEjercicio 3: Stream + Closure");
        final String prefix = "Name: "; // Variable externa a la que hace referencia la lambda
        // Usamos map para agregar un prefijo a cada nombre
        names.stream()
                .map(name -> prefix + name)
                .forEach(System.out::println);
    }

    /**
     * Ejercicio 4: Usar Enum con Stream para iterar sobre los valores de un Enum
     * y mostrar información adicional de cada valor.
     */
    public static void exercise4() {
        System.out.println("\nEjercicio 4: Enum + Stream");
        // Iteramos sobre los valores del Enum AccountType y mostramos su tasa de interés
        AccountType[] accountTypes = AccountType.values();
        Arrays.stream(accountTypes)
                .forEach(accountType -> System.out.println(accountType + " - Tasa de interés: " + accountType.getInterestRate()));
    }

    /**
     * Ejercicio 5: Polimorfismo de Herencia con Stream, demostrando cómo el
     * polimorfismo puede ser usado con Streams para invocar métodos en objetos de
     * diferentes clases.
     */
    public static void exercise5() {
        List<Animal> animals = Arrays.asList(new Dog(), new Cat(), new Dog());
        System.out.println("\nEjercicio 5: Polimorfismo de Herencia + Stream");
        // Usamos Stream para invocar el método makeSound() en todos los animales
        animals.stream()
                .forEach(Animal::makeSound);
    }

    /**
     * Ejercicio 6: Polimorfismo Paramétrico con Function, demostrando el uso de
     * funciones genéricas.
     */
    public static void exercise6() {
        System.out.println("\nEjercicio 6: Function + Polimorfismo Paramétrico");
        Function<Integer, Integer> square = num -> num * num;
        // Aplicamos la función para calcular el cuadrado de un número
        System.out.println("Cuadrado de 5: " + square.apply(5));
    }

    /**
     * Ejercicio 7: Usar Predicate con Iterable para filtrar elementos de una lista
     * utilizando un predicado dentro de un bucle for.
     */
    public static void exercise7() {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David");
        System.out.println("\nEjercicio 7: Predicate + Iterable");
        Iterable<String> iterableNames = names;
        Predicate<String> lengthGreaterThan3 = name -> name.length() > 3;
        // Iteramos sobre la lista de nombres y aplicamos el predicado
        for (String name : iterableNames) {
            if (lengthGreaterThan3.test(name)) {
                System.out.println(name);
            }
        }
    }

    /**
     * Ejercicio 8: Combinar Enum con Predicate para verificar si un valor Enum
     * cumple con una condición dada por un predicado.
     */
    public static void exercise8() {
        System.out.println("\nEjercicio 8: Enum + Predicate");
        AccountType accountType = AccountType.CHECKING;
        // Creamos un Predicate que verifica si el tipo de cuenta es SAVINGS
        Predicate<AccountType> isSavings = type -> type == AccountType.SAVINGS;
        // Probamos el predicado con el tipo de cuenta actual
        System.out.println("¿Es SAVINGS? " + isSavings.test(accountType));
    }

    /**
     * Ejercicio 9: Usar Map con Function para transformar los valores de un mapa.
     */
    public static void exercise9() {
        System.out.println("\nEjercicio 9: Map + Function");
        Map<String, Integer> people = new HashMap<>();
        people.put("Alice", 30);
        people.put("Bob", 25);
        people.put("Carol", 28);
        Function<Integer, Integer> incrementAge = age -> age + 1;
        // Incrementamos la edad de cada persona en el mapa
        people.replaceAll((name, age) -> incrementAge.apply(age));
        people.forEach((name, age) -> System.out.println(name + ": " + age));
    }

    /**
     * Ejercicio 10: Polimorfismo de Herencia con Predicate para filtrar objetos en
     * una lista según su tipo.
     */
    public static void exercise10() {
        System.out.println("\nEjercicio 10: Polimorfismo de Herencia + Predicate");
        List<Animal> animalList = Arrays.asList(new Dog(), new Cat(), new Dog());
        Predicate<Animal> isDog = animal -> animal instanceof Dog;
        // Filtramos los animales de tipo Dog y les hacemos emitir un sonido
        animalList.stream()
                .filter(isDog)
                .forEach(animal -> animal.makeSound());
    }

    /**
     * Ejercicio 11: Combinando todo excepto los polimorfismos. Se aplican operaciones
     * como filtro, transformación, iteración y manipulación de mapas en un conjunto
     * de productos y precios.
     */
    public static void exercise11() {
        System.out.println("\nEjercicio 11: Combinando todo excepto polimorfismos");
        List<String> products = Arrays.asList("Apple", "Banana", "Grapes", "Mango", "Orange");

        Predicate<String> startsWithA = product -> product.startsWith("A");
        // Filtramos los productos que comienzan con "A"
        List<String> filteredProducts = products.stream()
                .filter(startsWithA)
                .collect(Collectors.toList());

        Function<String, String> toUpperCase = product -> product.toUpperCase();
        // Convertimos los productos filtrados a mayúsculas
        List<String> upperCaseProducts = filteredProducts.stream()
                .map(toUpperCase)
                .collect(Collectors.toList());

        enum ProductType {
            FRUIT, VEGETABLE, DAIRY
        }
        ProductType productType = ProductType.FRUIT;

        // Iteramos sobre los productos y mostramos su tipo
        Iterable<String> iterableProducts = upperCaseProducts;
        for (String product : iterableProducts) {
            System.out.println(product + " - Type: " + productType);
        }

        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("APPLE", 1.5);
        productPrices.put("BANANA", 1.0);
        productPrices.put("GRAPES", 2.5);

        Function<Double, Double> priceIncrement = price -> price * 1.10;
        // Incrementamos los precios de los productos
        productPrices.replaceAll((product, price) -> priceIncrement.apply(price));
        productPrices.forEach((product, price) -> System.out.println(product + ": $" + price));
    }

    // Clases y enum para los ejercicios

    /**
     * Clase base Animal que representa un animal genérico.
     */
    static class Animal {
        void makeSound() {
            System.out.println("Some sound");
        }
    }

    /**
     * Clase Dog que extiende de Animal y representa un perro.
     */
    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof");
        }
    }

    /**
     * Clase Cat que extiende de Animal y representa un gato.
     */
    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }

    /**
     * Enum que define los tipos de cuenta.
     */
    enum AccountType {
        CHECKING(1.2), SAVINGS(1.5);

        private double interestRate;

        AccountType(double interestRate) {
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }
    }
}
