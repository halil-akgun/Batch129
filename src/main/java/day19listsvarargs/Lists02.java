package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {
    public static void main(String[] args) {
    /*
        Rastgele kullanici adi olusturan JAVA kodu yaziniz.
           1. Kullanicidan ismini isteyelim
           2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
           3. Kullanici adinin alinabilir olup olmadigina bakalim.
           4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
           5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
    */
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");

        Scanner input = new Scanner(System.in);
        System.out.println("kullanıcı adınızı girin:");
        String userName = input.nextLine().toUpperCase().trim();

        // 1. yol - random üretme
//        int random = (int) (Math.random() * 101);

        // 2. yol - random üretme
        int random = new Random().nextInt(100);

        while (databaseIsim.contains(userName + random) & databaseIsim.contains(userName)) {
            random = (int) (Math.random() * 100);
        }

        if (databaseIsim.contains(userName)) {
            System.out.println("bu username kullanılamaz.");
            databaseIsim.add(userName + random);
        } else {
            System.out.println("bu username kullanılabilir");
            databaseIsim.add(userName);
        }
        System.out.println(databaseIsim);

    }
}
