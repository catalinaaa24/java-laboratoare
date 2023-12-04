package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentReader extends Thread{
    ArrayList<Student> studenti;

    public StudentReader(){
        this.studenti = new ArrayList<Student>();
    }

    @Override
    public void run() {
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
    }
}
