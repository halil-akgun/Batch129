package day32collections;

import java.util.*;

public class TreeSet01 {
    public static void main(String[] args) {

        long one = System.nanoTime();

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(35);
        ts.add(64);
        ts.add(10);
        ts.add(29);
        System.out.println(ts); // [10, 12, 29, 35, 64]

        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>(); // Random order
        hs.add(12);
        hs.add(35);
        hs.add(64);
        hs.add(10);
        hs.add(29);
        TreeSet<Integer> hts = new TreeSet<>(hs); // [10, 12, 29, 35, 64]
        System.out.println(hts);

        long three = System.nanoTime();

        System.out.println("TreeSet: " + (two - one));
        System.out.println("HashSet: " + (three - two)); // önce hashsete koyup oaradan treesete --> daha hızlı

        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
        //      TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler, ve sonra HashSet'i TreeSet'e ceviririz.

        System.out.println("ts.first() = " + ts.first()); // 10

        System.out.println("ts.last() = " + ts.last()); // 64

        System.out.println("ts.floor(15) = " + ts.floor(15));  //12 ==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi

        System.out.println("ts.floor(12) = " + ts.floor(12)); //12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi

        System.out.println("ts.floor(9) = " + ts.floor(9)); // null --> en küçükten küçük girilmemeli

        System.out.println("ts.ceiling(33) = " + ts.ceiling(33)); // 35  --> 33ten bir sonraki

        System.out.println("ts.ceiling(35) = " + ts.ceiling(35)); // 35

        System.out.println("ts.ceiling(65) = " + ts.ceiling(65)); // null

        SortedSet<Integer> tail1 = ts.tailSet(29);
        System.out.println("tail1 = " + tail1); // [29, 35, 64]  --> 29 ve yukarısı  default:true

        NavigableSet<Integer> tail2 = ts.tailSet(29, false);
        System.out.println("tail2 = " + tail2); // [35, 64] --> false olunca 29 dahil değil

        SortedSet<Integer> headSet1 = ts.headSet(29);
        System.out.println("headSet1 = " + headSet1); // [10, 12] --> default: false  -  29 dahil değil

        SortedSet<Integer> headSet2 = ts.headSet(29, true);
        System.out.println("headSet2 = " + headSet2); // [10, 12, 29]  -->  true olunca 29 dahil

        Integer higher1 = ts.higher(12);
        System.out.println("higher1 = " + higher1); // 29 --> 12den bir sonrakini verir

    }
}
