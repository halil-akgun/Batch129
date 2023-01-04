package advanced_practice.practice02;

import java.util.Arrays;

public class Q03_Arrays_IkinciMax {
    public static void main(String[] args) {

        /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
        */

        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1};

        //1. Yol:
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-90, 0, 1, 100, 845, 898, 8787, 10001]
        System.out.println("min:" + arr[0] + " max:" + arr[arr.length - 1] + " secMax:" + arr[arr.length - 2]);

        //2. Yol:

        int min = arr[0];
        int max = arr[0];
        int secMax = arr[0];

        for (int w : arr) {
            if (w < min) {
                min = w;
            } else if (w > max) {
                secMax = max;
                max = w;
            } else if (w > secMax) {
                secMax = w;
            }
        }

        //3. Yol:
        int min2 = arr[0];
        int max2 = arr[0];
        int secondMax = arr[0];
        for (int w : arr) {
            min2 = Math.min(min2, w);
            max2 = Math.max(max2, w);
        }
        for (int w : arr) {
            if (w == max2) {
                continue;
            }
            secondMax = Math.max(secondMax, w);
        }
        System.out.println("min: " + min2 + ", max: " + max2 + ", seccondMax: " + secondMax);


    }
}
