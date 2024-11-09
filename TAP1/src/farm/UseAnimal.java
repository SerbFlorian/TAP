package farm;

/**
 * Esta clase `UseAnimal` contiene el método `main`, que sirve como punto de entrada
 * para ejecutar el código y demuestra cómo interactúan las clases relacionadas con `Animal`.
 *
 * En este ejemplo se crean instancias de las clases `Animal`, `Dog`, `Cat`, `Parrot`,
 * y `MutantParrot`, y se llama al método `talk` de cada una de ellas para ver los diferentes comportamientos.
 * También se demuestra la posibilidad de hacer asignación de objetos a variables de tipo `Animal`
 * gracias a la herencia.
 *
 * Created by pedro on 9/9/15.
 */
public class UseAnimal {

	/**
	 * El método principal que ejecuta el código. Crea instancias de las diferentes clases
	 * derivadas de `Animal` y muestra sus salidas mediante el método `talk`.
	 *
	 * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
	 */
	public static void main(String[] args) {
		// Creación de objetos de tipo Animal, Dog, Cat, Parrot y MutantParrot
		Animal a = new Animal(3, 3);
		Dog p = new Dog(1, 1, true);
		Cat g = new Cat(1, 2);
		Parrot l = new Parrot(1, 2);
		MutantParrot lM = new MutantParrot(3, 3);

		// Imprime los mensajes devueltos por el método talk de cada clase
		System.out.println("ANIMAL: " + a.talk());
		System.out.println("DOG: " + p.talk());
		System.out.println("CAT: " + g.talk());
		System.out.println("PARROT: " + l.talk());
		System.out.println("MUTANT PARROT:" + lM.talk());

		// a apuntara a la misma direccion de memoria que p
		a = p;  // Ahora a se refiere a un objeto de tipo Dog
		System.out.println("ANIMAL: " + a.talk());
		// y como se inicializa como que SI que tiene pulgas, pues se imprime el mensaje de que tiene pulgas

		// a apuntara a la misma direccion de memoria que lM
		a = lM;  // Ahora a se refiere a un objeto de tipo MutantParrot
		System.out.println("ANIMAL: " + a.talk());
	}
}
