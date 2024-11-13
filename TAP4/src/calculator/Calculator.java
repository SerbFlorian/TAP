package calculator;

/**
 * Clase de calculadora simple que proporciona operaciones básicas como
 * suma, resta, multiplicación y división.
 * <p>
 * Esta clase está diseñada para ser probada con diferentes casos de uso y
 * asegurarse de que las operaciones matemáticas se realicen correctamente.
 */
public class Calculator {
    /**
     * Suma dos números.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return El resultado de la suma de num1 y num2.
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Resta dos números.
     *
     * @param num1 El número del cual se va a restar.
     * @param num2 El número que se va a restar de num1.
     * @return El resultado de la resta de num1 menos num2.
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplica dos números.
     *
     * @param num1 El primer número a multiplicar.
     * @param num2 El segundo número a multiplicar.
     * @return El resultado de la multiplicación de num1 y num2.
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divide dos números.
     *
     * @param num1 El numerador de la operación.
     * @param num2 El denominador de la operación.
     * @return El resultado de la división de num1 entre num2.
     * @throws ArithmeticException Si num2 es 0, se lanza una excepción
     *                             de división por cero.
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }
}
