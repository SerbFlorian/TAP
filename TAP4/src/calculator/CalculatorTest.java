package calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Clase de pruebas unitarias para la clase Calculator.
 * Esta clase contiene métodos de prueba para verificar el funcionamiento
 * correcto de las operaciones básicas de la calculadora: suma, resta, multiplicación y división.
 */
public class CalculatorTest {
	/**
	 * Prueba unitaria para el método de suma de la clase Calculator.
	 * Compara el resultado de la operación de suma con el valor esperado.
	 */
	@Test
	public void testAdd() {
		double value1 = 3;  // Primer número para la suma
		double value2 = 3;  // Segundo número para la suma
		double result = value1 + value2;  // Resultado esperado de la suma
		Calculator c = new Calculator();  // Instancia de la calculadora
		System.out.println("-> TESTING ADD...");
		// Verifica que el resultado de la suma es correcto
		Assert.assertTrue(c.add(value1, value2) == result);
	}

	/**
	 * Prueba unitaria para el método de resta de la clase Calculator.
	 * Compara el resultado de la operación de resta con el valor esperado.
	 */
	@Test
	public void testSubtract() {
		double value1 = 5;  // Primer número para la resta
		double value2 = 10;  // Segundo número para la resta
		double result = value1 - value2;  // Resultado esperado de la resta
		Calculator c = new Calculator();  // Instancia de la calculadora
		System.out.println("-> TESTING Subtract...");
		// Verifica que el resultado de la resta es correcto
		Assert.assertTrue(c.subtract(value1, value2) == result);
	}

	/**
	 * Prueba unitaria para el método de multiplicación de la clase Calculator.
	 * Compara el resultado de la operación de multiplicación con el valor esperado.
	 */
	@Test
	public void testMultiply() {
		double value1 = 3;  // Primer número para la multiplicación
		double value2 = 4;  // Segundo número para la multiplicación
		double result = value1 * value2;  // Resultado esperado de la multiplicación
		Calculator c = new Calculator();  // Instancia de la calculadora
		System.out.println("-> TESTING MULTIPLY..");
		// Verifica que el resultado de la multiplicación es correcto
		Assert.assertTrue(c.multiply(value1, value2) == result);
	}

	/**
	 * Prueba unitaria para el método de división de la clase Calculator.
	 * Compara el resultado de la operación de división con el valor esperado.
	 */
	@Test
	public void testDivide() {
		double value1 = 9;  // Numerador para la división
		double value2 = 12;  // Denominador para la división
		double result = value1 / value2;  // Resultado esperado de la división
		Calculator c = new Calculator();  // Instancia de la calculadora
		System.out.println("-> TESTING DIVIDE...");
		// Verifica que el resultado de la división es correcto
		Assert.assertTrue(c.divide(value1, value2) == result);
	}
}
