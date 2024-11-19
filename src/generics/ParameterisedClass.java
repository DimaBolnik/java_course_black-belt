package generics;

public class ParameterisedClass {

    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello World");
//        System.out.println(info1);
//        String s = info1.getValue();


//        Info<Integer> info2 = new Info<>(123);
//        System.out.println(info2);
//        Integer i = info2.getValue();
//
//        Info<Double> info4 = new Info<>(123.4);
//        System.out.println(info4);
//        Double i4 = info4.getValue();

//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus bus = info3.getValue();

    }

}


class Info<T extends Number & I1 & I2> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
               "value=" + value +
               '}';
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}

//class Parent {
//
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}

//class Child extends Parent {
//
//    public void abc(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
//}

class Bus {

}
