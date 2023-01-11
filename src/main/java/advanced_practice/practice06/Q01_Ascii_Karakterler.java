package advanced_practice.practice06;

import java.util.Scanner;

/*
//Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
 */
public class Q01_Ascii_Karakterler {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        char a = inp.next().charAt(0);
        char b = inp.next().charAt(0);
        int ilk = Math.min(a, b);
        int son = Math.max(a, b);
        for (int i = ilk + 1; i < son; i++) {
            System.out.print((char) i);
        }
    }
}
