package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {

        // ekrana 5 kere "Hi" yazdırın.

        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }


        // 11 den 14 e kadar yazdır

        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }


        // 40 den 23 e kadar yazdır

        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // 18 den 56 e kadar yazdır

        for (int i = 18; i < 57; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

    }
}
