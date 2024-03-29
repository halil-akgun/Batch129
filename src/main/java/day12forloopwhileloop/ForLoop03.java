package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {

        /*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */

        Scanner input = new Scanner(System.in);

        System.out.print("satır sayısı: ");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int k = row; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ekstra
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
