package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {

    /*
    1) Map'lerde "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
    2) "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve key'ler "unique" dir
    3) "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve value'lar "tekrarli" olabilir.
    4) Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
    5) "Entry" ler "unique" dir cunku key kisimlari unique oldugundan her bir "Entry" digerlerinden farklidir.
    6) "HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralamak ile ugrasmazlar.
    7) "HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
    8) birden fazla "value"yu null yapabiliriz.
    9) "multi thread" (aynı anda fazla iş, yemek pişerken salata) için kullanılamaz ve "synchronization" yoktur.
*/
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm); // {}

        hm.put("USA", 400000000);
        System.out.println(hm); // {USA=400000000} --> entry

        hm.put("Germany", 85000000);
        System.out.println(hm); // {USA=400000000, Germany=85000000}

        // ayni key i kullarak yeni bir entry eklerseniz var olanı update etmis olursunuz.
        hm.put("Germany", 86000000);
        System.out.println(hm); // {USA=400000000, Germany=85000000} --> update

        hm.put(null, 15000000);
        hm.put("Myanmar", null);
        System.out.println(hm); // {null=15000000, Myanmar=null, USA=400000000, Germany=86000000} --> RANDOM ORDER

        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys); // [null, Myanmar, USA, Germany]

        // toplam nüfus
        Collection<Integer> hmValues = hm.values();
        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) sum += w;
        }
        System.out.println("sum = " + sum); // sum = 501000000

        // USA Population
        System.out.println("hm.get(\"USA\") = " + hm.get("USA")); //  400000000  --> value verir

        hm.replace("Myanmar", 33000000); // return oldValue;
        System.out.println(hm); // {null=15000000, Myanmar=33000000, USA=400000000, Germany=86000000}

        hm.putIfAbsent("USA", 333); // varsa hiçbirşey yapmaz, yoksa ekler
        System.out.println(hm); // {null=15000000, Myanmar=33000000, USA=400000000, Germany=86000000}


        // yeni öğretmenin maaşı standarttan 1000, eskinin maaşı 2000 tl fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayşe", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Tom";
        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println(salaries); //{Tom=12000, Veli=9000, Ayse=5000, Ali=8000}

        hm.replace("USA", 400000000, 500000000); // oldValue doğruysa değiştirir.
        System.out.println(hm); // {null=15000000, Myanmar=33000000, USA=500000000, Germany=86000000}

        // getOrDefault - listede varsa value verir, yoksa default verir
        System.out.println(hm.getOrDefault("Turkey", 0));

        // entrySet(); methodu "Map"i "Set"e cevirir. Setlerin methodlarini kullanabilmek icin ceviririz
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        System.out.println("entries = " + entries); // [null=15000000, Myanmar=33000000, USA=500000000, Germany=86000000]

        //Map'i Set'e çevirdiğimizde Set'in bütün özelliklerini kullanabiliriz. Mesela loop gibi.
        //entrySet() methodunu kullandığınzda elde ettiğiniz Set'in elemanları "<Map.Entry<String,Integer>>" şeklinde bir Map olur. Bu yüzden
        //elemanlar için Map methodları kullanılabilir


        // ülke.length leri nüfusa ekle
        int sum2 = 0;
        for (Map.Entry<String, Integer> w : entries) {
            if (w.getValue() != null && w.getKey() != null)
                sum2 = w.getValue() + w.getKey().length();
            System.out.println(sum2);
        }

    }
}
