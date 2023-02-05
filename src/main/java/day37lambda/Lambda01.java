package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplicationFromThreeToNine1());
        System.out.println(getMultiplicationFromThreeToNine2());
        System.out.println(getFactorial(5));
        System.out.println(getSumOfEvenBetweenTwoInt(8, 2));
        System.out.println(getSumOfDigitsBetweenToInt(11, 14));

    }

    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer> myList) {
        return myList.stream().reduce(Math::addExact).get();
    } // 60

    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    public static int getSumFromSevenToSeventy() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
    } // 2464

    // 3ten 9a kadar tum tamsayilarin carpimini veren metod
    public static int getMultiplicationFromThreeToNine1() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
    } // 181440     -----  rangeClosed(a,b) ==> a dahil, b dahil

    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();
    } // 181440     -----  range(a,b) ==> a dahil, b dahil DEGIL

    // 4) faktoryel hesaplama
    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("negatif olamaz");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
    } // 120

    // 5) 2 tam sayi arasindaki tum cift sayilari topla
    public static int getSumOfEvenBetweenTwoInt(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();
    } // (8, 2)  -> 10

    // 2 sayi arasindaki sayilarin rakamlari toplami
    public static int getSumOfDigitsBetweenToInt(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).map(Utils::getSumOfDigits).sum();
    } // 11-14  --> 12, 13  --> 1+2+1+3 = 7


}
