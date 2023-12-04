package classes;

import java.io.*;
import java.util.ArrayList;

public class Classes {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Student> students = new ArrayList<Student>(0);

        students.add(new Student("Andrei", "Negoita", 22231, 9));
        students.add(new Student("Ion", "Mateescu", 4221, 8));

        Professor prof = new Professor("Anton", "Panaitescu");

        Course course = new Course("Material Resistance", "Calculations of reactions , \n"
                + "effort diagrams, calculations of geometric ccharacteristics of \n +" +
                "flat surfaces and calculations of resistance elements to simple stresses\n", prof, students);
        CourseManager courseManager = new CourseManager();
        courseManager.AddCourse(course);

        courseManager.displayCoursesToConsole();

        courseManager.courses.get(0).students.sort(new SortByGroup(-1));
        courseManager.courses.get(0).students.sort(new SortByGrade(-1));

        courseManager.displayCoursesToConsole();

        StudentReader sr = new StudentReader();
        sr.start();
        sr.join();

        ArrayList<Student> studenti = new ArrayList<Student>(sr.studenti);
//        studenti.addAll(sr.studenti);

        System.out.println(studenti);

        CoursesReader cr = new CoursesReader();
        cr.start();
        cr.join();

        ArrayList<Course> cursuri = new ArrayList<Course>(cr.cursuri);


        System.out.println(cursuri);

        StudentWriter sw = new StudentWriter(studenti);
        CoursesWriter cw = new CoursesWriter(cursuri);

        Thread t1 = new Thread(new Sum(0,500));
        Thread t2 = new Thread(new Sum(500,1001));

        t1.start();
        t2.start();
        t1.join();
        t2.join();


        System.out.println(t1.sum+t2.sum);

    }

}