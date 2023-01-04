package day16multidimensionalarrays.reviewday16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {

        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int arr[][] = {{5, 10}, {33, 75, 7}};
        int sum = 0;
        for (int[] w : arr) {
            for (int k : w) {
                sum += k;
            }
        }
        System.out.println("sum = " + sum);

    }
}
