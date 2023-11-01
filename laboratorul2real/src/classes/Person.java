package classes;

public abstract class Person {
    String firstName;
    String lastName;



    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", surname='" + lastName + '\'' +
                '}';
    }
}
