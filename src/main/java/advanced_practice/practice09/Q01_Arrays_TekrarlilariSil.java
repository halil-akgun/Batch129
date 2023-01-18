package advanced_practice.practice09;

import java.util.Arrays;

public class Q01_Arrays_TekrarlilariSil {
    //Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 30, 40, 50, 50, 60, 20, 33, 11};
        Arrays.sort(arr);
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[idx] = arr[i - 1];
                idx++;
            }
        }
        arr[idx] = arr[arr.length - 1];
        System.out.println(Arrays.toString(arr));
        int[] arrTekrarsiz = new int[idx + 1];
        for (int i = 0; i < idx + 1; i++) {
            arrTekrarsiz[i] = arr[i];
            ;
        }
        System.out.println(Arrays.toString(arrTekrarsiz));
    }
}
