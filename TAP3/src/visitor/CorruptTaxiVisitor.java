package visitor;

/**
 * Esta clase implementa el comportamiento de un visitante que representa a un taxista corrupto.
 * El taxista corrupto cambia su forma de conducir dependiendo de la persona que suba al taxi
 * y sus características (apresurada o tranquila). La clase implementa la interfaz TaxiVisitor
 * y proporciona la lógica personalizada para visitar a un HastyPerson (persona apresurada) y
 * un LeisurelyPerson (persona tranquila).
 */
public class CorruptTaxiVisitor implements TaxiVisitor {

	/**
	 * Este método implementa el comportamiento del taxista corrupto cuando visita a una persona apresurada.
	 * Si la persona está muy apresurada (mira el reloj con frecuencia), el taxista conduce lentamente,
	 * pero con una actitud relajada, haciendo ruidos con el coche (representado por "Clink clink clink...").
	 * Si la persona no está tan apresurada, el taxista conduce aún más lentamente.
	 *
	 * @param e La persona apresurada que sube al taxi.
	 */
	@Override
	public void visit(HastyPerson e) {
		if (e.veryHasty()) {
			System.out.println("I drive slowly. Clink clink clink...");  // Conduce lentamente si la persona está apresurada.
		} else {
			System.out.println("I drive very slowly. Clink clink clink...");  // Conduce aún más lentamente si no está apresurada.
		}
	}

	/**
	 * Este método implementa el comportamiento del taxista corrupto cuando visita a una persona tranquila.
	 * Si la persona tiene una gran sonrisa, el taxista aún conduce lentamente, haciendo ruidos relajados
	 * como "Clink clink clink...". Si no tiene una gran sonrisa, el taxista conduce muy lentamente.
	 *
	 * @param e La persona tranquila que sube al taxi.
	 */
	@Override
	public void visit(LeisurelyPerson e) {
		if (e.bigSmile()) {
			System.out.println("I drive as slowly as I can. Clink clink clink...");  // Conduce muy lentamente si la persona sonríe mucho.
		} else {
			System.out.println("I drive very slowly. Clink clink clink...");  // Conduce muy lentamente si la persona no sonríe tanto.
		}
	}
}
