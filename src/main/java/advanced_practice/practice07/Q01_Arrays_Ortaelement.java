package advanced_practice.practice07;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_Ortaelement {
    /*
    Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
    Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("arrayin limitini girin: ");
        int limit = input.nextInt();
        int arr[] = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.print(i + 1 + ". elemanı girin: ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int ortIdx = limit / 2;
        if (limit % 2 != 0) {
            System.out.println("orta element: " + arr[ortIdx]);
        } else {
            System.out.println("orta element: " + (arr[ortIdx] + arr[ortIdx - 1]) / 2);
        }
    }
}
