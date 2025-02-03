package template;
/**
 * CONTRACTE -> Game
 * ASSIGNACIO POLIMORFICA -> new Cricket() y new Football(),
 * ja que es on espero la classe pare i li assigno la filla
 * DYNAMIC BIDING -> .play()
 */

/**
 * Clase principal que demuestra el uso del patrón Template Method.
 * En este ejemplo, se crean dos tipos de juegos: Cricket y Football,
 * y se muestran cómo se ejecutan utilizando el método plantilla play().
 */
class Main {
    /**
     * Método principal que crea instancias de juegos específicos
     * (Cricket y Football) y ejecuta su método play().
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args) {

        // Creamos un juego de Cricket, que es una subclase concreta de Game
        Game game = new Cricket();
        // Ejecutamos el juego (utiliza el método plantilla de la clase Game)
        game.play();

        // Imprimimos una línea en blanco para separar las salidas de los dos juegos
        System.out.println();

        // Creamos un juego de Football, que es otra subclase concreta de Game
        game = new Football();
        // Ejecutamos el juego (se utilizará el método play() de la clase Football)
        game.play();
    }
}

