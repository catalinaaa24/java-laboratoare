import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CarsReader2 implements Runnable {
    ArrayList<Car> cars = new ArrayList<Car>();

    public CarsReader2() {

    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public void run() {
        try {
            File f = new File("cars.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            if (line!=null)
                line = br.readLine();
            while(line != null){
                String tokens[] = line.split(",");
                Car c = new Car(tokens[0], tokens[1], tokens[2], tokens[3],Integer.parseInt(tokens[4].trim()) );
                cars.add(c);
                line = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
