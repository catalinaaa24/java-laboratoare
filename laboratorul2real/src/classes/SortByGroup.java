package classes;

import java.util.Comparator;

public class SortByGroup implements Comparator<Student> {
    int sign;
    public SortByGroup(int f){
        this.sign = f;
    }
    @Override
    public int compare(Student a, Student b) {
        return (a.groupNumber - b.groupNumber)*sign;
    }
}
