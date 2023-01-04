package day16multidimensionalarrays;

public class Md06 {
    public static void main(String[] args) {

        int a[][] = {{21, 5}, {14, 70, 11}};

        int min = a[0][0];
        int max = a[0][0];

        for (int[] w : a) {
            for (int k : w) {
                min = Math.min(min, k);
                max = Math.max(max, k);
            }
        }
        System.out.println(max + min);


    }
}
