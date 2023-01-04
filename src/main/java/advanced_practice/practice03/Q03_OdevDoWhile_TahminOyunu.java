package advanced_practice.practice03;

import java.util.Scanner;

public class Q03_OdevDoWhile_TahminOyunu {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

        Scanner input = new Scanner(System.in);
        int sayac = 10;
        int random = (int) (Math.random() * 101);
        System.out.println("0-100 arası sayı girin");
        int sayi;

        do {
            sayi = input.nextInt();
            if (sayi < random) {
                System.out.println("daha büyük bir sayı girin.");
                sayac--;
                System.out.println(sayac + " hakkınız kaldı.");
            } else if (sayi > random) {
                System.out.println("daha küçük bir sayı girin.");
                sayac--;
                System.out.println(sayac + " hakkınız kaldı.");
            } else {
                System.out.println("Tebrikler!!! " + (11 - sayac) + " tahminde sayiyi buldunuz. Puaniniz: " + ((sayac) * 10));
            }
            if (sayac == 0 | sayi == random) {
                if (sayac==0) System.out.println("hakkınız bitti.");

                System.out.println("oyunu yeniden başlatmak için 'R'ye, çıkmak için 'Q'ya basın.");
                String a = input.next();
                if (a.equalsIgnoreCase("R")) {
                    random = (int) (Math.random() * 101);
                    sayac=10;
                } else if (a.equalsIgnoreCase("Q")) {
                    break;
                }
            }
        } while (true);

    }
}
