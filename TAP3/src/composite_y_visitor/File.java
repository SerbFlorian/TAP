package composite_y_visitor;

/**
 * Clase que representa un archivo en la estructura de componentes.
 * Implementa la interfaz Component, lo que le permite ser visitada por un Visitor.
 */
class File implements Component {
    private final String name; // Nombre del archivo
    private final int size; // Tamaño del archivo, utilizado para mostrar el uso del Visitor

    /**
     * Constructor de la clase File.
     * @param name Nombre del archivo.
     * @param size Tamaño del archivo.
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Obtiene el tamaño del archivo.
     * @return El tamaño del archivo en bytes.
     */
    public int getSize() {
        return size;
    }

    /**
     * Obtiene el nombre del archivo.
     * @return El nombre del archivo.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Acepta un visitante que realiza una operación sobre el archivo.
     * @param visitor El visitante que realizará la operación.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFile(this);
    }
}
