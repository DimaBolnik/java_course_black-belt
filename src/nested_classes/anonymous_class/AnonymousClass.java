package nested_classes.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(1, 2));
        Math m2 = (a, b) -> a*b;
        System.out.println(m2.doOperation(5, 3));
    }
}

interface Math {
    int doOperation(int a, int b);
}
