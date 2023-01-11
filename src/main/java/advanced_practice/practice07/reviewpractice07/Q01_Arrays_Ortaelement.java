package advanced_practice.practice07.reviewpractice07;

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
        System.out.print("arrayinizin eleman sayısı: ");
        int elemanSayisi = input.nextInt();
        int[] arr = new int[elemanSayisi];
        for (int i = 0; i < elemanSayisi; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        ;
        System.out.println(Arrays.toString(arr));
        int ort = elemanSayisi / 2;
        if (elemanSayisi % 2 == 1) {
            System.out.println("orta: " + arr[ort]);
        } else {
            System.out.println("orta: " + (arr[ort] + arr[ort - 1]) / 2);
        }
    }
}
