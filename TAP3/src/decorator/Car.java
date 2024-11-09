package decorator;

//An instance of this class will be decorated
public class Car {
	// CONTRACTE -> Car es SEMPRE el PARE, del qual extendeixen els demes


	private String description;
	private float price;
	
	public Car(String description, float price) {
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public float getPrice() {
		return price;
	}
		
}