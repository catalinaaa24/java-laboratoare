package classes;

import java.util.ArrayList;

public class Classes {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>(0);

        students.add(new Student("Andrei", "Negoita",22231, 9));
        students.add(new Student("Ion","Mateescu",4221, 8));

        Professor prof = new Professor("Anton","Panaitescu");

        Course course = new Course("Material Resistance", "Calculations of reactions , \n"
                + "effort diagrams, calculations of geometric ccharacteristics of \n +" +
                "flat surfaces and calculations of resistance elements to simple stresses\n", prof, students);
        CourseManager courseManager = new CourseManager();
        courseManager.AddCourse(course);

        courseManager.displayCoursesToConsole();

        courseManager.courses.get(0).students.sort(new SortByGroup(-1));
        courseManager.courses.get(0).students.sort(new SortByGrade(-1));

        courseManager.displayCoursesToConsole();

    }
}
