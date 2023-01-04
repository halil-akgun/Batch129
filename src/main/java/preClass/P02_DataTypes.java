package preClass;

import java.util.Scanner;

public class P02_DataTypes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("iki sayı girin:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println("toplamları: " + (a + b));
//        System.out.println("farkları: " + (a - b));
//        System.out.println("çarpımları: " + (a * b));

//        System.out.print("karenin kenar uzunluğunu girin: ");
//        int kareKenar = input.nextInt();
//        System.out.println("çevresi: " + (kareKenar * 4));
//        System.out.println("alanı: " + (kareKenar * kareKenar));

//        System.out.print("Dairenin yarı çapını girin: ");
//        double yariCap = input.nextDouble();
//        System.out.println("Dairenin çevresi: " + (yariCap * 2 * 3.14));
//        System.out.println("Dairenin alanı: " + (yariCap * yariCap * 3.14));

//        System.out.println("Dikdörtgenler Prizmasının sırasıyla uzun, kısa kenarlarını ve yüksekliğini girin:");
//        int prizmaUzun = input.nextInt();
//        int prizmaKısa = input.nextInt();
//        int prizmaYukseklik = input.nextInt();
//        System.out.println("Dikdörtgenler Prizmasının Alanı: " +
//                (2 * (prizmaUzun * prizmaKısa + prizmaKısa * prizmaYukseklik + prizmaUzun * prizmaYukseklik)));
//        System.out.println("Dikdörtgenler Prizmasının Hacmi : " + (prizmaUzun * prizmaKısa * prizmaYukseklik));

        System.out.print("isminiz: ");
        String isim = input.nextLine();
        System.out.print("soyisminiz: ");
        String soyIsim = input.nextLine();
        System.out.println("İsminiz: " + isim
                + "\nSoyisminiz: " + soyIsim
                + "\nKursumuza katılımınız alınmıştır, teşekkür ederiz.");

        System.out.println("isim-soyisim: " + isim + " " + soyIsim);

        System.out.println("ismin baş harfi: " + isim.charAt(0));

    }
}
