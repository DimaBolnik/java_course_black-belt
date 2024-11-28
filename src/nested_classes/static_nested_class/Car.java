package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
               "color='" + color + '\'' +
               ", doorCount=" + doorCount +
               ", engine=" + engine +
               '}';
    }

    public static class Engine {
        int horsePower;
        static int count = 0;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            count++;
//            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                   "horsePower=" + horsePower +
                   '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e);

        Car c = new Car("red", 2, e);
        System.out.println(c);
    }
}
