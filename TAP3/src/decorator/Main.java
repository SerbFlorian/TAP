package decorator;

public class Main {
	//ASSIGNACIO POLIMORFICA -> decorator, ja que li estic passant una filla de car

	public static void main(String[] args) {
		
		Car myCar = new Car("Chevrolet",10000);
		Car decorator = new SpoilerDecorator(myCar);
		Car decorator2 = new NitroDecorator(decorator);

		//Let's decorate
	//	myCar=new NitroDecorator(myCar);
	//	myCar=new SpoilerDecorator(myCar);


		//Car myCar = new SpoilerDecorator(new NitroDecorator(new Car("Chevrolet",10000)));

		System.out.println("Description: "+decorator2.getDescription());
		System.out.println("Price: "+decorator2.getPrice()+"�");
	}

}
