package patternmatching;

/**
 * La clase `Test` ejecuta un ejemplo de procesamiento de diferentes tipos de mensajes,
 * utilizando instancias de las clases `InsultMessage` y `QuitMessage`.
 */
public class Test {
    /*
     * CONCEPTOS TEORIA:
     * - CONTRACTE = Message -> ya que es la clase PARE (superclase)
     * - Asignación POLIMÓRFICA = new InsultMessage/QuitMessage -> líneas 17-19, ya que le estoy pasando una clase hija
     * - ENLAZADO DINÁMICO (DYNAMIC BINDING) = línea 46, ya que el método m1.getBody()
     * se resuelve de manera dinámica en tiempo de ejecución
     */
    public static void main(String[] args) {
        // Creación de instancias de mensajes de diferentes tipos
        InsultMessage m1 = new InsultMessage("me", "Stupid");
        InsultMessage m2 = new InsultMessage("me", "Stupid");
        QuitMessage m3 = new QuitMessage("me", "BYE");

        // Procesamiento de cada mensaje
        processMessage(m1);
        processMessage(m2);
        processMessage(m3);
    }

    /**
     * Procesa un mensaje según su tipo.
     * Dependiendo del tipo de mensaje (`InsultMessage` o `QuitMessage`),
     * imprime un mensaje específico o un mensaje de error para tipos desconocidos.
     *
     * @param m El mensaje a procesar, de tipo `Message`.
     */
    public static void processMessage(Message m) {

        // SE DEBE DESCOMENTAR CUANDO SE ACTIVEN LAS FUNCIONES EXPERIMENTALES
        // https://foojay.io/today/how-to-run-project-loom-from-intellij-idea/

        /*
         * Uso de pattern matching con switch (disponible en funciones experimentales):
         * Dependiendo del tipo de mensaje, imprime el cuerpo de `InsultMessage`
         * o un mensaje de despedida para `QuitMessage`.
         * Si no se reconoce el tipo, muestra "ERROR".
         *
         * switch (m) {
         *     case InsultMessage m1 -> System.out.println(m1.getBody());
         *     case QuitMessage m1 -> System.out.println("BYE BYE");
         *     default -> System.out.println("ERROR");
         * }
         */
    }
}
