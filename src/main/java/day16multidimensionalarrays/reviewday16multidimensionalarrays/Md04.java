package day16multidimensionalarrays.reviewday16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {

        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensional'li array donusturunuz.
        //           [ [2, 5], [4, 7, 11] ] ==> [ 2, 5, 4, 7, 11 ]
        int a[][] = {{2, 5}, {4, 7, 11}};
        System.out.println(Arrays.deepToString(a));

        //"a" array'indeki toplam eleman sayisini bulunuz
        int counter = 0;
        for (int[] w : a) {
            counter += w.length;
        }

        //"b" isimli tek dimensional'li bir array olusturunuz
        int b[] = new int[counter];

        //"a" array'indeki elemanlari "b" array'ine transfer ediniz
        int idx = 0;
        for (int[] w : a) {
            for (int k : w) {
                b[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));

    }
}