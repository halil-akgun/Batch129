import java.util.stream.IntStream;

public class LoopStreamMathKarsilastirma {
    public static void main(String[] args) {

//           LOOP  -  STREAM  -  MATH   karsilastirma

        int s1 = 50000, s2 = 30000, s3 = 100, s4 = 10000;

        double result;
        //1. yöntem - döngü
        long startTime1 = System.nanoTime();
        result = (double) sumOfBetween_Loop(s2, s1) / sumOfBetween_Loop(s3, s4);
        long stopTime1 = System.nanoTime();
        System.out.println(result);

        //2.yöntem - stream api
        long startTime2 = System.nanoTime();
        result = (double) sumOfBetween_Stream(s2, s1) / sumOfBetween_Stream(s3, s4);
        long stopTime2 = System.nanoTime();
        System.out.println(result);

        //3.yöntem - Temel Matematik
        // İki sayı arasındaki ardışık tam sayıların toplamı,
        // ilk sayıyla son sayı arasındaki sayı miktarının (s1+s2)/2 ile çarpılmasıyla bulunur.
        long startTime3 = System.nanoTime();
        result = (double) sumOfBetween_Math(s2, s1) / sumOfBetween_Math(s3, s4);
        long stopTime3 = System.nanoTime();
        System.out.println(result);

        // geçen zaman
        System.out.println("DÖNGÜ -- " + (stopTime1 - startTime1) / 1000);
        System.out.println("STREAM -- " + (stopTime2 - startTime2) / 1000);
        System.out.println("MATEMATİK -- " + (stopTime3 - startTime3) / 1000);
    }

    public static int sumOfBetween_Loop(int s1, int s2) {
        int sum = 0;
        for (int i = s1; i <= s2; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumOfBetween_Stream(int s1, int s2) {
        return IntStream.range(s1, s2 + 1).sum();
    }

    public static int sumOfBetween_Math(int s1, int s2) {
        int count = s2 - s1 + 1;
        return (s1 + s2) * count / 2;
    }
}
