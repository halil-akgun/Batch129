package day16multidimensionalarrays.reviewday16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        //MultiDimensional Array nasil olusturulur?
        int arr[][] = new int[3][2];

        //MultiDimensional Array'ler nasil yazdirilir?
        System.out.println(Arrays.deepToString(arr));

        //MultiDimensional Array'lere eleman nasil eklenir?
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[1][0] = 55;
        arr[1][1] = 66;
        arr[2][0] = 77;
        arr[2][1] = 223;
        System.out.println(Arrays.deepToString(arr));


        //Note: Array'lere non-primitive data konulamaz.
        //      Array'lere primitive data veya reference konulur.
        //      Ama siz bir array'i yazdirmak istediginizde Java adres'ler yardimi ile non-primitive data'ya ulasir
        //      ve o non-primitive data'yi sanki array'in icindeymis gibi gosterir.

        //MultiDimensional Array'lerdeki belli elemanlara nasil ulasilir?
        System.out.println(arr[0][1]);
        System.out.println(arr[2][1]);
        System.out.println(Arrays.toString(arr[2]));



    }
}