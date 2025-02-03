package iterator_y_visitor;

/**
 * Clase que representa un archivo dentro de un sistema de componentes.
 * Implementa la interfaz {@link Component}, permitiendo ser visitada por un {@link Visitor}.
 */
class File implements Component {
    private final String name;
    private final int size;

    /**
     * Constructor para crear un archivo con un nombre y un tamaño.
     *
     * @param name El nombre del archivo.
     * @param size El tamaño del archivo en bytes.
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Obtiene el tamaño del archivo.
     *
     * @return El tamaño del archivo en bytes.
     */
    public int getSize() {
        return size;
    }

    /**
     * Obtiene el nombre del archivo.
     *
     * @return El nombre del archivo.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Permite que un visitante realice una operación sobre este archivo.
     *
     * @param visitor El visitante que realiza la operación.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFile(this); // Llama al método correspondiente del visitante para el archivo
    }
}
