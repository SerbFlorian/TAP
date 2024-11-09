package visitor2;

/**
 * Created by milax on 14/10/16.
 */
//2. Assignacio POLIMORFICA= computer
//3. DINAMIC BINDING = linea 12

public class Test {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
