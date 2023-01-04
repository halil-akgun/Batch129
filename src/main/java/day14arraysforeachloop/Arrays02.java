package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

//        Integer ages[]=new Integer[6]; // Integer[] ages --> bu da olur
        int ages[] = new int[6];
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        // 1. yol  --- javayı yavaşlatır  --  mümkün olduğunca uzak dur
//        System.out.println(Arrays.toString(ages)); // [12, 23, 19, 44, 15, 32]
//        Arrays.sort(ages);
//        System.out.println(Arrays.toString(ages));
//
//        System.out.println(ages[0] + ages[ages.length - 1]);

        // 2. yol
        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum + maximum);


    }
}
