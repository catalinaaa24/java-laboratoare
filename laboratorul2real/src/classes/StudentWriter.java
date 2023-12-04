package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentWriter extends Thread {
    ArrayList<Student> studenti = new ArrayList<Student>();
    public StudentWriter(ArrayList<Student> studenti){
        this.studenti.addAll(studenti);
    }

    @Override
    public void run() {
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
    }
}
