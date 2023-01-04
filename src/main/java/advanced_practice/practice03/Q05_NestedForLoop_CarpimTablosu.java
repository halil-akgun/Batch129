package advanced_practice.practice03;

import java.util.Scanner;

public class Q05_NestedForLoop_CarpimTablosu {
    public static void main(String[] args) {

        /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana yazdıran bir kod yazabilirsiniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                System.out.print(String.format("%2d", i * j) + " ");
                // ("%2d", 7) olursa 7 yazdırır "(space)7"
                // ("%02d", 7) olursa 07 yazdırır
            }
            System.out.println();
        }
        System.out.print(String.format("%-10.2f%n", 33333333333333333333.333333));
    }
}
