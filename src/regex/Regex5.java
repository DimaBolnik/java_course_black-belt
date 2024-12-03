package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String string ="12344566789098780325987;" +
                       "09234892357898970921654;" +
                       "32984790002374161122333;";

        Pattern pattern = Pattern.compile(
                "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(string);

//        String nowString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        while (matcher.find()) {
            System.out.println(matcher.group(7));
        }

//        System.out.println(nowString);
    }
}
