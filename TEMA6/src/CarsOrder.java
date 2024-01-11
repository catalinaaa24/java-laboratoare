import java.util.Comparator;

public class CarsOrder implements Comparator<Car> {



    @Override
    public int compare(Car o1, Car o2) {
        return (o1.odometer_value-o2.odometer_value);
    }
}
