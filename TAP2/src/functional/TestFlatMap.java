package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejemplo de uso de flatMap para aplanar una lista de listas de lenguajes de programación de varios desarrolladores.
 * Este ejemplo demuestra cómo usar flatMap para extraer elementos de colecciones dentro de colecciones.
 */
public class TestFlatMap {
    public static void main(String args[]) {
        // Crear una lista de desarrolladores
        List<Developer> team = new ArrayList<>();

        // Crear el desarrollador 'polyglot' que conoce varios lenguajes
        Developer polyglot = new Developer("esoteric");
        polyglot.add("clojure");
        polyglot.add("scala");
        polyglot.add("groovy");
        polyglot.add("go");

        // Crear el desarrollador 'busy' que conoce algunos lenguajes
        Developer busy = new Developer("pragmatic");
        busy.add("java");
        busy.add("javascript");

        // Añadir los desarrolladores a la lista del equipo
        team.add(polyglot);
        team.add(busy);

        // Usar flatMap para aplanar las listas de lenguajes de todos los desarrolladores
        List<String> teamLanguages = team.stream()
                .map(d -> d.getLanguages())         // Mapea cada Developer a su lista de lenguajes
                //flatMap permite convertir un lista de listas en una estructura de datos plana (una sola lista)
                .flatMap(l -> l.stream())           // Aplana cada lista de lenguajes en un flujo único
                .collect(Collectors.toList());     // Recoge el resultado en una lista
        // Imprimir todos los lenguajes conocidos por el equipo
        System.out.println(teamLanguages);
    }
}
