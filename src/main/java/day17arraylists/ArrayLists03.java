package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");


//        cities.remove(1);
        String n = cities.remove(1); // silinen öğeyi string olarak verir
        System.out.println(n);
        System.out.println(cities);


//        cities.remove("Kayseri"); // sadece ilkini siler
        boolean p = cities.remove("Kayseri"); // list'te varsa (sildiyse): true , yoksa: false
        System.out.println(p);
        System.out.println(cities);

        List<Character> a=new ArrayList<>();
        a.add('a');
        boolean b=a.remove(Character.valueOf('a'));
        System.out.println(b);
    }
}
