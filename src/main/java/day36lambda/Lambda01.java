package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);

        List<Double> half = getHalfOfElementsGreaterThanFiveDistinctReversed(myList);
        System.out.println(half); // [19.2, 13.4, 6.0, 3.5]

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list); // AJDA ANGELINA BRAD CUNEYT JHON TOM
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list); // tom jhon cuneyt brad angelina ajda
        System.out.println();
        printAllSortWithLengthUpperDistinct(list); // TOM JHON AJDA BRAD CUNEYT ANGELINA
        System.out.println();
        printAllSortWithLastUpperDistinct1(list); // AJDA ANGELINA BRAD TOM JHON CUNEYT
        System.out.println();
        printAllSortWithLastUpperDistinct2(list); // CUNEYT JHON TOM BRAD AJDA ANGELINA
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthInAlphabeticalOrder(list);
//        System.out.println(removeElementIfTheLengthGreaterThanFive(list)); // [Tom, Jhon, Ajda, Tom, Brad]
//        System.out.println(removeElementIfStartWithAorEndsWithD(list)); // [Tom, Jhon, Tom, Cuneyt]
        System.out.println(printLengthSquare(list));
        System.out.println();
        System.out.println(printElementsLengthEven(list)); // [Jhon, Ajda, Angelina, Brad, Cuneyt]
    }

    //Example 1: Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.
    public static List<Double> getHalfOfElementsGreaterThanFiveDistinctReversed(List<Double> list) {
        return list.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    //Example 2: Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
    }

    //Example 3: Tum list elemanlarini kucuk harfle alfabetik siranin tersinde ve tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    //Example 4: Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLengthUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));
    }

    //Example 5: Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastUpperDistinct1(List<String> list) {
        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))). // t->.. lambda expression
                forEach(t -> System.out.print(t + " "));
    }

    public static void printAllSortWithLastUpperDistinct2(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()). // t->.. lambda expression
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //Example 6: Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz
    //           uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void printAllSortWithLengthUpperDistinctSameLengthInAlphabeticalOrder(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase). // method reference
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }

    //Example 7: Karakter sayisi 5 den fazla olan elemanlari siliniz
//    public static List<String> removeElementIfTheLengthGreaterThanFive(List<String> list) {
//        list.removeIf(t -> t.length() > 5); // removeiften sonra stream kullanilamaz
//        return list; // [Tom, Jhon, Ajda, Tom, Brad]
//    }

    //Example 8: a ile baslayan veya d ile biten elemanlari silin
//    public static List<String> removeElementIfStartWithAorEndsWithD(List<String> list) {
//        list.removeIf(t -> t.startsWith("A") || t.endsWith("d"));
//        return list; // [Tom, Jhon, Tom, Cuneyt]
//    }
    //Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur. Bu yüzden "stream()" methodunu kullanmayız
    //"removeIf()" methodunda olduğu gibi.

    //Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
    //ulasiriz, distinct() methoduna ulaştığımız gibi.

    // sonuc bize list olarak lazımsa "collect(Collectors.toList()" ile sonucu List'e ceviririz

    //Example 9:List elemanlarini karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public static List<Integer> printLengthSquare(List<String> list) {
//        return list.stream().map(t -> t.length() * t.length()).collect(Collectors.toList());
        return list.stream().map(Utils::getLengthSquareMethod).collect(Collectors.toList());
    } // [9, 16, 16, 64, 9, 16, 36]

    //Example 10: List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz
    public static List<String> printElementsLengthEven(List<String> list) {
        return list.stream().filter(Utils::isLengthEven).collect(Collectors.toList());
    } // [Jhon, Ajda, Angelina, Brad, Cuneyt]
}