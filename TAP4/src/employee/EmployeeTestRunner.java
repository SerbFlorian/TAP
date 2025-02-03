package employee;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Clase para ejecutar las pruebas unitarias de la clase TestEmployeeDetails.
 * Esta clase se encarga de ejecutar las pruebas definidas y mostrar los resultados en consola.
 *
 * @author Raul
 */
public class EmployeeTestRunner {
	/**
	 * Método principal para ejecutar las pruebas unitarias.
	 * Ejecuta las pruebas definidas en TestEmployeeDetails y muestra el resultado en consola.
	 *
	 * @param args Argumentos de línea de comandos (no utilizados en este caso).
	 */
	public static void main(String[] args) {
		// Ejecutar las pruebas de la clase TestEmployeeDetails
		Result result = JUnitCore.runClasses(TestEmployeeDetails.class);

		// Imprimir los resultados de las pruebas
		if (result.wasSuccessful()) {
			// Si todas las pruebas pasan exitosamente
			System.out.println("Todas las pruebas pasaron exitosamente.");
		} else {
			// Si alguna prueba falla, se detallan los errores
			System.out.println("Algunas pruebas fallaron. Detalles:");
			for (Failure failure : result.getFailures()) {
				// Mostrar el nombre de la prueba que falló y la excepción que ocurrió
				System.out.println("Error en la prueba: " + failure.getTestHeader());
				System.out.println("Excepción: " + failure.getException());
			}
		}
	}
}
