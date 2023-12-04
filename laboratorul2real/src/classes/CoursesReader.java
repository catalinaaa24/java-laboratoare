package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CoursesReader extends Thread{
    ArrayList<Course> cursuri = new ArrayList<Course>();

    @Override
    public void run() {
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
                        new ArrayList<Student>()
                );
                cursuri.add(s);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

