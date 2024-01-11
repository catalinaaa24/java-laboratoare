import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarsReader cr = new CarsReader();
//        cr.cars
        for(Car c: cr.cars){
            System.out.println(c);
        }
        cr.cars.sort(new CarsOrder());
        ArrayList<Car> psalm = new ArrayList<Car>(cr.cars);

        for(Car c: psalm){
            System.out.println(c);
        }
    }
}