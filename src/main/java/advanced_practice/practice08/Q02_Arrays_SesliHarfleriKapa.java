package advanced_practice.practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_SesliHarfleriKapa {
    /*
    Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp her bir karakteri bir array elemanı olarak yazdıran bir kod yazınız.
    Örn:
    input: Merhaba
    output: [M, *, r, h, *, b, *]
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word = input.nextLine();
        String[] arr = word.replaceAll("[AEIOUaeiou]", "*").split("");
        System.out.println(Arrays.toString(arr));
    }
}
