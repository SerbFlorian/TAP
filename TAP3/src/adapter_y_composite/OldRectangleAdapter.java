package adapter_y_composite;

// Adaptador para que OldRectangle cumpla con la interfaz Graphic
public class OldRectangleAdapter implements Graphic {
    // Instancia de OldRectangle que será adaptada
    private OldRectangle oldRectangle;

    /**
     * Constructor del adaptador.
     * Este constructor toma un objeto OldRectangle y lo adapta
     * para que pueda ser utilizado en el contexto de la interfaz Graphic.
     *
     * @param oldRectangle El objeto OldRectangle a adaptar.
     */
    public OldRectangleAdapter(OldRectangle oldRectangle) {
        this.oldRectangle = oldRectangle;
    }

    /**
     * Método para dibujar el rectángulo.
     * Este método adapta la llamada al método render() de OldRectangle
     * para que cumpla con la interfaz Graphic.
     */
    @Override
    public void draw() {
        // Adaptar el método render() al método draw()
        oldRectangle.render();
    }
}
