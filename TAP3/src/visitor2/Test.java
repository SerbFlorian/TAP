package visitor2;
/**
 * CONTRACTE -> ComputerPart
 * ASSIGNACIO POLIMORFICA -> new computer(),
 * ja que es on espero la classe pare i li assigno la filla
 * DYNAMIC BIDING -> .accept()
 */

/**
 * Esta clase contiene el método principal (`main`) para probar el comportamiento del patrón de diseño Visitor
 * aplicado a los componentes de una computadora.
 * En este ejemplo, se utiliza el patrón Visitor para permitir que diferentes tipos de objetos (componentes de la computadora)
 * acepten un visitante que realice operaciones sobre ellos.
 * El patrón Visitor se utiliza para separar las operaciones de los objetos que las realizan.
 */
public class Test {
    public static void main(String[] args) {

        // Se crea un objeto de tipo Computer y se asigna a la variable de tipo ComputerPart (polimorfismo).
        ComputerPart computer = new Computer();

        // El objeto computer acepta un visitante que realiza una operación sobre él.
        // En este caso, el visitante es ComputerPartDisplayVisitor que probablemente muestre detalles del computador.
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
