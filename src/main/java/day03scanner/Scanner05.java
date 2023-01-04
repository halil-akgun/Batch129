package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("dikdörtgenin kısa kenarı: ");
        float shortSide = input.nextFloat();
        System.out.print("dikdörtgenin uzun kenarı: ");
        float longSide = input.nextFloat();

        System.out.println("alan: " + (shortSide * longSide));
        System.out.println("çevre: " + (2 * shortSide + 2 * longSide));
    }
}
