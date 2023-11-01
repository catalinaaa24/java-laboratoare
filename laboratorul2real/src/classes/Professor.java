package classes;

public class Professor extends Person{

    @Override
    public String toString(){
        return "Professor{" + "firstName= " + firstName + ", lastName= " + lastName + '}';
    }

    public Professor() {
        this.firstName = "";
        this.lastName = "";
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
