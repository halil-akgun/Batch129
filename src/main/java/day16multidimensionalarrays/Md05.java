package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {

        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz
        int a[][] = {{2, 5}, {4, 7, 11}};
        int b = 1;
        for (int[] w : a) {
            for (int k : w) {
                b *= k;
            }
        }
        System.out.println(b);

    }
}
