package day31collections.reviewday31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
             1)interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
             2)Abstract Class'lardan object olusturulamaz, constructor'lari vardir ama constructor object olusturmada kullanilamaz.
             3)interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden sonra kullanilamaz.
             4)*class --> class ==> extends
              class --> interface ==> implements
              *interface --> interface ==> extends
              interface --> class ==> Bu mumkun degildir. interface class'ın child'ı olamaz.
             5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
             yapilacaksa ArrayList kullanmak tavsiye edilmez.
             6)LinkedList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkedList
             leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
             durumlarda LinkedList kullanmak tavsiye edilir.
             7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
             8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
             bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
     */

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();


        LinkedList<String> cityNames = new LinkedList<>();
        // add
        cityNames.add("batman");
        cityNames.add("izmir");
        cityNames.add("batman");
        cityNames.add("istanbul");
        cityNames.add("batman");
        cityNames.add("miami");
        cityNames.add("batman");

        // addFirst
        cityNames.addFirst("batman");
        System.out.println(cityNames); // [batman, batman, izmir, batman, istanbul, batman, miami, batman]

        // addLast
        cityNames.addLast("batman");
        System.out.println(cityNames); // [batman, batman, izmir, batman, istanbul, batman, miami, batman, batman]

        // remove
        System.out.println(cityNames.remove(0)); // batman
        System.out.println(cityNames); // [batman, izmir, batman, istanbul, batman, miami, batman, batman]

        // remove
        System.out.println(cityNames.remove("miami")); // true
        System.out.println(cityNames); // [batman, izmir, batman, istanbul, batman, batman, batman]

        // remove (Cut + Paste) - bossa exception
        System.out.println(cityNames.remove()); // batman
        System.out.println(cityNames); // [izmir, batman, istanbul, batman, batman, batman]

        // remove (Cut + Paste) - bossa null verir
        System.out.println(cityNames.poll()); // izmir
        System.out.println(cityNames); // [batman, istanbul, batman, batman, batman]

        // remove first (Cut + Paste) - bossa null verir


        // remove last
        System.out.println(cityNames.removeLastOccurrence("batman")); // true
        System.out.println(cityNames); // [batman, istanbul, batman, batman]

        // Ilk elemani silmeden size verir
        System.out.println("peek: " + cityNames.peekFirst()); // peek: batman
        System.out.println(cityNames); // [batman, istanbul, batman, batman]

    }
}