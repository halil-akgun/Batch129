package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {
    public static void main(String[] args) {
        //

        HashMap<String, Integer> lettersMap = new HashMap<>();
        String str = "Java is Java.";
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        for (String w : arr) {
            Integer num = lettersMap.get(w);

            if (num==null){
                lettersMap.put(w,1);
            }else {
                lettersMap.replace(w,++num);
            }
        }
        System.out.println(lettersMap);
    }
}
