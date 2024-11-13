package farm;

import java.util.LinkedList;

/**
 * La clase `UseAnimal2` muestra cómo utilizar listas estáticas y dinámicas en Java
 * para almacenar objetos de clases derivadas de `Animal`.
 * Esta clase también demuestra el uso del polimorfismo, donde se almacenan objetos
 * de diferentes tipos (`Cat`, `MutantParrot`, `Animal`) en una lista de tipo `Animal`
 * y se llama a su método `talk`.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class UseAnimal2 {
    /**
     * El método principal que ejecuta el código. Crea instancias de las clases `Animal`, `Cat`,
     * y `MutantParrot`, las almacena en una lista estática y una dinámica, y muestra los mensajes
     * devueltos por el método `talk` para cada uno de los objetos.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Creación de instancias de diferentes animales
        Animal a = new Animal(3, 3);
        Cat g = new Cat(1, 2);
        MutantParrot lM = new MutantParrot(3, 3);

        // Lista estática (arreglo) de animales
        Animal farm[] = new Animal[3];  // Se crea un arreglo de 3 animales
        farm[0] = a;  // Asignamos un Animal
        farm[1] = g;  // Asignamos un Cat
        farm[2] = lM; // Asignamos un MutantParrot

        // Iteramos sobre el arreglo y mostramos los resultados del método `talk` de cada animal
        for (Animal ani : farm) {
            System.out.println(ani.talk());  // Llama a `talk()` de cada animal (polimorfismo)
        }

        // Lista dinámica (LinkedList) de animales
        LinkedList<Animal> lorry = new LinkedList<Animal>();  // Se crea una lista dinámica
        lorry.add(a);  // Agrega el Animal
        lorry.add(g);  // Agrega el Cat
        lorry.add(lM); // Agrega el MutantParrot
        System.out.println("-----------------");
        // Iteramos sobre la lista dinámica y mostramos los resultados del método `talk` de cada animal
        for (Animal o : lorry) {
            System.out.println(o.talk());  // Llama a `talk()` de cada animal en la lista
        }
        System.out.println(lM.fly());   // Llama a `fly()` de MutantParrot
    }
}
