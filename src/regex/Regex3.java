package regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                   "email: vasiliy@gmail.com, Postcode: AA99, Phone number: +123456789;" +
                   "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18, " +
                   "email: masha@mail.ru, Postcode: ukr54, Phone number: +987654321;" +
                   "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                   "email: chuck@yandex.ru, Postcode: usa23, Phone number: +777444111;";

        String s2 = "chuck@yandex.ru";

        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] split = s.split(" ");

        Arrays.stream(split).forEach(System.out::println);

    }
}
