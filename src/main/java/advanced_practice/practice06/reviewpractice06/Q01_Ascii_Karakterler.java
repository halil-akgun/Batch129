package advanced_practice.practice06.reviewpractice06;

import java.util.Scanner;

/*
//Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
 */
public class Q01_Ascii_Karakterler {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("iki karakter girin:");
        char a = inp.next().charAt(0);
        char b = inp.next().charAt(0);
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i);
            }
        } else {
            for (int i = a - 1; i > b; i--) {
                System.out.print((char) i);
            }
        }

    }
}
