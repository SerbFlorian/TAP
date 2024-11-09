package interfaces;

/**
 * La clase `UseThing` sirve como ejemplo de cómo utilizar la clase `Thing` que implementa las interfaces `Musician` y `Bop`.
 * En este caso, se crean objetos de tipo `Thing` y se invocan los métodos definidos en las interfaces a través de estos objetos.
 * <p>
 * Se demuestra cómo se pueden utilizar los métodos `sing` y `dance` de forma directa y a través de variables de tipo interfaz.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class UseThing {

    /**
     * El método principal (`main`) crea un objeto de la clase `Thing` y lo utiliza para llamar a los métodos
     * `sing` y `dance` tanto directamente como a través de referencias a las interfaces `Musician` y `Bop`.
     * También muestra el uso de casting para convertir un objeto de tipo `Bop` a `Musician`.
     *
     * @param args Los argumentos de línea de comandos (no se usan en este ejemplo).
     */
    public static void main(String[] args) {
        Thing c = new Thing();  // Crear una instancia de la clase Thing
        sing(c);  // Llamar al método sing usando la clase Thing
        dance(c);  // Llamar al método dance usando la clase Thing

        // Declaración de variables para interfaces
        Musician music;
        Bop dance;

        // Asignación de la instancia de Thing a las variables de tipo Musician y Bop
        music = c;
        dance = c;

        // Llamadas a los métodos a través de las interfaces Musician y Bop
        System.out.println(music.sing());  // Llamar al método sing a través de la interfaz Musician
        System.out.println(dance.dance());  // Llamar al método dance a través de la interfaz Bop

        // Uso de casting para convertir de Bop a Musician y llamar al método sing
        music = (Musician) dance;
        System.out.println(music.sing());  // Llamar al método sing después de hacer el casting
    }

    /**
     * Método que recibe un objeto que implementa la interfaz `Musician` y llama a su método `sing`.
     *
     * @param m El objeto que implementa la interfaz `Musician`.
     */
    public static void sing(Musician m) {
        System.out.println(m.sing());  // Llamar al método sing del objeto pasado como parámetro
    }

    /**
     * Método que recibe un objeto que implementa la interfaz `Bop` y llama a su método `dance`.
     *
     * @param b El objeto que implementa la interfaz `Bop`.
     */
    public static void dance(Bop b) {
        System.out.println(b.dance());  // Llamar al método dance del objeto pasado como parámetro
    }
}
