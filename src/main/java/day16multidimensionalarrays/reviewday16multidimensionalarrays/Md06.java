package day16multidimensionalarrays.reviewday16multidimensionalarrays;

public class Md06 {
    public static void main(String[] args) {

        //EXample 1: Bir multi dimensional array'deki en buyuk ve en kucuk sayinin toplamini ekrana yazdiriniz
        int arr[][] = {{55, 10}, {11, 22, 77}};
        int min = arr[0][0];
        int max = arr[0][0];
        for (int[] w : arr) {
            for (int k : w) {
                min = Math.min(min, k);
                max = Math.max(max, k);
            }
        }
        System.out.println("toplam: " + (min + max));

    }
}
