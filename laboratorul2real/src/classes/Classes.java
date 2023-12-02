package classes;

import java.io.*;
import java.util.ArrayList;

public class Classes {
    public static void main(String[] args) {
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


        ArrayList<Student> studenti = new ArrayList<Student>();
        try {
            File f = new File("studenti.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            if (line != null) {
                line = br.readLine();
            }
            while (line != null) {
                String[] tokens = line.split(",");
                Student s = new Student(
                        tokens[0],
                        tokens[1].trim(),
                        Integer.parseInt(tokens[2].trim()),
                        Integer.parseInt(tokens[3].trim())
                );
                studenti.add(s);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(studenti);

        ArrayList<Course> cursuri = new ArrayList<Course>();
        try {
            File f = new File("cursuri.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            if (line != null) {
                line = br.readLine();
            }
            while (line != null) {
                String[] tokens = line.split(",");
                Course s = new Course(
                        tokens[0],
                        tokens[1],
                        new Professor(tokens[2].split(" ")[0],
                                tokens[2].split(" ")[1]),
                        studenti
                );
                cursuri.add(s);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(cursuri);

        try {
            File f = new File("studentiout.csv");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            try {
                studenti.add(new Student("Ionescu",
                        "Dan", 4623, 6));
                bw.write("name, surname, group, grade\r\n");

                for (Student stud : studenti) {
                    bw.write(stud.firstName
                            + "," + stud.lastName
                            + "," + stud.groupNumber
                            + "," + stud.grade+"\r\n");
                }
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                bw.close();
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            File f = new File("cursuriout.csv");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            try {
                cursuri.add(new Course("Java",
                        "programare",new Professor("Gabriel","Danciu"),studenti));
                bw.write("name, description,teacher\r\n");

                for (Course stud : cursuri) {
                    bw.write(stud.name
                            + "," + stud.description
                            + "," + stud.teacher.firstName+ " " +stud.teacher.lastName+"\r\n");
                }
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                bw.close();
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}