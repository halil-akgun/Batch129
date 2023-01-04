package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("kaç isim girilecek: ");
        int numOfElements = input.nextInt();

        System.out.println("girişi sonlandırmak için Q'ya basın.");

        String stdNames[] = new String[numOfElements];

        for (int i = 1; i <= numOfElements; i++) {
            System.out.print(i + ". öğrencinin adı: ");
            String stdName = input.next();
            if (stdName.equalsIgnoreCase("q")) {
                break;
            }
            stdNames[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(stdNames));

    }
}
