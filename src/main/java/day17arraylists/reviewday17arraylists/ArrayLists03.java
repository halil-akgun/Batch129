package day17arraylists.reviewday17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println("cities = " + cities);

//        cities.remove(1);
        cities.remove(0);
        System.out.println("cities = " + cities);
        String removedCityByIndex = cities.remove(0);
        System.out.println("removedCityByIndex = " + removedCityByIndex);
        System.out.println("cities = " + cities);

//        cities.remove("Kayseri"); // sadece ilkini siler
        cities.remove("Kayseri");
        System.out.println("cities = " + cities);
        boolean removedCityByObject = cities.remove("Almaty");
        System.out.println("removedCityByObject = " + removedCityByObject);
        System.out.println("cities = " + cities);

    }
}
