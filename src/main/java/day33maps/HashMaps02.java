package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {
    //Example 1: Size verilen bir cumledeki herbir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
    //           "Java is easy. Java is OOP. OOP makes Java easy."
    public static void main(String[] args) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        String sentences = "Java is easy. Java is OOP. OOP makes Java easy.";
        sentences = sentences.replaceAll("\\p{Punct}", "");
        System.out.println(sentences); // Java is easy Java is OOP OOP makes Java easy
        String[] arr = sentences.split(" ");
        System.out.println(Arrays.toString(arr)); // [Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

        for (String w : arr) {
            Integer numOfOccurrence = wordsMap.get(w);
            if (numOfOccurrence == null) {
                wordsMap.put(w, 1);
            } else {
                wordsMap.replace(w, numOfOccurrence + 1);
            }
        }
        System.out.println(wordsMap);
    }
}
