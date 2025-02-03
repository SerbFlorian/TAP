package calculator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Clase para ejecutar la suite de pruebas de la calculadora y mostrar los resultados.
 * Esta clase ejecuta las pruebas de la clase CalculatorTestSuite y muestra el resultado de cada prueba,
 * indicando si todas las pruebas fueron exitosas o si hubo fallos.
 */
public class CalculatorTestRunner {
	/**
	 * Método principal que ejecuta las pruebas y muestra los resultados.
	 *
	 * @param args Argumentos de línea de comandos (no utilizados en esta clase).
	 */
	public static void main(String[] args) {
		// Ejecuta la suite de pruebas especificada (CalculatorTestSuite)
		Result result = JUnitCore.runClasses(CalculatorTestSuite.class);

		// Imprime los detalles de los fallos de las pruebas (si los hubiera)
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		// Imprime si todas las pruebas fueron exitosas o no
		System.out.println("TEST CALCULATOR OK? " + result.wasSuccessful());
	}
}
