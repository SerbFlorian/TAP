package functional;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase que representa un Desarrollador con un nombre y un conjunto de lenguajes de programación que conoce.
 */
public class Developer {

    private String name; // Nombre del desarrollador
    private Set<String> languages; // Conjunto de lenguajes de programación que conoce el desarrollador

    /**
     * Constructor que inicializa un desarrollador con un nombre específico.
     *
     * @param name el nombre del desarrollador
     */
    public Developer(String name) {
        this.languages = new HashSet<>(); // languages será un conjunto vacío de cadenas (Set<String>)
        // al momento de crear un nuevo objeto Developer
        this.name = name;
    }

    /**
     * Añade un lenguaje de programación al conjunto de lenguajes que el desarrollador conoce.
     *
     * @param language el lenguaje de programación a añadir
     */
    public void add(String language) {
        this.languages.add(language);
    }

    /**
     * Obtiene el conjunto de lenguajes de programación que el desarrollador conoce.
     *
     * @return un conjunto de nombres de lenguajes de programación
     */
    public Set<String> getLanguages() {
        return languages;
    }

    /**
     * Obtiene el nombre del desarrollador.
     *
     * @return el nombre del desarrollador
     */
    public String getName() {
        return name;
    }
}
