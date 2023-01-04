package practice.nighttime02;

import java.util.Scanner;

public class C01_Scanner {
    /*

TechProEd spor salonu icin kullanıcıdan isim; soyisim; yas;
kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
olarak toplam ucreti yazdiriniz

 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TechProEd spor salonuna hoşgeldiniz.");
        System.out.print("adınız soyadınız: ");
        String fullNmae = input.nextLine();
        System.out.print("yaşınız: ");
        byte age = input.nextByte();
        System.out.print("kilonuz: ");
        double weight = input.nextDouble();
        System.out.print("boyunuz: ");
        double height = input.nextDouble();

        int monthlyFee = 20;
        System.out.println("aylık ücret: " + monthlyFee + " $");

        System.out.print("üyelik süreniz (ay olarak): ");
        int duration = input.nextInt();
        int totalFee = duration * monthlyFee;

        System.out.println("Sayın " + fullNmae + " salonumuza "
                + duration + " aylık üyelik için ödemeniz gereken tutar: " + totalFee + " $ 'dır.");

    }
}
