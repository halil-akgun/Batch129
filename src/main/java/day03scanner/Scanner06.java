package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        System.out.println("5 basamaklı sayı girin: ");
        int number = input.nextInt();

/*
        int sonRakam = number % 10;
        int temp1 = number / 10;
        int sondanIkınciRakam = temp1 % 10;
        int temp2 = temp1 / 10;
        int sondanUcuncuRakam = temp2 % 10;
        int temp3 = temp2 / 10;
        int sondanDorduncuRakam = temp3 % 10;
        int temp4 = temp3 / 10;
        int sondanBesinciRakam = temp4 % 10;

        System.out.println(sonRakam + sondanIkınciRakam + sondanDorduncuRakam + sondanBesinciRakam);
*/

        //Son rakami al
        int lastDigit = number % 10;
        number = number / 10;

        //Sondan ikinci rakami al
        int lastSecondDigit = number % 10;
        number = number / 10;

        //Sondan ucuncu rakami al
        int lastThirdDigit = number % 10;
        number = number / 10;

        //Sondan dorduncu rakami al
        int lastFourthDigit = number % 10;
        number = number / 10;

        //Sondan besinci rakami al
        int lastFifthDigit = number % 10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);

    }
}
