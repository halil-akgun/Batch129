package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı girin:");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapılacak işlemi girin. +, -, *, /, % 'den birini seçin:");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a * b / 100));
                break;
            default:
                System.out.println("bu işlem tanımlanmamıştır.");
        }

    }
}
