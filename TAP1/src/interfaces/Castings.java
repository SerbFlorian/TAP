package interfaces;

/**
 * La clase `Castings` demuestra el uso de *casting* en Java, donde objetos de tipo `Object`
 * se convierten en tipos más específicos mediante el uso de *casting explícito*.
 * La clase también muestra cómo se puede hacer un casting entre interfaces y clases.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Castings {
    /**
     * Método principal donde se realiza el casting explícito de objetos a tipos específicos
     * y se invocan métodos asociados a esos tipos.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Se crea un objeto de la clase Thing y se asigna a una variable de tipo Object
        Object o1 = new Thing();

        // Se realiza un casting explícito de Object a Bop, ya que Thing implementa Bop
        Bop b = (Bop) o1;
        b.dance();  // Llamada al método dance() de la interfaz Bop

        // Se realiza un casting explícito de Object a Musician, ya que Thing también implementa Musician
        Musician m = (Musician) o1;
        m.sing();  // Llamada al método sing() de la interfaz Musician

        // Realizamos un casting de Bop a Musician, ya que Bop también es implementado por Musician
        Musician m2 = (Musician) b;
        m2.sing();  // Llamada al método sing() del tipo Musician

        // Llamada al método dance() de Bop para confirmar que sigue disponible
        b.dance();
    }
}
