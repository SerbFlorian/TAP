package proxy;

/**
 * http://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
 */
public class Main {
    // ASSIGNACIO POLIMORFICA -> new ProxyImage(), ja que es on espero la classe pare i li assigno la filla
    // DINAMIC BIDING -> .display(), ja que crida el de image i me permet fer POLIMORFISME D'HERENCIA
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }

}
