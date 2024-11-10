package employee;

/**
 * Lógica de negocio relacionada con el manejo de empleados.
 * Esta clase contiene métodos para calcular el salario anual y la cantidad de la evaluación (appraisal) de un empleado.
 *
 * @author Raul
 */
public class EmpBusinessLogic {
    /**
     * Calcula el salario anual de un empleado.
     *
     * @param employeeDetails El objeto que contiene la información del empleado, incluyendo su salario mensual.
     * @return El salario anual calculado como el salario mensual multiplicado por 12.
     */
    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        // El salario anual es el salario mensual multiplicado por 12
        return employeeDetails.getMonthlySalary() * 12;
    }

    /**
     * Calcula la cantidad de la evaluación (appraisal) de un empleado.
     * La cantidad de la evaluación depende del salario mensual del empleado.
     * Si el salario mensual es menor a 10,000, la evaluación es de 500; de lo contrario, es de 1,000.
     *
     * @param employeeDetails El objeto que contiene la información del empleado, incluyendo su salario mensual.
     * @return La cantidad de la evaluación según el salario del empleado.
     */
    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        // Si el salario mensual es menor a 10,000, la evaluación es de 500, de lo contrario es de 1,000
        if (employeeDetails.getMonthlySalary() < 10000) {
            return 500;
        } else {
            return 1000;
        }
    }
}
