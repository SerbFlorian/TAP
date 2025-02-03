package functional;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una persona con atributos básicos como nombre, apellido, edad, género, email, teléfono y dirección.
 * También proporciona un método estático para generar una lista de ejemplo con varias personas.
 */
public class Person {
    private String givenName;  // Nombre de la persona
    private String surName;    // Apellido de la persona
    private int age;           // Edad de la persona
    private Gender gender;     // Género de la persona
    private String eMail;      // Dirección de correo electrónico
    private String phone;      // Número de teléfono
    private String address;    // Dirección física

    /**
     * Constructor para inicializar un objeto de tipo Person.
     *
     * @param givenName el nombre de la persona
     * @param surName   el apellido de la persona
     * @param age       la edad de la persona
     * @param gender    el género de la persona
     * @param eMail     el correo electrónico de la persona
     * @param phone     el número de teléfono de la persona
     * @param address   la dirección física de la persona
     */
    public Person(String givenName, String surName, int age, Gender gender, String eMail, String phone, String address) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Método estático que crea y retorna una lista de personas de ejemplo.
     *
     * @return una lista de objetos {@code Person} con información de ejemplo
     */
    public static List<Person> createShortList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Bob", "Baker", 2, Gender.MALE,
                "bob.baker@example.com", "201-121-4678", "44 4th St, Smallville, KS 12333"));

        people.add(new Person("Jane", "Doe", 25, Gender.FEMALE,
                "jane.doe@example.com", "202-123-4678", "33 3rd St, Smallville, KS 12333"));

        people.add(new Person("John", "Doe", 25, Gender.MALE,
                "john.doe@example.com", "202-123-4678", "33 3rd St, Smallville, KS 12333"));

        people.add(new Person("James", "Johnson", 45, Gender.MALE,
                "james.johnson@example.com", "333-456-1233", "201 2nd St, New York, NY 12111"));

        people.add(new Person("Joe", "Bailey", 67, Gender.FEMALE,
                "joebob.bailey@example.com", "112-111-1111", "111 1st St, Town, CA 11111"));

        people.add(new Person("Phil", "Smith", 55, Gender.MALE,
                "phil.smith@example.com", "222-33-1234", "22 2nd St, New Park, CO 222333"));

        return people;
    }

    /**
     * Método que devuelve una representación en cadena del objeto Person.
     *
     * @return una cadena que representa los detalles básicos de la persona
     */
    @Override
    public String toString() {
        return "Person{" +
                "givenName='" + givenName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    /**
     * Obtiene el género de la persona.
     *
     * @return el género de la persona
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return el apellido de la persona
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Imprime el nombre completo de la persona en consola.
     */
    public void printName() {
        System.out.println("Name: " + givenName + " " + surName);
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return la edad de la persona
     */
    public int getAge() {
        return age;
    }
}
