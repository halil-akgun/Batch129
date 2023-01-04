package practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        String a="madam";
        String arr[] = a.toLowerCase().split("");
        List<String> crr = Arrays.asList(arr);
        List<String> brr = new ArrayList<>();
        for (String w : arr) {
            brr.add(w);
        }
        Collections.reverse(brr);

        String result = (brr.equals(crr)) ? "Yes" : "No";
        System.out.println(result);

    }
}
