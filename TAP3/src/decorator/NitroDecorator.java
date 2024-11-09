package decorator;

public class NitroDecorator extends Car{
	// DINAMIC BIDING -> client.getDescription()
	// crido la classe pare, pero com tinc assignada una filla, doncs cridara la filla
	private Car client;

	public NitroDecorator(Car car) {
		super("",0);
		client = car;
	}
	
	public String getDescription() {
		return (client.getDescription()+" with nitrous oxide system");
	}
	
	public float getPrice() {
		return (client.getPrice()+7000);
	}

}
