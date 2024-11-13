package decorator_composite;

/**
 * El patrón Composite permite tratar tanto los objetos individuales (como ítems de menú)
 * como las composiciones de objetos (como menús que contienen otros menús o ítems)
 * de manera uniforme. Esto facilita la creación de estructuras jerárquicas complejas
 * donde los componentes pueden ser tratados de forma recursiva sin importar si son hojas o nodos intermedios.
 * <p>
 * El patrón Decorator permite añadir funcionalidades adicionales a un objeto de manera dinámica
 * y flexible, sin modificar su código original. En este caso, se utiliza para agregar comportamientos
 * como el estilo o control de acceso a los elementos de menú, sin cambiar la estructura subyacente del menú.
 */
public class Main {
    public static void main(String[] args) {
        // Crear elementos de menú
        MenuComponent fileMenu = new Menu("File"); // Menú principal "File"
        MenuComponent editMenu = new Menu("Edit"); // Menú principal "Edit"
        MenuComponent openItem = new MenuItem("Open"); // Ítem de menú "Open"
        MenuComponent saveItem = new MenuItem("Save"); // Ítem de menú "Save"
        MenuComponent cutItem = new MenuItem("Cut"); // Ítem de menú "Cut"
        MenuComponent copyItem = new MenuItem("Copy"); // Ítem de menú "Copy"

        // Construir la jerarquía de menú (composición de menús y elementos)
        fileMenu.add(openItem); // Añadir "Open" al menú "File"
        fileMenu.add(saveItem); // Añadir "Save" al menú "File"
        editMenu.add(cutItem);  // Añadir "Cut" al menú "Edit"
        editMenu.add(copyItem); // Añadir "Copy" al menú "Edit"

        // Crear decoradores para los elementos del menú
        MenuComponent styledFileMenu = new StyleDecorator(fileMenu, "Bold"); // Decorar el menú "File" con estilo "Bold"
        MenuComponent restrictedSaveItem = new PermissionDecorator(saveItem, "ADMIN", "USER"); // El usuario no tiene permisos ADMIN para "Save"

        // Mostrar la estructura de menú con decoradores aplicados
        System.out.println("== Menú con Decoradores ==");

        // Aplicar el estilo "Bold" al menú "File" y verificar los permisos del ítem "Save"
        styledFileMenu.display(); // Muestra el menú "File" con estilo aplicado
        restrictedSaveItem.display(); // Muestra el ítem "Save" con permisos denegados (si el usuario no tiene el rol "ADMIN")
        editMenu.display(); // Muestra el menú "Edit" sin cambios
    }
}
