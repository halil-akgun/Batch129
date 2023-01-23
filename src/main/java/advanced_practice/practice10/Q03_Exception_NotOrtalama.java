package advanced_practice.practice10;

import java.util.Scanner;

public class Q03_Exception_NotOrtalama {
    /*
    Vize ve final notlarını alarak ortlama hesaplayan bir kod yazınız.
    int v = vize
    int f = final

    Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
    Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
    Diğer durumlarda ise, vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.
    Ortalama 70'in üzerinde is "Başarılı" altında ise "Başarısız" yazdırsın.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vizeNotu;
        int finalNotu;

        while (true) {
            try {
                System.out.print("vize notu: ");
                vizeNotu = input.nextInt();
                if (vizeNotu > 100 || vizeNotu < 0) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("not 0-100 arası olmalı");
            } catch (Exception e) {
                System.out.println("geçersiz giriş");
                input.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("final notu: ");
                finalNotu = input.nextInt();
                if (finalNotu > 100 || finalNotu < 0) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("not 0-100 arası olmalı");
            } catch (Exception e) {
                System.out.println("geçersiz giriş");
                input.nextLine();
            }
        }

        double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;

        if (ortalama >= 70) {
            System.out.println(ortalama + " --> başarılı");
        } else {
            System.out.println(ortalama + " --> başarısız");
        }
    }
}
