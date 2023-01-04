package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Example 1: Integer bir list olusturunuz
        //          List'e 5 tane eleman ekleyiniz.
        //          Bu elemanlardan 12'yi siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        //     REMOVE
        //  1. yol
        Integer sayi = 12;
        ages.remove(sayi);
        System.out.println(ages);

        //  2. yol  --  Recommended
        ages.remove((Integer) 10);
        System.out.println(ages);

        //  3. yol
        ages.remove(Integer.valueOf(8));
        System.out.println(ages);

        //  4. yol
        ages.remove(ages.indexOf(25));
        System.out.println(ages);

        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);
        System.out.println(ages); // [40, 10, 25, 12, 8, 12]

        //      REMOVEALL  --> list ile çalışır
        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(40);
        ages.removeAll(silinecekler);
        System.out.println(ages); // [10, 25, 8]


    }
}
