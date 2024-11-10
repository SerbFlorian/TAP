package visitor;

//Clase concreta que representa a una persona relajada (LeisurelyPerson)
//Esta clase implementa la interfaz Person y es un "Element" que puede ser visitado por un visitante (TaxiVisitor).
public class LeisurelyPerson implements Person {

	private int smile; // El tamaño de su sonrisa, se usa para determinar si es una sonrisa grande o pequeña

	// Constructor de la clase LeisurelyPerson
	// Recibe un valor que representa el tamaño de la sonrisa de la persona
	public LeisurelyPerson(int smile) {
		super();
		this.smile = smile; // Asigna el valor de la sonrisa
	}

	// Método que permite que el visitante (TaxiVisitor) visite a este objeto
	@Override
	public void accept(TaxiVisitor v) {
		v.visit(this);  // Se le pasa el visitante a esta persona
	}

	// Método que verifica si la sonrisa es grande o no
	public boolean bigSmile() {
		return (smile > 5); // Si la sonrisa es mayor a 5, se considera una sonrisa grande
	}
}
