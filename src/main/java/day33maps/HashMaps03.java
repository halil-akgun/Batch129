package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {
    public static void main(String[] args) {
        //Example 1: Size verilen bir cumlede kullanilan harflerin gorunum saysisini gosteren kodu yaziniz.
        //           "Java is Java." ==> J=2, a=4, v=2, i=1, s=1

        HashMap<String, Integer> lettersMap = new HashMap<>();
        String str = "Java is Java.";
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str); // JavaisJava
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [J, a, v, a, i, s, J, a, v, a]
        for (String w : arr) {
            Integer num = lettersMap.get(w);

            if (num == null) {
                lettersMap.put(w, 1);
            } else {
                lettersMap.replace(w, ++num);
            }
        }
        System.out.println(lettersMap); // {a=4, s=1, v=2, i=1, J=2}
    }
}
