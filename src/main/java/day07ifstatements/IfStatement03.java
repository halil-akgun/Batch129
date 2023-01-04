package day07ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı girin: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("pozitif");
        } else if (num < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("nötr");
        }

    }
}
