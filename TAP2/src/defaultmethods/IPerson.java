package defaultmethods;

/**
 * Created by pedro on 26/10/14.
 */
interface IPerson {
    void sayHello();

    default void blackCard() {
        System.out.println("I have a black card");
    }
}
