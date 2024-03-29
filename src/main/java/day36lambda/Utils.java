package day36lambda;

public class Utils {

    public static int getLengthSquareMethod(String s) {
        return s.length() * s.length();
    }

    public static boolean isLengthEven(String s) {
        return s.length() % 2 == 0;
    }

    public static String getLastChar(String s) {
        return s.substring(s.length() - 1);
    }

    public static void printInTheSameLineWithSpace(Object o) {
        System.out.println(o + " ");
    }

    public static boolean isNumberEven(int x) {
        return x % 2 == 0;
    }

    public static int getSumOfDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }

}
