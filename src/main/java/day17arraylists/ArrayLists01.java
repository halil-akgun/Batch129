package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
         1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
         2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
            List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
         3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
            List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
         4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
              i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
              ii) Array'ler cok hizli calisir.
              iii) Array'ler memory'de cok az yer kaplar.

         Array ile ArrayList'in farki nedir?
        1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
          soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
          Array'ler eleman sayisinda "fixed" dirler.
          ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
          cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
        2)Array'lerin icine "primitive" ve "reference" lar konabilir.
          ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
        3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
          Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
          Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
          Array kullanma riskini almayin
        */

        //ArrayList nasil olusturulur?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages); // []

        // listlere ekleman ekleme
        ages.add(12);
        System.out.println(ages); // [12]
        //add() her zaman elemani en sona ekler. (insertion order)
        ages.add(9);
        System.out.println(ages); // [12, 9]
        // iki index arasına değer ekleme
        ages.add(1, 656);
        System.out.println(ages); // [12, 656, 9]

        //List' coklu eleman nasil eklenir? veya list'e başka bir list nasıl eklenir
        //Bir List'e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages); // [12, 656, 9, 8, 9, 10]
        ages.addAll(2, newAges);
        System.out.println(ages); // [12, 656, 8, 9, 10, 9, 8, 9, 10]

        //contains() methodu: List'te elamanin var olup olmadigina bakar boolean dondurur.
        System.out.println("ages.contains(656) = " + ages.contains(656));

        ages.clear();
        System.out.println(ages);

        // iki list aynı mı?
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("tom");
        names1.add("kim");
        names1.add("jim");
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("tom");
        names2.add("kim");
        names2.add("jim");
        System.out.println("names1.equals(names2) = " + names1.equals(names2));


        // Example 1) Verilen 2 İnteger List'te tamamiyla ayni elemanlari olup olmadigini
        // kontrol eden kodu yaziniz
        ArrayList<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(12);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(12);
        num2.add(23);
        Collections.sort(num);
        Collections.sort(num2);
        boolean t = num2.equals(num);
        System.out.println("Check " + t);

    }
}
