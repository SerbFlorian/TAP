package visitor;

//Clase concreta que representa un visitante honrado de taxi (HonoredTaxiVisitor)
//Esta clase implementa la interfaz TaxiVisitor y es responsable de realizar acciones sobre los elementos HastyPerson y LeisurelyPerson.
public class HonoredTaxiVisitor implements TaxiVisitor {

	// Este método es llamado cuando el visitante interactúa con una persona apresurada (HastyPerson)
	@Override
	public void visit(HastyPerson e) {
		// Si la persona está muy apresurada, el conductor maneja lo más rápido posible
		if (e.veryHasty()) {
			System.out.println("I drive as fast as I can"); // Mensaje si la persona está muy apresurada
		} else {
			System.out.println("I drive fast"); // Mensaje si la persona no está tan apresurada
		}
	}

	// Este método es llamado cuando el visitante interactúa con una persona relajada (LeisurelyPerson)
	@Override
	public void visit(LeisurelyPerson e) {
		System.out.println("I drive in a natural way"); // El conductor maneja de forma relajada y natural
	}
}
