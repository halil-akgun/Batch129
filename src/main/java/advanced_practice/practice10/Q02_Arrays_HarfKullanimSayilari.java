package advanced_practice.practice10;

import java.util.List;

public class Q02_Arrays_HarfKullanimSayilari {
    /*
  Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
   */
    public static void main(String[] args) {
        String str = "Java is so Good";
        String[] arr = str.split("");
        String result = "";
        int counter = 0;

        for (String w : arr) {
            counter = 0;
            for (String u : arr) {
                if (w.equals(u)) {
                    counter++;
                }
            }
            if (!result.contains(w)) result += w + counter + " ";
        }
        System.out.println(result);
    }
}
