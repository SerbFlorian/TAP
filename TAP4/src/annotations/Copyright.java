package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotación personalizada que se puede aplicar a clases, interfaces o anotaciones.
 * Proporciona metadatos relacionados con la prioridad, etiquetas, autor y última modificación de la clase anotada.
 *
 * Esta anotación se utiliza para agregar información adicional a las clases en tiempo de ejecución.
 */
@Retention(RetentionPolicy.RUNTIME)  // La anotación estará disponible en tiempo de ejecución
@Target(ElementType.TYPE)  // La anotación solo se puede aplicar a clases, interfaces o anotaciones
public @interface Copyright {
    /**
     * Enum que define los niveles de prioridad de la anotación Copyright.
     *
     * LOW: Baja prioridad.
     * MEDIUM: Prioridad media.
     * HIGH: Alta prioridad.
     */
    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    /**
     * Establece la prioridad de la anotación. El valor predeterminado es MEDIUM.
     *
     * @return El nivel de prioridad de la clase anotada.
     */
    Priority priority() default Priority.MEDIUM;

    /**
     * Define las etiquetas asociadas a la clase anotada.
     *
     * @return Un array de etiquetas.
     */
    String[] tags() default "";

    /**
     * Define el autor de la clase anotada. El valor predeterminado es "pedro".
     *
     * @return El nombre del creador de la clase.
     */
    String createdBy() default "pedro";

    /**
     * Define la fecha de la última modificación de la clase anotada. El valor predeterminado es "today".
     *
     * @return La fecha de la última modificación.
     */
    String lastModified() default "today";
}
