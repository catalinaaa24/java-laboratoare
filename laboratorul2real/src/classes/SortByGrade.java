package classes;

import java.util.Comparator;

public class SortByGrade implements Comparator<Student> {
    int sign;
    public SortByGrade(int f){
        this.sign = f;
    }
    @Override
    public int compare(Student a, Student b) {
        return (a.grade - b.grade)*sign;
    }
}