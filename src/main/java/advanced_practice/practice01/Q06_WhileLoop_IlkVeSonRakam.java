package advanced_practice.practice01;

import java.util.Scanner;

public class Q06_WhileLoop_IlkVeSonRakam {
    public static void main(String[] args) {

        //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin: ");
        int a = input.nextInt();

        //1. yol
        int sonRakam = a % 10;
        int ilkRakam = a;
        while (ilkRakam > 9) {
            ilkRakam /= 10;
        }
        System.out.println(ilkRakam);
        System.out.println(sonRakam);
        System.out.println("Toplam: " + (ilkRakam + sonRakam));

        //2. yol
        String sayiString = String.valueOf(a);
        int strIlkRakam = Integer.parseInt(sayiString.substring(0, 1));
        int strSonRakam = Integer.parseInt(sayiString.substring(sayiString.length() - 1));
        System.out.println("Toplam: " + (strIlkRakam + strSonRakam));


    }
}
