package advanced_practice.practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuNotlar {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner input = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();
        String karar;
        do {
            System.out.println("eklemek istediğiniz notu girin:");
            notlar.add(input.nextDouble());
            System.out.println("çıkmak içinQ'ya, devam etmek için herhangi bir karakter girin:");
            karar = input.next();
        } while (!karar.equalsIgnoreCase("Q"));
        System.out.println("notlar = " + notlar);

        // ortalamayı hesapla
        double toplam = 0;
        for (Double w : notlar) {
            toplam += w;
        }

        double ortalama = toplam / notlar.size();

        // ortalama üstü not sayısı
        int ortalamaUstuNotSayisi = 0;
        for (Double w : notlar) {
            if (w > ortalama) ortalamaUstuNotSayisi++;
        }
        System.out.println("Ortalama Üstü Not Sayısı = " + ortalamaUstuNotSayisi);


    }
}
