package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car : {" +
               "color='" + color + '\'' +
               ", doorCount=" + doorCount +
               ", engine=" + engine +
               '}';
    }

    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine : {" +
                   "horsePower=" + horsePower +
                   '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
//        Car car = new Car("red", 4, 300);
        Car car = new Car("red", 4);
        Car.Engine engine = car.new Engine(150);
        System.out.println(engine);
        car.setEngine(engine);


        System.out.println(car);
    }
}