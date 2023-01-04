package advanced_practice.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    public static void main(String[] args) {

     /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

        Scanner input = new Scanner(System.in);
        System.out.print("array limitini girin: ");
        int limit = input.nextInt();
        int arr[] = new int[limit];
        for (int i = 0; i < limit; i++) {
            System.out.println("İndeks " + i + " değerini giriniz");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //  Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
        System.out.print("silmek istediğiniz indeksi silin: ");
        int deleteIndex = input.nextInt();

        int[] arr2 = new int[limit - 1];

        int idx = 0;
        for (int i = 0; i < limit; i++) {
            if (i != deleteIndex) {
                arr2[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
