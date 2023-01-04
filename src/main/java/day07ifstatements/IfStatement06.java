package day07ifstatements;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("yaşınızı girin: ");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("geçerli bir yaş giriniz");
        } else if (age < 5) {
            System.out.println("bebek");
        } else if (age < 13) {
            System.out.println("çocuk");
        } else if (age < 21) {
            System.out.println("genç");
        } else if (age < 31) {
            System.out.println("yetişkin");
        } else {
            System.out.println("tanımlanmamış yaş");
        }

    }
}
