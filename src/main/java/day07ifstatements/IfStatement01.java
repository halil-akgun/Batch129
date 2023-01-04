package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("bir character girin: ");
        char ch = input.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("BÜYÜK HARF");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("küçük harf");
        } else {
            System.out.println("harf değil");
        }


    }
}
