package advanced_practice.practice05.reviewpractice05;

import java.util.Scanner;

public class Q02_Switch_AyGunleri {
    public static void main(String[] args) {

        /*
       Girilen yıl ve ay numarasına göre ayın kaç gün olduğunu yazdıran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
        */
        Scanner inp = new Scanner(System.in);
        System.out.print("yılı girin: ");
        int year = inp.nextInt();
        System.out.print("ayı girin: ");
        int month = inp.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ayda 31 gün vardır");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ayda 30 gün vardır");
                break;
            case 2:
                if ((year % 4 == 0 & year % 100 != 0) | year % 4 == 0) {
                    System.out.println("girilen ayda 29 gün vardır");
                } else {
                    System.out.println("girilen ayda 28 gün vardır");
                }
                break;
            default:
                System.out.println("geçerli bir ay numarası girin.");

        }
    }
}
