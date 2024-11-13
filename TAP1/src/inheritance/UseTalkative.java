package inheritance;

/**
 * La clase `UseTalkative` es el punto de entrada del programa donde se crea una
 * instancia de las clases `Homer` y `Bart`, que implementan la clase abstracta `Talkative`.
 * Luego, se utiliza un array de `Talkative` para almacenar las instancias de estas clases y
 * se llama al método `talk` de cada una de ellas.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class UseTalkative {
    /**
     * Método principal que crea instancias de las clases `Homer` y `Bart`, las agrega
     * a un array de `Talkative` y luego imprime el resultado de llamar al método `talk`
     * para cada objeto almacenado en el array.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Crear instancias de Homer y Bart
        Homer homer = new Homer();
        Bart bart = new Bart();

        // Crear un array de Talkative que almacene las instancias de Homer y Bart
        Talkative springfield[] = new Talkative[2];
        springfield[0] = homer;
        springfield[1] = bart;

        // Iterar sobre el array y llamar al método talk para cada objeto
        for (Talkative h : springfield) {
            System.out.println(h.talk());  // Imprimir el mensaje de cada objeto
        }
    }
}
