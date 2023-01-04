package advanced_practice.practice05.reviewpractice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuNotlar {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner input = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();
        String control;
        double ortalama = 0;
        double notlarToplam = 0;
        int ortalamayiGecenSayisi = 0;
        do {
            System.out.print("not girin: ");
            notlar.add(input.nextDouble());
            System.out.println("çıkmak için Q'ya, devam etmek için herhangi bir tuşa basın:");
            control = input.next();
        } while (!control.equalsIgnoreCase("Q"));

        // ortalama
        for (Double w : notlar) {
            notlarToplam += w;
        }
        ortalama = notlarToplam / notlar.size();

        // ortalamayı geçen öğreci sayısı
        for (Double w : notlar) {
            if (w > ortalama) ortalamayiGecenSayisi++;
        }
        System.out.println("Ortalamayı Geçen Sayısı = " + ortalamayiGecenSayisi);

    }
}
