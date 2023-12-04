package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CoursesWriter extends Thread {
    ArrayList<Course> cursuri = new ArrayList<Course>();
    public CoursesWriter(ArrayList<Course> cursuri)
    {
        this.cursuri.addAll(cursuri);
    }

    @Override
    public void run() {
        try {
            File f = new File("cursuriout.csv");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            try {
                cursuri.add(new Course("Java",
                        "programare",new Professor("Gabriel","Danciu"),new ArrayList<Student>()));
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
