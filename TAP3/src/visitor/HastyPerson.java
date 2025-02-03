package visitor;

//Clase concreta que representa a una persona apresurada (HastyPerson)
//Esta clase implementa la interfaz Person, lo que permite que sea visitada por un TaxiVisitor.
public class HastyPerson implements Person {

    private int clockFrequency; // Frecuencia con la que la persona mira su reloj (cómo de apresurada está)

    // Constructor que inicializa la frecuencia con la que la persona mira su reloj.
    public HastyPerson(int clockFrequency) {
        super();
        this.clockFrequency = clockFrequency;
    }

    // Método que permite a esta persona ser visitada por un visitante (TaxiVisitor)
    @Override
    public void accept(TaxiVisitor v) {
        v.visit(this); // El visitante actúa sobre esta persona
    }

    // Método que determina si la persona está muy apresurada, basado en la frecuencia con que mira el reloj
    public boolean veryHasty() {
        return (clockFrequency > 4); // Si la frecuencia es mayor a 4, la persona está muy apresurada
    }

}
