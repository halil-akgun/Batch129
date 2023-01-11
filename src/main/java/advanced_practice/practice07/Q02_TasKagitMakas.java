package advanced_practice.practice07;

import java.util.Scanner;

public class Q02_TasKagitMakas {
    /*
    Taş-Kağıt-Makas oyunu yazınız.
        -Oyuncudan tahmin alınız.
        -Bilgisayarın tahmini ile karşılaştırınız.
        -3'e ilk ulaşan kazanır
        -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oyuncununKazanmaSayisi = 0;
        int bilgisayarinKazanmaSayisi = 0;
        int sayac = 0;

        while (oyuncununKazanmaSayisi < 3 && bilgisayarinKazanmaSayisi < 3) {
            sayac++;
            System.out.println(sayac + ". seçimi girin: \nTaş \nKağıt \nMakas");
            String oyuncuTahmini = input.next().toLowerCase().trim();
            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("kagit") || oyuncuTahmini.equals("makas"))) {
                System.out.println("Geçerli bir tahmin giriniz");
                sayac--;
                continue;
            }

            //Bilgisayarın tahmini
            String arr[] = {"taş", "kağıt", "makas"};
            int randomIdx = (int) (Math.random() * 3);
            String bilgisayarTahmini = arr[randomIdx];
            System.out.println("Bilgisayarın tahmini: " + bilgisayarTahmini);

            if (oyuncuTahmini.equals(bilgisayarTahmini)) {
                System.out.println("berabere. Skor: " + oyuncununKazanmaSayisi + " - " + bilgisayarinKazanmaSayisi);
            } else if (oyuncuTahmini.equals("taş") && bilgisayarTahmini.equals("makas") || oyuncuTahmini.equals("kağıt") && bilgisayarTahmini.equals("taş") || oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kağıt")) {
                oyuncununKazanmaSayisi++;
                System.out.println("kazandınız. Skor: " + oyuncununKazanmaSayisi + " - " + bilgisayarinKazanmaSayisi);
            } else {
                bilgisayarinKazanmaSayisi++;
                System.out.println("bilgisayar kazandı. Skor: " + oyuncununKazanmaSayisi + " - " + bilgisayarinKazanmaSayisi);
            }
        }
        System.out.println("oyun bitti. Skor: " + oyuncununKazanmaSayisi + " - " + bilgisayarinKazanmaSayisi);

        if (oyuncununKazanmaSayisi == 3) {
            if (bilgisayarinKazanmaSayisi == 0) {
                System.out.println("Altın skor ile kazandınız.");
            } else if (bilgisayarinKazanmaSayisi == 1) {
                System.out.println("Gümüş skor ile kazandınız.");
            } else {
                System.out.println("Bronz skor ile kazandınız.");
            }
        } else {
            if (oyuncununKazanmaSayisi == 0) {
                System.out.println("Bilgisayar Altın skor ile kazandı.");
            } else if (oyuncununKazanmaSayisi == 1) {
                System.out.println("Bilgisayar Gümüş skor ile kazandı.");
            } else {
                System.out.println("Bilgisayar Bronz skor ile kazandı.");
            }
        }
    }
}
