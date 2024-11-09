package iterator;

/**
 * http://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
 */
public class IteratorPatternDemo {
    // CONTRACTE -> Iterator
    // ASSIGNACIO POLIMORFICA -> iter = namesRepository.getIterator()
    // DINAMIC BIDING -> iter.next();
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
