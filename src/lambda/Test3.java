package lambda;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class Test3 {

    public static void main(String[] args) {
        ArrayList<Car> treeCars = createTreeCars(() -> new Car("Reno",
                "read", 150d));
        System.out.println(treeCars);

        changeCar(treeCars.get(0), car -> {
            car.color = "Black";
            car.engine = 200;
            System.out.println(car);
        });
    }

    public static ArrayList<Car> createTreeCars(Supplier<Car> supplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }


}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", engine=" + engine +
               '}';
    }
}
