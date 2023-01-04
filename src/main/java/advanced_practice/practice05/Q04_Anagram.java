package advanced_practice.practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Anagram {
    public static void main(String[] args) {
       /*
       İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
       - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
       Örn:
       * bahriyeli <> harbiyeli.
       * sızlanma <> anlamsız.
       * asya <> yasa.
       * Bursa Dağı <> su bardağı
       * kan ara <> Ankara.
       */
        Scanner inp = new Scanner(System.in);
        System.out.println("iki string girin: ");
        String str1 = inp.nextLine();
        String str2 = inp.nextLine();
        anagram(str1, str2);
    }

    public static void anagram(String a, String b) {
        String str1[] = a.toLowerCase().replaceAll(" ", "").split("");
        String str2[] = b.toLowerCase().replaceAll(" ", "").split("");
        Arrays.sort(str1);
        Arrays.sort(str2);
        String result = (Arrays.equals(str1, str2)) ? "Anagramdır." : "Anagram değildir.";
        System.out.println("result = " + result);
    }
}
