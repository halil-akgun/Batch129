package advanced_practice.practice09;

import java.util.Scanner;

public class Q03_ForLoop_RakamlariTopla {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(rakamlariTopla(scan.nextLine()));
    }

    static double rakamlariTopla(String str) {
        double sum = 0;
        for (int i = 0; i < str.length(); i++)  if (Character.isDigit(str.charAt(i))) sum += Double.parseDouble(String.valueOf(str.charAt(i)));
        return sum;
    }
}
