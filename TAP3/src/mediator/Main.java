package mediator;

/**
 * Clase principal que inicializa el mediador y los componentes, y demuestra la interacción entre ellos
 * a través del patrón Mediador.
 *
 * <p>CONTRACTE: Interface de los componentes es utilizada como tipo para definir interacciones generales.</p>
 * <p>ASSIGNACIO POLIMORFICA: Uso de las instancias específicas new ComponentA y new ComponentB
 * asignadas a variables del tipo Component.</p>
 * <p>DYNAMIC BINDING: Llamadas dinámicas a los métodos .doA() y .doB() a través del mediador,
 * resolviendo qué método ejecutar en tiempo de ejecución.</p>
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancia del mediador concreto
        ConcreteMediator mediator = new ConcreteMediator();

        // Crear componentes A y B, pasando el mediador a cada uno
        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);

        // Configurar el mediador con los componentes A y B
        mediator.setComponentA(componentA);
        mediator.setComponentB(componentB);

        // Ejecutar métodos en los componentes, demostrando la comunicación a través del mediador
        componentA.doA(); // Componente A realiza una acción que notifica al mediador
        componentB.doB(); // Componente B realiza una acción que notifica al mediador
    }
}
