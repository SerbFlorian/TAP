package dynamicproxy;

import java.lang.reflect.*;

/**
 * Implementación de un {@link InvocationHandler} para gestionar las invocaciones de métodos
 * en un proxy dinámico.
 * <p>
 * Esta clase intercepta las invocaciones de métodos en un proxy dinámico y delega la ejecución
 * de métodos no sobrescritos a un objeto real, en este caso {@code testImpl}. También proporciona
 * implementaciones personalizadas para los métodos {@code equals}, {@code hashCode} y {@code toString}.
 * </p>
 */
public class TestInvocationHandler implements InvocationHandler {
    // El objeto real al que se delegan las invocaciones de método
    private Object testImpl;

    /**
     * Constructor que asigna el objeto real al que se delegarán las invocaciones.
     *
     * @param impl El objeto real que implementa los métodos de la interfaz.
     */
    public TestInvocationHandler(Object impl) {
        this.testImpl = impl;
    }

    /**
     * Método sobrescrito de {@link InvocationHandler} que maneja la invocación de métodos en el proxy.
     * Intercepta las invocaciones de los métodos {@code equals}, {@code hashCode} y {@code toString}
     * para que el proxy gestione estos métodos de forma especial.
     * Si el método invocado no es uno de estos tres, se delega la invocación al objeto real.
     *
     * @param proxy  El proxy que invoca el método.
     * @param method El método invocado.
     * @param args   Los argumentos del método.
     * @return El resultado de la invocación del método.
     * @throws Throwable Si se produce alguna excepción durante la invocación.
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Si el método pertenece a la clase Object (equals, hashCode, toString)
        if (Object.class == method.getDeclaringClass()) {
            String name = method.getName();

            // Si el método es equals, se compara la referencia de los objetos
            if ("equals".equals(name)) {
                return proxy == args[0];
            }
            // Si el método es hashCode, se devuelve el código de identidad del proxy
            else if ("hashCode".equals(name)) {
                return System.identityHashCode(proxy);
            }
            // Si el método es toString, se devuelve una descripción del proxy
            else if ("toString".equals(name)) {
                return proxy.getClass().getName() + "@" +
                        Integer.toHexString(System.identityHashCode(proxy)) +
                        ", with InvocationHandler " + this;
            }
            // Si se llama a otro método de Object no manejado, se lanza una excepción
            else {
                throw new IllegalStateException(String.valueOf(method));
            }
        }
        // Si no es uno de los métodos especiales de Object, se delega la invocación al objeto real
        return method.invoke(testImpl, args);
    }
}
