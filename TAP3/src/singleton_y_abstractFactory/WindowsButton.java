package singleton_y_abstractFactory;

/**
 * Implementación concreta de un botón para Windows.
 * Esta clase representa un botón específico que se utiliza en un entorno Windows.
 */
public class WindowsButton implements Button {
    /**
     * Simula el comportamiento de un clic en un botón de Windows.
     * Al hacer clic, se imprime un mensaje en consola indicando que el botón ha sido presionado.
     */
    @Override
    public void click() {
        System.out.println("Windows Button Clicked!");  // Mensaje de clic en Windows
    }
}
