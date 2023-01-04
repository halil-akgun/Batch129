package day17arraylists.reviewday17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayLists01 {
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);

        // listlere ekleman ekleme
        ages.add(33);
        ages.add(44);
        System.out.println(ages);

        //List' coklu eleman nasil eklenir? veya list'e başka bir list nasıl eklenir
        //Bir List'e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer> ages2 = new ArrayList<>();
        ages2.add(55);
        ages2.add(66);
        ages.addAll(ages2);
        System.out.println(ages2);
        System.out.println(ages);

        //contains() methodu: List'te elamanin var olup olmadigina bakar boolean dondurur.
        System.out.println(ages2.contains(33));
        System.out.println(ages2.contains(66));

        // iki list aynı mı?
        ArrayList<Integer> ages3 = new ArrayList<>();
        ages3.add(55);
        ages3.add(66);
        System.out.println("ages.equals(ages3) = " + ages.equals(ages3));
        System.out.println("ages2.equals(ages3) = " + ages2.equals(ages3));

        // önce sıralamak gerekebilir
        ArrayList<Integer> ages4 = new ArrayList<>();
        ages4.add(66);
        ages4.add(55);
        System.out.println("sort öncesi = " + ages3.equals(ages4)); // false
        ages4.sort(Comparator.naturalOrder());
        System.out.println("sort sonrası = " + ages3.equals(ages4)); // true

        // Example 1) Verilen 2 İnteger List'te tamamiyla ayni elemanlari olup olmadigini
        // kontrol eden kodu yaziniz
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(22);
        num1.add(33);
        num1.add(99);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(99);
        num2.add(33);
        num2.add(22);
        System.out.println("sort öncesi : " + num1.equals(num2)); // false
        Collections.sort(num1);
        Collections.sort(num2);
        System.out.println("sort sonrası : " + num1.equals(num2)); // true

    }
}
