package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir list'teki elemanlari tekrarsiz olarak yazdiriniz
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> myList2 = new ArrayList<>();
        for (Integer w : myList) {
            if (!(myList2.contains(w))) {
                myList2.add(w);
            }
        }
        System.out.println(myList2);


        //Example 2: Musteriden urun ismi aliniz
        //           Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //           Musterinin ismini verdigi urun listede yoksa "Out of stock" yazdiriniz
        Scanner input = new Scanner(System.in);

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");

        System.out.println("ürün arama sistemimize hoşgeldiniz!");
        System.out.println("çıkmak için Q'ya basın.");
        do {
            System.out.println("aradığınız ürünün ismini girin:");
            String p = input.nextLine();

            if (p.equalsIgnoreCase("Q")) {
                break;
            } else if (products.contains(p)) {
                System.out.println(p + " is in stock.");
            } else {
                System.out.println(p + " is out of stock.");
            }

        } while (true);
        System.out.println("sitemizi kullandığınız için teşekkür ederiz.");


    }
}
