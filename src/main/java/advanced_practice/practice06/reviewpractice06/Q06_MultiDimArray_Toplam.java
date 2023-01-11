package advanced_practice.practice06.reviewpractice06;

import java.util.Arrays;

/*
    Multi dimensional arrayin ic arraylerindeki tum elemanlarin toplamini birer birer bulan
    ve herbir sonucu yeni bir arrayin elemani yapan ve yeni arrayi ekrana yazdiran bir program yaziniz.
    input {{10,20,30},{4},{6,7,20}} ==> output ={60,4,33}
*/
public class Q06_MultiDimArray_Toplam {
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30}, {4}, {10, 20, 30}, {6, 7, 20}};
        int brr[] = new int[arr.length];
        int sum = 0;
        int idx = 0;
        for (int[] w : arr) {
            for (int s : w) {
                sum += s;
            }
            brr[idx] = sum;
            sum = 0;
            idx++;
        }
        System.out.println(Arrays.toString(brr));
    }
}
