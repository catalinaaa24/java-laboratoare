package classes;

public class Professor {
    String firstName;
    String lastName;

    @Override
    public String toString(){
        return "Proffesor{" + "firstName= " + firstName + ", lastName= " + lastName + '}';
    }

    public Professor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //2.4.1
    public String getFullName(){
        return firstName+ " " + lastName;
    }

}
