package advanced_practice.practice08;

import java.util.Scanner;

public class Q01_NestedLoop_AtbashCode {
    /*
     Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
     Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
     Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
     Örn: A-->Z, B-->Y ...
     "abcdefghijklmnopqrstuvwxyz";
     "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir kelime girin: ");
        String word = input.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (word.charAt(i) == alphabet.charAt(j)) {
                    System.out.print(alphabet.charAt(alphabet.length() - 1 - j));
                }
            }
        }
        System.out.println("\n   === 2: Yol ===");
        for (int i = 0; i < word.length(); i++) {
            int idx = 'z' - word.charAt(i);
            System.out.print((char) ('a' + idx));
        }
    }
}
