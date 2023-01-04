package advanced_practice.practice04;

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
        System.out.print("bırakılan yüksekliği girin: ");
        double height = input.nextDouble();
        int splashAmount = 0;
        double totalDistance = 0;

        do {
            splashAmount++;
            totalDistance += height; // topun inişi (toplam mesafeye ekleme)
            height = height * 3 / 4; // sıçrama mesafesini hesaplama
            totalDistance += height; // topun sıçraması (toplam mesafeye ekleme)

        } while (height >= 1);
        System.out.println("Splash Amount = " + splashAmount);
        System.out.printf("Total Distance = " + "%.2f", totalDistance);

    }
}
