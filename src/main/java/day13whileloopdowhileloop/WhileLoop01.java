package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        // kullanıcının verdiği sayı için çarpım tablosunu oluşturup consola yazdıran kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.print("çarpım tablosunu görmek için bir sayı girin: ");
        int num = input.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }

        // verilen bir stringte her harfin sonuna * ekle
        System.out.print("bir kelime girin: ");
        String word = input.next();
        String newWord = "";

        int k = 0;
        while (k < word.length()) {
            newWord += word.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);
    }
}
