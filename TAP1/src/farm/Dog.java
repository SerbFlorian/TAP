package farm;

/**
 * Esta clase representa un perro, que es una subclase de `Animal`.
 * Los perros tienen un atributo adicional, `fleas` (pulgas), que no está presente en la clase base `Animal`.
 * Además, sobrescribe el método `talk` para devolver un mensaje específico para los perros, que incluye
 * si tienen pulgas o no.
 *
 * Created by pedro on 9/9/15.
 */
public class Dog extends Animal {

	// Atributo propio de la clase `Dog`, indica si el perro tiene pulgas o no
	private boolean fleas;

	/**
	 * Constructor de la clase `Dog`.
	 * Llama al constructor de la clase base `Animal` para inicializar los atributos de patas y ojos,
	 * y también inicializa el atributo `fleas` para indicar si el perro tiene pulgas.
	 *
	 * @param legs Número de patas del perro.
	 * @param eyes Número de ojos del perro.
	 * @param fleas Un valor booleano que indica si el perro tiene pulgas o no.
	 */
	public Dog(int legs, int eyes, boolean fleas) {
		// Llama al constructor de la clase base `Animal` para inicializar los atributos heredados.
		super(legs, eyes);
		this.fleas = fleas;
	}

	/**
	 * Establece si el perro tiene pulgas o no.
	 *
	 * @param fleas Un valor booleano que indica si el perro tiene pulgas o no.
	 */
	public void setFleas(boolean fleas) {
		this.fleas = fleas;
	}

	/**
	 * Obtiene el valor de si el perro tiene pulgas o no.
	 *
	 * @return Un valor booleano que indica si el perro tiene pulgas o no.
	 */
	public boolean getFleas() {
		return fleas;
	}

	/**
	 * Cambia los atributos del perro. Este método es solo un ejemplo de modificación de atributos
	 * de la clase base `Animal`. Cambia las patas a 4 y los ojos a 5.
	 */
	public void changeFather() {
		// Cambia las patas directamente al valor 4 (también se podría usar setLegs(4))
		this.legs = 3;
		// this.eyes = 2; // Comentado ya que no se puede modificar directamente
		setLegs(4);  // Se usa el setter de la clase base `Animal`
		setEyes(5);  // Se usa el setter de la clase base `Animal`
	}

	/**
	 * Sobrescribe el método `talk` de la clase `Animal` para proporcionar una implementación específica
	 * para el perro. El mensaje incluye si el perro tiene pulgas o no.
	 *
	 * @return Un mensaje que indica si el perro tiene pulgas.
	 */
	@Override
	public String talk() {
		return ("Fleas " + fleas);  // Devuelve si el perro tiene pulgas o no
	}
}
