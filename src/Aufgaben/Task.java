package Aufgaben;

public class Task {
    public static void main(String[] args) {
        String[] arr = {"fldfdfower","fldfdfow","fldfdfight"};

        String prefix= longestCommonPrefix(arr);
        System.out.println(prefix);

    }


    static String longestCommonPrefix(String[] strs) {
        String shortestStr = strs[0];
        for (String str : strs) {
            if (str.length() < shortestStr.length()) {
                shortestStr = str;
            }
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < shortestStr.length(); i++) {
            char ch = shortestStr.charAt(i);
            boolean allMatch = true;

            for (String other : strs) {
                if (other.charAt(i) != ch) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                prefix.append(ch);
            } else {
                break;
            }
        }
        return prefix.toString();
    }
}
