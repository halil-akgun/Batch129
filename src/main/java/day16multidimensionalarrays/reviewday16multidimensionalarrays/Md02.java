package day16multidimensionalarrays.reviewday16multidimensionalarrays;

public class Md02 {

    public static void main(String[] args) {

        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Toplam eleman sayisini console'a yazdiriniz
        int arr[][] = {{5, 10}, {33, 75, 7}};
        int length = 0;
        for (int[] w : arr) {
            length += w.length;
        }
        System.out.println("length of arr = " + length);

    }
}