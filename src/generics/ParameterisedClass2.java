package generics;

public class ParameterisedClass2 {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println(pair);

        Pair<Integer, Double> pair2 = new Pair<>(13, 4.2);
        System.out.println(pair2);

        OtherPair<String> otherPair= new OtherPair<>("Hello", "World");
        System.out.println(otherPair);
    }
}


class Pair<V1, V2> {
    public V1 first;
    public V2 second;
    public Pair(V1 first, V2 second) {
        this.first = first;
        this.second = second;
    }

    public V1 getFirst() {
        return first;
    }

    public V2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
               "first=" + first +
               ", second=" + second +
               '}';
    }
}

class OtherPair<V> {
    public V first;
    public V second;
    public OtherPair(V first, V second) {
        this.first = first;
        this.second = second;
    }

    public V getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
               "first=" + first +
               ", second=" + second +
               '}';
    }
}