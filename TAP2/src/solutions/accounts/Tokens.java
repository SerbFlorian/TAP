package solutions.accounts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Clase `Tokens` que lee información de cuentas desde un archivo y realiza operaciones
 * sobre las cuentas utilizando Streams. Las operaciones incluyen un mapeo para incrementar saldo,
 * un filtrado de cuentas por tipo y la obtención de la cuenta con el saldo más alto.
 */
public class Tokens {
    /*
     * CONCEPTOS TEORIA:
     * - CONTRACTE = Account -> ya que es la clase PARE (superclase)
     * - Asignación POLIMÓRFICA = no hay classes que hereden de la clase Account(Pare)
     * - ENLAZADO DINÁMICO (DYNAMIC BINDING) = no hay clases que hereden de la clase Account(Pare)
     */
    public static void main(String[] args) throws IOException {
        // Crea un FileReader para leer el archivo "accounts.txt"
        FileReader fis = new FileReader("accounts.txt");
        BufferedReader dis = new BufferedReader(fis);
        String line;

        List<Account> list = new LinkedList<>();  // Lista para almacenar las cuentas leídas del archivo
        // Lee cada línea del archivo y crea objetos Account
        while ((line = dis.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(line, ",");
            while (tokens.hasMoreTokens()) {
                // Crea una cuenta usando los tokens (campos separados por comas en el archivo)
                Account c = new Account(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), Double.parseDouble(tokens.nextToken()));
                list.add(c);  // Añade la cuenta a la lista
            }
        }

        dis.close();  // Cierra el BufferedReader

        // Imprime todas las cuentas de la lista
        for (Account acc : list)
            System.out.println(acc);

        // Ejercicio 1: MAP - Incrementa el saldo de cada cuenta en 100 unidades
        System.out.println("Exercise 1: MAP");
        List<Account> result0 = list.stream().map((Account c) -> {
            c.deposit(100);  // Incrementa el saldo de la cuenta
            return c;
        }).collect(Collectors.toList());
        result0.forEach(System.out::println);

        // Ejercicio 2: FILTER - Filtra las cuentas de tipo "IF"
        System.out.println("Exercise 2: FILTER");
        Stream<Account> result = list.stream().filter(acc -> acc.getType().equals(AccType.IF));
        result.forEach(e -> System.out.println(e));

        // Ejercicio 3: MAX - Encuentra la cuenta de tipo "IF" con el saldo más alto
        System.out.println("Exercise 3: MAX");
        Stream<Account> result1 = list.stream().filter(acc -> acc.getType().equals(AccType.IF));
        Account resultacc = result1.max((e1, e2) -> Double.compare(e1.getBalance(), e2.getBalance())).get();
        System.out.println(resultacc);
    }
}
