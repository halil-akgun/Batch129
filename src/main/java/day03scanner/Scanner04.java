package day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ilk sayı: ");
        int a = input.nextInt();
        System.out.println("ikinci sayı: ");
        int b = input.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);

    }
}
