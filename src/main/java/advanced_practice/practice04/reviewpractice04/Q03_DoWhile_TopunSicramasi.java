package advanced_practice.practice04.reviewpractice04;

import java.util.Scanner;

public class Q03_DoWhile_TopunSicramasi {
    public static void main(String[] args) {
        /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("the height (meter) at which the ball is dropped: ");
        double height = input.nextDouble();
        int splashMount = 0;
        double totalDistance = 0;
        do {
            totalDistance += height;
            splashMount++;
            height *= (double) 3 / 4;
            totalDistance += height;
            if (height < 1) {
                totalDistance += height;  // top havada kalmasın diye..
                break;
            }
        } while (true);
        System.out.println("splashMount = " + splashMount);
        System.out.printf("totalDistance = " + "%.2f", totalDistance);
        System.out.print(" meter");

    }
}
