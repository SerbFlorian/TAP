package visitor;
/**
 * CONTRACTE -> TaxiVisitor
 * ASSIGNACIO POLIMORFICA -> new HonoredTaxiVisitor() y new CorruptTaxiVisitor(),
 * ja que es on espero la classe pare i li assigno la filla
 * DYNAMIC BIDING -> .accept()
 */

import java.util.LinkedList;

/**
 * Clase principal que simula el uso del patrón **Visitor** para visitar diferentes tipos de
 * personas (clientes) que interactúan con diferentes visitantes (taxistas). En este ejemplo,
 * se utilizan dos tipos de visitantes: **HonoredTaxiVisitor** y **CorruptTaxiVisitor**, que
 * realizan diferentes acciones al ser aceptados por los objetos de tipo `Person` (que son
 * `HastyPerson` y `LeisurelyPerson`).
 * <p>
 * El patrón **Visitor** permite separar la lógica de los objetos de los visitantes, haciendo
 * que la lógica de las operaciones sea flexible y extensible sin necesidad de modificar las clases
 * de los objetos visitados.
 * <p>
 * Se realiza una simulación donde el taxi de honor y el taxi corrupto visitan a los mismos
 * clientes, pero con comportamientos diferentes.
 */
public class Main {
    public static void main(String[] args) {
        // Se crea el visitante de tipo HonoredTaxiVisitor
        TaxiVisitor taxiDriver = new HonoredTaxiVisitor();

        // Lista de clientes que implementan la interfaz Person
        LinkedList<Person> clients = new LinkedList<Person>();
        clients.add(new HastyPerson(5));  // Cliente que es una persona apurada
        clients.add(new LeisurelyPerson(8));  // Cliente que es una persona relajada

        // El visitante de tipo HonoredTaxiVisitor visita a cada cliente
        for (Person client : clients) {
            client.accept(taxiDriver);  // El cliente acepta al visitante
        }

        System.out.println("---");

        // Ahora se cambia al visitante de tipo CorruptTaxiVisitor
        taxiDriver = new CorruptTaxiVisitor();

        // El visitante de tipo CorruptTaxiVisitor visita a cada cliente
        for (Person client : clients) {
            client.accept(taxiDriver);  // El cliente acepta al visitante
        }
    }
}

