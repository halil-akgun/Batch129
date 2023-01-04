package day16multidimensionalarrays.reviewday16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {

        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz
        int arr[][] = {{5, 10}, {1, 2, 7}};
        int multiply = 1;
        for (int[] w : arr) {
            for (int k : w) {
                multiply *= k;
            }
        }
        System.out.println("multiply = " + multiply);

    }
}
