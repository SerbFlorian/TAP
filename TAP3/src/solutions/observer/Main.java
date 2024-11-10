package solutions.observer;

// CONTRACTE -> ObserverList y ObserverListImpl
// ASSIGNACIO POLIMORFICA -> new PrinterObserver() y new BackupObserver(), ja que es on espero la classe pare i li assigno la filla
// DYNAMIC BIDING -> register(), add()

public class Main {
	/**
	 * Método principal que ejecuta las pruebas con cadenas de texto e enteros.
	 *
	 * @param args Argumentos de la línea de comandos (no utilizados en este caso).
	 */
	public static void main(String[] args) {
		testStrings();  // Ejecuta la prueba con cadenas de texto.
		testIntegers(); // Ejecuta la prueba con enteros.
	}

	/**
	 * Prueba del comportamiento de la lista observada con cadenas de texto.
	 */
	public static void testStrings() {

		// Creamos una lista observada de tipo String
		ObserverListImpl<String> strings = new ObserverListImpl<String>();

		try {
			// Registramos dos observadores: uno para imprimir y otro para hacer copia de seguridad.
			strings.register(new PrinterObserver<String>());
			strings.register(new BackupObserver<String>());
		} catch (RepeatedObserverException e) {
			// En caso de que ya exista un observador, mostramos el mensaje de error
			System.out.println("Existent Observer Exception....");
			System.out.println("   '---> " + e.getMessage());
		}

		// Añadimos elementos a la lista observada
		for (String s : new String[]{"hola", "adios", "hello", "goodbye"})
			strings.add(s);

		// Mostramos el contenido de la lista después de añadir los elementos
		System.out.println("List content:");
		for (String s : strings)
			System.out.println(s); // Se imprime cada elemento de la lista
		System.out.println();

		// Intentamos registrar otro observador del tipo BackupObserver (esto lanzará una excepción)
		try {
			strings.register(new BackupObserver<String>());
		} catch (RepeatedObserverException e) {
			// Si el observador ya existe, capturamos la excepción y mostramos el mensaje correspondiente
			System.out.println("Existent Observer...");
			System.out.println("   '---> " + e.getMessage());
		}
	}

	/**
	 * Prueba del comportamiento de la lista observada con enteros.
	 */
	public static void testIntegers() {

		// Creamos una lista observada de tipo Integer
		ObserverListImpl<Integer> integers = new ObserverListImpl<Integer>();

		try {
			// Registramos dos observadores: uno para imprimir y otro para hacer copia de seguridad.
			integers.register(new PrinterObserver<Integer>());
			integers.register(new BackupObserver<Integer>());
		} catch (RepeatedObserverException e) {
			// En caso de que ya exista un observador, mostramos el mensaje de error
			System.out.println("Existent Observer.");
			System.out.println("   '---> " + e.getMessage());
		}

		// Añadimos elementos a la lista observada
		for (Integer s : new Integer[]{ 4, 6, 3, 5, 4 })
			integers.add(s);

		// Mostramos el contenido de la lista después de añadir los elementos
		System.out.println("List content:");
		for (Integer s : integers)
			System.out.println(s); // Se imprime cada elemento de la lista
		System.out.println();
	}
}
