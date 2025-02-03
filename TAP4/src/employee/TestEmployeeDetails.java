package employee;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Clase de pruebas unitarias para la clase EmpBusinessLogic.
 * Esta clase verifica los métodos de cálculo de salario anual y bonificación del empleado.
 *
 * @author Raul
 */
public class TestEmployeeDetails {
	// Instancia de la clase que contiene la lógica de negocio para el cálculo de salarios y bonificaciones
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();

	// Instancia de EmployeeDetails que representa los detalles de un empleado
	EmployeeDetails employee;

	/**
	 * Método que se ejecuta antes de cada prueba.
	 * Inicializa un objeto EmployeeDetails con datos de ejemplo.
	 */
	@Before
	public void setup() {
		System.out.println("setup!");
		employee = new EmployeeDetails();
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000); // Establecemos un salario mensual de 8000
	}

	/**
	 * Prueba para calcular la bonificación del empleado.
	 * Verifica que la bonificación es de 500 cuando el salario mensual es menor a 10000.
	 */
	@Test
	public void testCalculateAppraisal() {
		System.out.println("testCalculateAppraisal");

		// Calculamos la bonificación para el empleado con salario mensual de 8000
		double appraisal = empBusinessLogic.calculateAppraisal(employee);

		// Comprobamos que la bonificación es 500
		assertEquals(500, appraisal, 0.0);
	}

	/**
	 * Prueba para calcular el salario anual del empleado.
	 * Verifica que el salario anual se calcule correctamente (12 veces el salario mensual).
	 */
	@Test
	public void testCalculateYearlySalary() {
		System.out.println("testCalculateYearlySalary");

		// Calculamos el salario anual para un salario mensual de 8000
		double salary = empBusinessLogic.calculateYearlySalary(employee);

		// Comprobamos que el salario anual es 96000 (8000 * 12)
		assertEquals(96000, salary, 0.0);
	}

	/**
	 * Método que se ejecuta después de cada prueba.
	 * Libera los recursos utilizados durante la prueba.
	 */
	@After
	public void tearDown() {
		System.out.println("tear down!");
		employee = null; // Limpiamos la referencia del objeto para evitar posibles efectos secundarios
	}
}
