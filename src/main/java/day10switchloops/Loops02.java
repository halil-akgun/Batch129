package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n***************");

        String city = "istanbul";
        for (int i = 0; i < city.length(); i++) {
            String ch = city.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());
            }
        }

    }
}
