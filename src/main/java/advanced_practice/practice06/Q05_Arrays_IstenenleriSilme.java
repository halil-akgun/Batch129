package advanced_practice.practice06;

import java.util.Arrays;
import java.util.Scanner;

//Bir  integer Array'de verilen bir değer dışındaki elamanları  yeni bir Array olarak yazdıran bir method yazınız.
public class Q05_Arrays_IstenenleriSilme {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 5, 5};
        System.out.println(Arrays.toString(istenileniSil(arr)));
    }

    public static int[] istenileniSil(int[] arr) {
        Scanner inp = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.print("silmek istediğiniz elemanı girin: ");
        int silinecek = inp.nextInt();
        int length = 0;
        for (int w : arr) {
            if (w != silinecek) length++;
        }
        int brr[] = new int[length];
        System.out.println("length = " + length);
        int idx = 0;
        for (int w : arr) {
            if (w != silinecek) {
                brr[idx] = w;
                idx++;
            }
        }
        return brr;
    }
}
