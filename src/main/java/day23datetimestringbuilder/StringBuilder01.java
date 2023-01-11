package day23datetimestringbuilder;

import java.util.Arrays;

public class StringBuilder01 {
    public static void main(String[] args) {
/*
    javada string class veya stringbuilder ile string oluşturulabilir.
    String class stringleri "immutable"dir. (dğiştirilemez)
    StringBuilder class stringleri "mutable"dir. (dğiştirilebilir)
 */
        // immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.
        String a = "money";
        a += "more";

        // mutable
        // StringBuilder ile string üretmenin 1. yolu
        StringBuilder sb = new StringBuilder("Python");
        sb.append("!").append("?");
        System.out.println("sb = " + sb); // sb = Python!?

        // StringBuilder ile string üretmenin 2. yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); // 0
        System.out.println(sb2.capacity()); // 16
        sb2.append("Java");
        System.out.println("sb2 = " + sb2);
        System.out.println(sb2.length()); // 4
        System.out.println(sb2.capacity()); // 16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); // 19
        System.out.println(sb2.capacity()); // 34 16*2 + 2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length()); // 35
        System.out.println(sb2.capacity()); // 70 34*2 + 2 var olan kadar ekler + 2 bonus

        // StringBuilder ile string üretmenin 3. yolu
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3.length()); // 3
        System.out.println(sb3.capacity()); // 6

        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir
        sb3.insert(2, "qqq");
        System.out.println(sb3); // Flqqqo

        // string kullanma
        sb3.toString().split("l");

        // ters çevirir
        sb3.reverse();
        System.out.println(sb3); // oqqqlF

        sb3.deleteCharAt(1);
        System.out.println(sb3); // oqqlF

        sb3.delete(1, 3); // indeks 1, 2 siler (3 dahil değil)
        System.out.println(sb3); // olF

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Kava");

        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6)); // -1
        // sözlük sırasına göre bakar  --  ilk harf eşitse sonrakilere bakar,  kelimeler aynı olursa=>0
        // Java - Kava --> -1  j k'den bir geri

        sb6.setCharAt(2, 'm');
        System.out.println(sb6); // Kama

        sb6.replace(1, 3, "xyz");
        System.out.println(sb6); // Kxyza  --  indeks 1,2ye xyz konur

        // substring() methodu String Class metodudur. String return eder. StringBuilder'in orjinal degerini degistiremez.
        // Java data tipleri uyusmadigindan dolayi degisimi kabul etmez.
        sb6.substring(1, 3);// string metodu SB'ı değiştiremez, ayrı bir değişkene koymak gerelir
        System.out.println(sb6); // Kxyza
        sb6.delete(sb6.length() - 1, sb6.length());
        System.out.println(sb6); // Kxyz
    }
}
