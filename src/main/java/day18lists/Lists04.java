package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Mahsun");
        names.add("Müslüm");
        names.add("Orhan");

        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

        // containsAll
        System.out.println("names.containsAll(females) = " + names.containsAll(females)); // false

        // subList
        List<String> subList = names.subList(1, 3);
        System.out.println("subList = " + subList); // subList = [Cüneyt, Mahsun]

        // retainAll
        names.retainAll(females); // names'ten females ile ortak olmyan öğeleri siler
        System.out.println("names = " + names); // names = [Ajda]
        System.out.println("females = " + females); // females = [Ajda, Emel]


        //Example 1: Elektronik aletler ve ev aletleri listleriniz var.
        //           Elektronik ev aletlerini listeleyiniz.
        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retainAll(electronics) homeGoods ile electronics list'lerinin ortak elemanlarini homeGoods listi icinde verir.
        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);// [Radio, TV]

        // hashCode()
        System.out.println("names.hashCode() = " + names.hashCode()); // memorydeki adresi gösterir


    }
}
