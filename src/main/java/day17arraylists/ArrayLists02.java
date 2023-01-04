package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

            /*
           ArrayList Sol tarafadaki ArrayList Yazma zorunlulugu yok. List te yazilabilir.
           List<Character> initials = new ArrayList<>();
           List yazinca Adem'in Oglu demis oluruz
           Arraylist yazinca Mustafa'nin oglu deriz.
           Hangisi daha dogru?
           ==> Ihtiyaca gore bu tanimlama degisir. Ama ikisi de kullanilir.
           Sag taraftaki Arraylist zorunludur cunku Constructor'tir.
           ArrayList<>() Constructor olmadan yeni bir obje olusturulamaz.
            */

        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        // kaç eleman

        //  *****   array'lerde --> length            *****
        //  *****   list(arrayList)'lerde --> size    *****
        int numOfElement = initials.size();
        System.out.println(numOfElement); // 4

        // bir elemanı alma
        char u = initials.get(2);
        System.out.println(u); // M

        //Example 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        // 1. yol
        int sum = 0;
        for (String w : cities) {
            sum += w.length();
        }
        System.out.println(sum);

        // 2. yol
        int toplam = 0;
        for (int i = 0; i < cities.size(); i++) {
            toplam += cities.get(i).length();
        }
        System.out.println(toplam);

        // eleman değiştirme
        cities.set(0, "New York");
        System.out.println(cities);

        // example2: maaş listi oluştur, %20 zam yap
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        // 1. yol  -- Recommended
//        int idx = 0;
//        for (Double w : salary) {
//            salary.set(idx, w * 1.20);
//            idx++;
//        }
//        System.out.println(salary);

        //2. yol
        for (int i = 0; i < salary.size(); i++) {
            salary.set(i, salary.get(i) * 1.20);
        }
        System.out.println(salary);

    }
}
