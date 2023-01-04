package day17arraylists.reviewday17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {


        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        // kaç eleman
        //  *****   array'lerde --> length            *****
        //  *****   list(arrayList)'lerde --> size    *****
        System.out.println("eleman sayısı: " + initials.size());

        // bir elemanı alma
        System.out.println("initials.get(2) = " + initials.get(2));


        //Example 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        ArrayList<String> cities = new ArrayList<>();
        cities.add("izmir");
        cities.add("miami");
        cities.add("istanbul");
        cities.add("bursa");

        // 1. yol
        int sum = 0;
        for (String w : cities) {
            sum += w.length();
        }
        System.out.println("sum = " + sum);

        // 2. yol
        int sum2 = 0;
        for (int i = 0; i < cities.size(); i++) {
            sum2 += cities.get(i).length();
        }
        System.out.println("sum2 = " + sum2);

        // eleman değiştirme
        cities.set(1, "adana");
        System.out.println("cities = " + cities);

        // example2: maaş listi oluştur, %20 zam yap
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(15000.25);
        salary.add(18000.75);
        salary.add(25000.00);
        System.out.println("salary = " + salary);

        // 1. yol  -- Recommended
//        int idx = 0;
//        for (Double w : salary) {
//            salary.set(idx, w * 1.20);
//            idx++;
//        }
//        System.out.println("salary zam (foreach) = " + salary);

        //2. yol
        for (int i = 0; i < salary.size(); i++) {
            salary.set(i, salary.get(i) * 1.20);
        }
        System.out.println("salary zam (for) = " + salary);

    }
}
