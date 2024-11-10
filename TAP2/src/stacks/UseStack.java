package stacks;

/**
 * Clase que demuestra el uso de las pilas (Stacks) y cómo se pueden implementar
 * utilizando diferentes estructuras de datos como ArrayStack y VectorStack.
 * La clase muestra cómo utilizar el polimorfismo, el enlace dinámico (dynamic binding)
 * y la herencia.
 */
/**
 * Conceptos:
 * - **Contrato:** Se hace referencia a la interfaz `Stack<T>`, que define
 *   un contrato para las implementaciones de pilas.
 * - **Asignación Polimórfica:** En las líneas 31 y 43, al crear nuevas instancias de `ArrayStack`
 *   y `VectorStack`, se está pasando una subclase, demostrando el polimorfismo.
 * - **Enlace Dinámico (Dynamic Binding):** En `.push, .pop, .full, .empty` se invoca dinámicamente.
 */

public class UseStack {
	// 1. ArrayStack tiene una capacidad FIJA para el tamaño del arreglo, que se le pasa por el constructor
	// 1. VectorStack tiene una capacidad MAXIMA definida, que se le pasa por el constructor
	// 2. ArrayStack la capacidad es FIJA y *NO* puede cambiarse despues de la creacion
	// 2. VectorStack puede *CREARSE DINAMICAMENTE*, pero la capacidad MAXIMA esta *LIMITADA* por MAX
	// 3. ArrayStack implementa la interfaz Iterator<T> y proporciona sus propios metodos next() y hasNext()
	// 3. VectorStack utiliza un iterator proporcianado por el Vector interno
	public static void main(String[] args) {

		// Declaración de la pila como una referencia de tipo Stack<Integer>.
		Stack<Integer> pila;

		// Inicialización de la pila utilizando ArrayStack con un arreglo de enteros de tamaño 5.
		Integer lista[] = new Integer[5];
		pila = new ArrayStack<Integer>(lista);  // Creación de una pila de tipo ArrayStack.

		// Insertar algunos elementos en la pila.
		pila.push(3000);
		pila.push(7000);
		pila.push(9000);

		// Mostrar los elementos de la pila utilizando el iterador.
		for (Integer i : pila)
			System.out.println(i);

		// Crear una nueva instancia de VectorStack con capacidad máxima de 10.
		pila = new VectorStack<Integer>(10);
		pila.push(3);
		pila.push(7);
		pila.push(9);

		// Mostrar los elementos de la nueva pila utilizando el iterador.
		for (Integer i : pila)
			System.out.println(i);

		// Llamada al método test para añadir más elementos a la pila y luego eliminarlos.
		test(pila);
	}

	/**
	 * Método que agrega elementos a la pila hasta que esté llena y luego los elimina
	 * uno por uno, mostrando cada elemento eliminado.
	 *
	 * @param p Pila de tipo Stack<Integer> a la que se le agregarán y eliminarán elementos.
	 */
	public static void test(Stack<Integer> p){
		int i = 0;

		// Añadir elementos a la pila hasta que esté llena.
		while (!p.full()) {
			p.push(10 * i);  // Se inserta un múltiplo de 10.
			i++;
		}

		// Eliminar y mostrar los elementos de la pila.
		// primero se vacia toda la pila y luego se muestra
		while (!p.empty()) {
			System.out.println(p.pop());  // Elimina y muestra el elemento superior de la pila.
		}
	}

	/**
	 * Método genérico que elimina todos los elementos de la pila pasada como parámetro
	 * y los muestra.
	 *
	 * @param <T> Tipo genérico para la pila.
	 * @param p Pila de tipo Stack<T> a la que se le eliminarán los elementos.
	 */
	public static <T> void test2(Stack<T> p){

		// Eliminar y mostrar los elementos de la pila hasta que esté vacía.
		while (!p.empty()) {
			System.out.println(p.pop());  // Elimina y muestra el elemento superior de la pila.
		}
	}
}
