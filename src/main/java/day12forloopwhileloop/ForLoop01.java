package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
        */

        Scanner input = new Scanner(System.in);

        System.out.print("satır sayısı: ");
        int row = input.nextInt();
        System.out.print("sütün sayısı: ");
        int colum = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= colum; k++) {
                System.out.print("X ");
            }
            System.out.println();
        }

    }
}
