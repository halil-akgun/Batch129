package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: 3'den 10'a kadar tamsayilari console'a yazdiriniz

        // 1. yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 2. yol
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz
        int t = 23;
        while (t > 11) {
            if (t % 2 == 0) {
                System.out.print(t + " ");
            }
            t--;
        }

        System.out.println();

        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        //1. yol
        int num = -777, sum = 0, numAbs = Math.abs(num);

        while (numAbs > 0) {
            sum += numAbs % 10;
            numAbs /= 10;
        }
        System.out.println(sum);

        //2. yol
        int a = 6841;
        int b = 0;
        for (int m = a; m > 0; m /= 10) {
            b += m % 10;
        }
        System.out.println(b);

    }
}
