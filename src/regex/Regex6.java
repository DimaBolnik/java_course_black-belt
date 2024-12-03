package regex;

import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        String ip1 = "127.0.199.1";
        String ip2 = "127.312.0.2";
        checkIP(ip1);
        checkIP(ip2);

    }

    static void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
                       "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }
}
