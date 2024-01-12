import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CarsReader cr = new CarsReader();
        cr.start();
        cr.join();
        Thread t2 = new Thread( new CarsReader2() );
        t2.start();
        t2.join();

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