package day36lambda;

public class Utils {

    public static int getLengthSquareMethod(String s) {
        return s.length() * s.length();
    }

    public static boolean isEven(String s) {
        return s.length() % 2 == 0;
    }

    public static String getLastChar(String s) {
        return s.substring(s.length() - 1);
    }

    public static void printInTheSameLineWithSpace(Object o) {
        System.out.println(o + " ");
    }

}
