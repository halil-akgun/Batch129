package advanced_practice.practice08;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {
    /*
        Bakkal günlük gelir programı yazınız.
         -Tüm günlerin gelirlerini gösteren bir method,
         -Haftalık gelir ortalamasını gösteren bir method,
         -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
         -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
         -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
     */
    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static double toplamKazanc = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.print(gunler.get(gun) + " günün kazancını girin: ");
            double kazanc = input.nextDouble();
            gunlukKazanclar.add(kazanc);
            toplamKazanc += kazanc;
            gun++;
        }
        System.out.println(gunlukKazanclar);
        System.out.println(toplamKazanc);
        System.out.println("ortalama gelir: " + ortalamaGelir());
        System.out.println("ortalamaUstuGunler() = " + ortalamaUstuGunler());
        System.out.println("ortalamaAltiGunler() = " + ortalamaAltiGunler());
        System.out.println("ortalamaGelirliGunler() = " + ortalamaGelirliGunler());
    }

    static double ortalamaGelir() {
        return toplamKazanc / 7;
    }

    static String ortalamaUstuGunler() {
        String str = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) > ortalamaGelir()) {
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
    static String ortalamaAltiGunler() {
        String str = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) < ortalamaGelir()) {
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
    static String ortalamaGelirliGunler() {
        String str = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) == ortalamaGelir()) {
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
}
