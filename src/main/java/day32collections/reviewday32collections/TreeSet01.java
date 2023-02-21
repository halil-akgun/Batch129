package day32collections.reviewday32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one ;



        long two ;



        long three = System.nanoTime();


        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
        //      TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler, ve sonra HashSet'i TreeSet'e ceviririz.

        // 10 first()

         // 64 last()

         //12 ==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi

         //12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi

         // null --> en küçükten küçük girilmemeli

         // 35  --> 33ten bir sonraki

         // 35 ceiling

         // null ceiling

        //tailSet(29);
         // [29, 35, 64]  --> 29 ve yukarısı  default:true


         // [35, 64] --> false olunca 29 dahil değil

        // headSet(29);
        // [10, 12] --> default: false  -  29 dahil değil


        // [10, 12, 29]  -->  true olunca 29 dahil

        //higher(12);
        // 29 --> 12den bir sonrakini verir

    }
}
