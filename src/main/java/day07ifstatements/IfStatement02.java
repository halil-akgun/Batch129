package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı girin: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("çift sayı");
        } else {
            System.out.println("tek sayı");
        }

    }
}
