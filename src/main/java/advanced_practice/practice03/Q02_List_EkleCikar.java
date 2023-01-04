package advanced_practice.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {

        // Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran yada
        // mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("ekleme yapmak için 'add'\n" +
                    "element güncellemek için 'set'\n" +
                    "element silmek için 'remove'\n" +
                    "çıkmak için 'break' komutunu girin.");
            String komut = input.next();
            if (komut.equalsIgnoreCase("add")) {
                System.out.println("eklemek istediğiniz sayıyı girin:");
                list.add(input.nextInt());
                System.out.println(list);
            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println(list);
                System.out.println("güncellemek istediğiniz sayıyı girin:");
                int guncellenecekIndex = list.indexOf(input.nextInt());
                System.out.println("yeni sayıyı girin:");
                list.set(guncellenecekIndex, input.nextInt());
                System.out.println(list);
            } else if (komut.equalsIgnoreCase("remove")) {
                System.out.println("silmek istediğiniz sayıyı girin:");
                Integer silinecekSayi = input.nextInt();
                list.remove(silinecekSayi);
                System.out.println(list);
            } else if (komut.equalsIgnoreCase("break")) {
                break;
            } else {
                System.out.println("geçerli bir komut girin.");
            }
        }
    }
}