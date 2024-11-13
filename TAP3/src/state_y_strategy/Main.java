package state_y_strategy;

/**
 * El patrón *State* permite que un objeto cambie su comportamiento cuando cambia su estado interno.
 * En lugar de usar una serie de condicionales (if-else o switch) para manejar diferentes estados,
 * este patrón utiliza objetos distintos para representar los diferentes estados y delega el comportamiento
 * específico de cada estado a esos objetos. Esto hace que el código sea más flexible y fácil de mantener,
 * ya que se puede agregar o modificar estados sin afectar otras partes del código.
 * <p>
 * El patrón *Strategy* permite que un objeto seleccione un algoritmo (o estrategia) en tiempo de ejecución.
 * En lugar de tener un código rígido que determina cómo realizar una operación específica,
 * este patrón define una familia de algoritmos (estrategias) y los encapsula en clases separadas, lo que permite
 * al objeto delegar la ejecución de un comportamiento a una estrategia que puede cambiar dinámicamente.
 * Es útil cuando se tienen varias maneras de hacer algo, pero no se desea un código con muchas condiciones para
 * elegir entre los diferentes comportamientos.
 */
public class Main {
    public static void main(String[] args) {
        // Crear el contexto de la orden (pedido)
        OrderContext order = new OrderContext();

        // Establecer el estado del pedido como Pendiente y calcular el precio con descuento
        order.setState(new PendingState());
        // En este estado no se aplica ningún descuento
        System.out.println("Precio con descuento: " + order.applyDiscount(100.0));

        // Establecer el estado del pedido como Enviado y calcular el precio con descuento
        order.setState(new ShippedState());
        // En este estado se aplica un descuento del 20% (descuento de temporada)
        System.out.println("Precio con descuento: " + order.applyDiscount(100.0));

        // Establecer el estado del pedido como Cancelado y calcular el precio con descuento
        order.setState(new CancelledState());
        // En este estado no se aplica ningún descuento
        System.out.println("Precio con descuento: " + order.applyDiscount(100.0));
    }
}
