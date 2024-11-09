package defaultmethods;

/**
 * Created by pedro on 26/10/14.
 */
interface ICorrupt {
    default void blackCard() {
        System.out.println("spending money ...");
    }

    static void spendLikeCrazy() {
        System.out.println("Restaurants, parties, vacations, ...");
    }
}
