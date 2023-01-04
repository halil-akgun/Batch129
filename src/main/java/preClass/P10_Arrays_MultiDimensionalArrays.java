package preClass;

import java.util.Arrays;

public class P10_Arrays_MultiDimensionalArrays {
    public static void main(String[] args) {

        String names[] = {"Ali", "Veli", "Ayşe", "Fatma"};
        System.out.println("names = " + Arrays.toString(names));

        names[0] = "Can";
        names[2] = "Gül";
        System.out.println("names = " + Arrays.toString(names));
        System.out.println("names.length = " + names.length);

        int nums[] = {1, 2, 3}; // bir sola kaydır
        // 1. yol
        System.out.println("nums = " + Arrays.toString(nums));
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                temp = nums[nums.length - 1];
                nums[nums.length - 1] = nums[i];
            } else if (i == nums.length - 1) {
                nums[i - 1] = temp;
            } else {
                nums[i - 1] = nums[i];
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));

        // 2. yol
        int temp2 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp2;
        System.out.println("nums = " + Arrays.toString(nums));

        // tüm elemanları topla
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("sum = " + sum);

        int arr[][] = {{1, 2, 3}, {4, 5}, {6}};
        int a = arr[0][0];
        int result = 1;
        for (int[] w : arr) {
            for (int s : w) {
                a = s;
            }
            result *= a;
        }
        System.out.println("result = " + result);

        // aynı indexteki sayıları topla
        int brr[][] = {{1, 2}, {3, 4, 5}, {6}};
        int crr[][] = {{7, 8, 9}, {10, 11}, {12}};
        int sum2 = 0; // aynı indexteki sayılar burada toplanacak
        for (int i = 0; i < brr.length; i++) {
            int limit = brr[i].length; // brr'deki (birinci döngüde) 1. arrayin eleman sayısını limit kabul ediyoruz
            if (brr[i].length > crr[i].length) { // // crr'deki (birinci döngüde) 1. arrayin eleman sayısı daha az ise
                // az olanı limit olarak belirliyoruz. çünkü alttaki döngüde 2 elemanlı bir array için
                // 3 döngü olursa hata verir. bu yüzden alttaki döngü için bir sınır belirliyoruz
                limit = crr[i].length;
            }
            for (int j = 0; j < limit; j++) {
                sum2 += brr[i][j] + crr[i][j];
                System.out.println("İndeks [" + i + "][" + j + "] deki elemanların toplamı: " + sum2);
                sum2 = 0;
            }
        }


        // iç arraydeki sayıları topla
        int drr[][] = {{7, 8, 9}, {10, 11}, {12}};
        int err[] = new int[drr.length];
        int sum3 = 0;
        int counter = 0;
        for (int[] w : drr) {
            for (int i : w) {
                sum3 += i;
            }
            err[counter] = sum3;
            counter++;
            sum3 = 0;
        }
        System.out.println(Arrays.toString(err));

    }
}
