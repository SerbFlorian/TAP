package singleton_y_abstractFactory;

/**
 * Implementación concreta de un botón para macOS.
 * Esta clase representa un botón específico que se utiliza en un entorno macOS.
 */
public class MacOSButton implements Button {
    /**
     * Simula el comportamiento de un clic en un botón de macOS.
     * Al hacer clic, se imprime un mensaje en consola indicando que el botón ha sido presionado.
     */
    @Override
    public void click() {
        System.out.println("MacOS Button Clicked!");  // Mensaje de clic en macOS
    }
}
