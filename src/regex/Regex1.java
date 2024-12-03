package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                   "email: vasiliy@gmail.com, Postcode: AA99, Phone number: +123456789;" +
                   "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18, " +
                   "email: masha@mail.ru, Postcode: ukr54, Phone number: +987654321;" +
                   "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                   "email: chuck@yandex.ru, Postcode: usa23, Phone number: +777444111;";

//        Pattern pattern = Pattern.compile("\\b\\d{9}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");




        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println("Position: "+matcher.start() + "  " + matcher.end());
            System.out.println("=====================================");
        }
    }

}
