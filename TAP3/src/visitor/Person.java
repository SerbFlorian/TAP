package visitor;

/**
 * Interfaz que define el contrato para los objetos que pueden ser visitados por un visitante
 * (Visitor) en el contexto del patrón **Visitor**. En este caso, los objetos que implementen
 * esta interfaz representan personas, y pueden aceptar un visitante que ejecute una operación
 * específica sobre ellos.
 *
 * El patrón **Visitor** permite que se agreguen nuevas operaciones a objetos sin modificar su
 * clase, proporcionando una forma de extender su comportamiento sin cambiar el código de
 * las clases visitadas.
 */
interface Person {
	/**
	 * Método que acepta un visitante (TaxiVisitor) que realizará una operación sobre el objeto
	 * de tipo `Person`. Este método es llamado para que el visitante ejecute su acción específica
	 * sobre la persona que lo invoca.
	 *
	 * @param v El visitante que realizará la operación sobre esta persona.
	 */
	void accept(TaxiVisitor v);
}
