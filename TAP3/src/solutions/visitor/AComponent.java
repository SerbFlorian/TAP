package solutions.visitor;

import java.util.List;

/**
 * Interface que representa un componente de un sistema jerárquico.
 * Cualquier clase que implemente esta interfaz debe ser capaz de listar sus elementos,
 * convertirse en una lista, establecer su componente padre y aceptar un visitante.
 */
interface AComponent {
    /**
     * Muestra una lista o descripción del componente.
     * Este método puede ser utilizado para mostrar el contenido o estructura interna del componente.
     */
    void ls();

    /**
     * Convierte el componente en una lista de sus elementos hijos.
     *
     * @return una lista de objetos AComponent, que representa los elementos hijos del componente.
     */
    List<AComponent> toList();

    /**
     * Establece el componente padre de este componente.
     * Esto es útil para mantener una jerarquía y navegación ascendente en un sistema de componentes.
     *
     * @param parent el componente padre que debe ser asignado a este componente.
     */
    void setParent(AComponent parent);

    /**
     * Permite que un visitante interactúe con este componente.
     * El patrón de diseño Visitor permite agregar nuevas funcionalidades a los objetos
     * sin modificar su código.
     *
     * @param v el visitante que debe interactuar con este componente.
     */
    void accept(Visitor v);
}
