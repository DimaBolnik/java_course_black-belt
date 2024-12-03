package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1= "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

//        String s1= "ABDOFABCOFAB%OF";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OF");

//        String s1= "abc4 abcf abch65acvg2F";
//        Pattern pattern1 = Pattern.compile("abc[^e-g0-8]");

//        String s1= "abc4 abcf abch65acvg2F";
//        Pattern pattern1 = Pattern.compile("abc(4 |h6)");

//        String s1= "abc4 abc@ abch65acvg2F";
//        Pattern pattern1 = Pattern.compile("abc.");

//        String s1= "abc4 abc@ abch65acvg2F";
//        Pattern pattern1 = Pattern.compile("^abc");

//        String s1= "ab\\/c4 abc@ abc_h6ghjk5acvg2F";
//        Pattern pattern1 = Pattern.compile("\\S");

//        String s1= "ab\\/c4 abc@ abc_=h6gh jk5ac**vg2F";
//        Pattern pattern1 = Pattern.compile("\\W+");

//        String s1= "poka abc Zaur dom kino";
//        Pattern pattern1 = Pattern.compile("\\w{4}");
//        String s1= "po\nka abc Zaur    dom     kino";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");//
//        String s1= "poka abc Zaur dom7 5kino";
//        Pattern pattern1 = Pattern.compile("\\D{2,}");
//        String s1= "ABCABDBACBABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2}");
//        String s1= "DABABDBACBABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB){2}");

//        String s1= "DABABDBACBABABDAB";
//        Pattern pattern1 = Pattern.compile("D(AB)*");
//        String s1= "poka abc Zaur dom7 5kino";
//        Pattern pattern1 = Pattern.compile("\\Apoka");
//        String s1= "poka abc Zaur dom7 5kino";
//        Pattern pattern1 = Pattern.compile("ino\\Z");
        String s1= "poka abc Zaur dom7 5kino";
        Pattern pattern1 = Pattern.compile("\\A(poka).*(kino)\\Z");










        Matcher matcher1 = pattern1.matcher(s1);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
            System.out.println("Position: "+matcher1.start() + "  " + matcher1.end());
            System.out.println("=====================================");
        }
    }
}
