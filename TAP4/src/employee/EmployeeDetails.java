package employee;

/**
 * Clase que representa los detalles de un empleado.
 * Esta clase contiene información como el nombre, salario mensual y edad del empleado.
 *
 * @author Raul
 */
public class EmployeeDetails {
    private String name;        // Nombre del empleado
    private double monthlySalary; // Salario mensual del empleado
    private int age;            // Edad del empleado

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param name El nombre del empleado a establecer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el salario mensual del empleado.
     *
     * @return El salario mensual del empleado
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * Establece el salario mensual del empleado.
     *
     * @param monthlySalary El salario mensual del empleado a establecer.
     * @throws IllegalArgumentException Si el salario mensual es negativo.
     */
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("El salario mensual no puede ser negativo.");
        }
        this.monthlySalary = monthlySalary;
    }

    /**
     * Obtiene la edad del empleado.
     *
     * @return La edad del empleado
     */
    public int getAge() {
        return age;
    }

    /**
     * Establece la edad del empleado.
     *
     * @param age La edad del empleado a establecer.
     * @throws IllegalArgumentException Si la edad es menor que 18 o mayor que 100.
     */
    public void setAge(int age) {
        if (age < 18 || age > 100) {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 100 años.");
        }
        this.age = age;
    }
}
