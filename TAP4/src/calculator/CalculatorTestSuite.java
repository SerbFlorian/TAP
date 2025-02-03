package calculator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Clase que agrupa todas las pruebas unitarias relacionadas con la clase Calculator.
 * Esta clase ejecuta todos los métodos de prueba definidos en la clase CalculatorTest.
 *
 * Se utiliza para ejecutar varias pruebas de manera conjunta dentro de una misma suite de pruebas.
 */
@RunWith(value = Suite.class)  // Define que esta clase es una suite de pruebas
@SuiteClasses(value = {CalculatorTest.class})  // Especifica las clases de prueba que se deben ejecutar
public class CalculatorTestSuite {
    // No es necesario agregar ningún método aquí, ya que esta clase solo sirve como un contenedor para las pruebas
}
