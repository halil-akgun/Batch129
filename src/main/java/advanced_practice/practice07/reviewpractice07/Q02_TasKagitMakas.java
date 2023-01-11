package advanced_practice.practice07.reviewpractice07;

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
        String arr[] = {"TAŞ", "KAĞIT", "MAKAS"};
        int selectUser;
        int selectPC;

        while (oyuncununKazanmaSayisi < 3 && bilgisayarinKazanmaSayisi < 3) {
            System.out.println("1-TAŞ\n2-KAĞIT\n3-MAKAS");
            System.out.print("sayı girerek seçim yapın: ");
            selectUser = input.nextInt() - 1;
            if (selectUser < 0 || selectUser > 2) {
                System.out.println("hatalı giriş, tekrar deneyin");
                continue;
            }
            selectPC = (int) (Math.random() * 3);
            System.out.println("bilgisayarın seçimi: " + arr[selectPC]);
            if (selectUser == selectPC) {
                System.out.println("berabere. skor: " + oyuncununKazanmaSayisi + "-" + bilgisayarinKazanmaSayisi);
                continue;
            } else if ((selectUser == 0 && selectPC == 2) || (selectUser == 1 && selectPC == 0) || (selectUser == 2 && selectPC == 1)) {
                oyuncununKazanmaSayisi++;
                System.out.println("kazandınız. skor: " + oyuncununKazanmaSayisi + "-" + bilgisayarinKazanmaSayisi);
            } else {
                bilgisayarinKazanmaSayisi++;
                System.out.println("bilgisayar kazandı. skor: " + oyuncununKazanmaSayisi + "-" + bilgisayarinKazanmaSayisi);
            }
        }
        if (oyuncununKazanmaSayisi == 3) {
            if (bilgisayarinKazanmaSayisi == 0) {
                System.out.println("ALTIN skorla kazandınız.");
            } else if (bilgisayarinKazanmaSayisi == 1) {
                System.out.println("GÜMÜŞ skorla kazandınız.");
            } else System.out.println("BRONZ skorla kazandınız.");
        } else {
            if (oyuncununKazanmaSayisi == 0) {
                System.out.println("bilgisayar ALTIN skorla kazandı.");
            } else if (oyuncununKazanmaSayisi == 1) {
                System.out.println("bilgisayar GÜMÜŞ skorla kazandı.");
            } else System.out.println("bilgisayar BRONZ skorla kazandı.");
        }

    }
}
