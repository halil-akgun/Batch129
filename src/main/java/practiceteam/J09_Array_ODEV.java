package practiceteam;

import java.util.Arrays;

public class J09_Array_ODEV {

    /*
     İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız
     */

    public static void main(String[] args) {

        String isim[] = new String[5];

        isim[0] = "nalan";
        isim[1] = "mahmut";
        isim[2] = "asila";
        isim[3] = "erkan";
        isim[4] = "ela";

        int counter = 0;

        for (String w : isim) {
            if (w.charAt(0) == w.charAt(w.length() - 1)) {
                System.out.println(w);// cevap
                counter++;
            }
        }


        // Example: İlk ve son karakterleri aynı olan array öğelerini bulup yeni bir Array'e atayiniz

        String isim2[] = new String[counter];


        int idx = 0;
        for (String w : isim) {
            if (w.charAt(0) == w.charAt(w.length() - 1)) {
                isim2[idx] = w;
                idx++;
            }
        }
        System.out.println("isim2: " + Arrays.toString(isim2));

    }
}
