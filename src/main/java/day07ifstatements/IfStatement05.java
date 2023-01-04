package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("ay ismi girin: ");
        String mounthName = input.next();

        if (mounthName.equalsIgnoreCase("january")) {
            System.out.println(1);
        } else if (mounthName.equalsIgnoreCase("february")) {
            System.out.println(2);
        } else if (mounthName.equalsIgnoreCase("march")) {
            System.out.println(3);
        } else if (mounthName.equalsIgnoreCase("april")) {
            System.out.println(4);
        } else if (mounthName.equalsIgnoreCase("may")) {
            System.out.println(5);
        } else if (mounthName.equalsIgnoreCase("june")) {
            System.out.println(6);
        } else if (mounthName.equalsIgnoreCase("july")) {
            System.out.println(7);
        } else if (mounthName.equalsIgnoreCase("august")) {
            System.out.println(8);
        } else if (mounthName.equalsIgnoreCase("september")) {
            System.out.println(9);
        } else if (mounthName.equalsIgnoreCase("october")) {
            System.out.println(10);
        } else if (mounthName.equalsIgnoreCase("november")) {
            System.out.println(11);
        } else if (mounthName.equalsIgnoreCase("december")) {
            System.out.println(12);
        } else {
            System.out.println("invalid month name");
        }

    }
}
