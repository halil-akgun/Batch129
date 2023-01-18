package advanced_practice.practice09;

import java.time.LocalTime;

public class Q05_ZarSaniye {
    //İki zar atıp sonucunu atıldığı saniyeye göre 2 veya 5 ile çarpıp bilgisayarın puanıyla karşılaþtıran bir method yazınız.
    //Zarın atıldığı saniye 5'in katı ise zar sayısı 5 ile çarpılıp puana eklenecek, çiftse zar sayısı iki ile çarpılıp puana eklenecek,tekse zar sayısı puana eklenecek.
    public static void main(String[] args) {
        zarAt();
    }

    static void zarAt() {
        int puanOyuncu = 0;
        int zarOyuncu = (int) (Math.random() * 6) + 1;
        int saniyeOyuncu = LocalTime.now().getSecond();
        if (saniyeOyuncu % 5 == 0) {
            puanOyuncu += zarOyuncu * 5;
        } else if (saniyeOyuncu % 2 == 0) {
            puanOyuncu += zarOyuncu * 2;
        } else {
            puanOyuncu += zarOyuncu;
        }
        System.out.println("zarOyuncu = " + zarOyuncu);
        System.out.println("saniyeOyuncu = " + saniyeOyuncu);
        System.out.println("puanOyuncu = " + puanOyuncu);

        System.out.println("**************************");

        int puanPC = 0;
        int zarPC = (int) (Math.random() * 6) + 1;
        int saniyePC = LocalTime.now().getSecond();
        if (saniyePC % 5 == 0) {
            puanPC += zarPC * 5;
        } else if (saniyePC % 2 == 0) {
            puanPC += zarPC * 2;
        } else {
            puanPC += zarPC;
        }
        System.out.println("zarPC = " + zarPC);
        System.out.println("saniyePC = " + saniyePC);
        System.out.println("puanPC = " + puanPC);
    }
}
