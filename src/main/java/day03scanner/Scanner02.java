package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("İsminiz: ");
        String firstName = input.nextLine();
        System.out.print("Soyisminiz: ");
        String lastName = input.nextLine();

        System.out.println(firstName + " " + lastName);
    }
}
