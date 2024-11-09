package observer;

/**
 * Created by pedro on 10/7/16.
 */
public class Test {
    // ASSIGNACIO POLIMORFICA -> .attach(), me passen algun que implementa el contracte
    // on espero el contracte i em passen una FILLA o algu que COMPLETI EL CONTRACTE
    // assignacio polimorfica en pas de parametre



    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.attach(new HexaObserver());
        subject.attach(new OctalObserver());
        subject.attach(new BinaryObserver());


        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
