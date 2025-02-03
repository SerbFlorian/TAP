package annotations;

import java.lang.annotation.Annotation;

/**
 * Clase principal para demostrar el uso de reflexiones y anotaciones en Java.
 * Esta clase verifica si la clase Person tiene la anotación Copyright,
 * y si es así, imprime sus valores.
 */
public class ReflectMain {
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Verifica si la clase Person está anotada con @Copyright y, en caso afirmativo,
     * imprime los valores de la anotación.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String args[]) {
        // Obtener la clase Person
        Class<Person> obj = Person.class;

        // Verificar si la clase Person tiene la anotación @Copyright
        if (obj.isAnnotationPresent(Copyright.class)) {
            // Obtener la anotación @Copyright aplicada a la clase Person
            Annotation annotation = obj.getAnnotation(Copyright.class);

            // Convertir la anotación a su tipo real (Copyright)
            Copyright copy = (Copyright) annotation;

            // Imprimir la prioridad de la anotación
            System.out.printf("%nPriority :%s", copy.priority());

            // Imprimir el creador de la anotación
            System.out.printf("%nCreatedBy :%s", copy.createdBy());

            // Imprimir las etiquetas asociadas a la anotación
            System.out.printf("%nTags :");

            // Obtener el número de etiquetas para controlar la impresión
            int tagLength = copy.tags().length;

            // Imprimir las etiquetas separadas por comas
            for (String tag : copy.tags()) {
                if (tagLength > 1) {
                    // Si hay más de una etiqueta, añadir una coma después
                    System.out.print(tag + ", ");
                } else {
                    // Si es la última etiqueta, solo imprimirla sin coma
                    System.out.print(tag);
                }
                tagLength--;
            }

            // Imprimir la fecha de última modificación de la anotación
            System.out.printf("%nLastModified :%s%n%n", copy.lastModified());
        }
    }
}
