package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {
    public static void main(String[] args) {

        // Hipotenüs hesaplayan bir kod yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("1. dikkenar uzunluğunu girin: ");
        double a = input.nextDouble();
        System.out.println("2. dikkenar uzunluğunu girin: ");
        double b = input.nextDouble();

        double c = Math.sqrt(a * a + b * b);

        System.out.println("hipotenüs: " + c);


    }
}
