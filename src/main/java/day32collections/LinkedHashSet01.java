package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        // LinkedHashSet oluşturma
        LinkedHashSet<String> artists = new LinkedHashSet<>();
        artists.add("Ajda");
        artists.add("Tom");
        artists.add("Brad");
        artists.add("Angelina");
        artists.add("Tom");
        System.out.println(artists); // [Ajda, Tom, Brad, Angelina]

        //linkedHashset lerde index yok, cunku rastgele yerlestiriyor
        //set'ler takrarli elemani kabul etmez, fakat siz ayni elamani tekrar tekrar koyarsaniz hata vermez
        //ayni elemanin ustune yazar, yani birlestirir, sen onu ir tane gorursun. buna "override" etmek deniyor
        //istersen 1000 kere ekle set onu bir kere gosterir. buna override denir

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");
        artists.removeAll(actress);
        System.out.println(artists); // [Tom, Brad]
    }
}
