package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Esta clase implementa un proxy dinámico utilizando la interfaz InvocationHandler.
 * Permite interceptar las llamadas a los métodos de un objeto objetivo y ejecutar
 * código antes y después de la invocación del método real.
 * <p>
 * El proxy permite añadir lógica adicional (como logging, validación, etc.) sin
 * modificar el código de la clase original.
 */
public class DynamicProxy implements InvocationHandler {
    // El objeto al que se delegarán las invocaciones de los métodos
    private Object target = null;

    /**
     * Crea un nuevo proxy dinámico que intercepta las llamadas a los métodos del objeto objetivo.
     *
     * @param target El objeto que será interceptado por el proxy.
     * @return Un nuevo proxy que implementa las interfaces del objeto objetivo y delega las llamadas a sus métodos.
     */
    public static Object newInstance(Object target) {
        // Obtiene las interfaces implementadas por el objeto objetivo
        Class targetClass = target.getClass();
        Class interfaces[] = targetClass.getInterfaces();

        // Crea un nuevo proxy que intercepta las llamadas a los métodos
        return Proxy.newProxyInstance(targetClass.getClassLoader(),
                interfaces, new DynamicProxy(target));
    }

    /**
     * Constructor privado para crear el proxy dinámico. Se guarda el objeto objetivo
     * al que se delegarán las llamadas a los métodos.
     *
     * @param target El objeto objetivo a delegar las invocaciones.
     */
    private DynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * Intercepta la invocación de un método en el objeto objetivo y añade lógica antes
     * y después de la ejecución del método real.
     *
     * @param proxy  El proxy sobre el que se realiza la invocación.
     * @param method El método que se está invocando.
     * @param args   Los parámetros del método.
     * @return El resultado de la invocación del método real.
     * @throws Throwable Si ocurre un error durante la invocación, se lanza una excepción.
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invocationResult = null;

        try {
            // Lógica antes de la invocación del método real
            System.out.println("Antes del método " + method.getName());

            // Invoca el método real en el objeto objetivo
            invocationResult = method.invoke(this.target, args);

            // Lógica después de la invocación del método real
            System.out.println("Después del método " + method.getName());
        } catch (InvocationTargetException ite) {
            // Propaga la excepción lanzada por el método real
            throw ite.getTargetException();
        } catch (Exception e) {
            // Manejo de excepciones si la invocación falla
            System.err.println("La invocación de " + method.getName() + " falló");
        } finally {
            // Retorna el resultado de la invocación del método real
            return invocationResult;
        }
    }
}
