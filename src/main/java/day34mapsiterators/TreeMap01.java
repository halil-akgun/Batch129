package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
      1)TreeMap entry'leri "key" lere gore "natural order" a koyar.
      2)TreeMap cok yavastir cunku "natural order" yapmak cok zaman ister.
      3)TreeMap "thread-safe" ve "synchronized" degildir.
      4)TreeMap'lerin "key" lerinde "null" kullanilamaz. Cunku "key" lere gore siralama yaptigi icin "null"ı
      koyacak bir yer olmaz. Ama "value" larda istediginiz kadar kullanabilirsiniz.
*/
    public static void main(String[] args) {

        long one = System.nanoTime();

        TreeMap<String, Integer> ages = new TreeMap<>();
        ages.put("Murat", 32);
        ages.put("Ali", 22);
        ages.put("Gülsüm", 27);
        ages.put("Halil", 34);
        System.out.println(ages); // {Ali=22, Gülsüm=27, Halil=34, Murat=32}

        long two = System.nanoTime();

        HashMap<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Ali", 21);
        stdAges2.put("Kemal", 19);
        stdAges2.put("Ayse", 25);
        stdAges2.put("Murat", 22);

        System.out.println(stdAges2);

        long three = System.nanoTime();

        HashMap<String, Integer> stdAges3 = new HashMap<>();
        stdAges3.put("Ali", 3);
        stdAges3.put("Kemal", 3);
        stdAges3.put("Ayse", 3);
        stdAges3.put("Murat", 3);
        System.out.println(stdAges3);

        TreeMap<String, Integer> stdAges4 = new TreeMap<>(stdAges3);

        System.out.println(stdAges4);

        long four = System.nanoTime();

        System.out.println("TreeMap: " + (two-one) );
        System.out.println("HashMap: " + (three-two) );
        System.out.println("HashMap --> TreeMap: " + (four - three) );
    }
}
