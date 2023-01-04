package advanced_practice.practice04.reviewpractice04;

import java.util.Scanner;

public class Q04_Foreach_Sifreleme {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile değiştirerek
        şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız. (foreach loop kullanınız)
        */
        System.out.println("sifreleme() = " + sifreleme());
        System.out.println("sifreCoz() = " + sifreCoz());

    }

    public static String sifreleme() {
        Scanner inp = new Scanner(System.in);
        System.out.print("şifrelenecek string: ");
        String arr[] = inp.nextLine().split("");
        String sifreliString = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("z")) {
                sifreliString += "a";
            } else if (arr[i].equals("Z")) {
                sifreliString += "A";
            } else {
                sifreliString += (char) (arr[i].charAt(0) + 1);
            }
        }
        return sifreliString;
    }

    public static String sifreCoz() {
        Scanner inp = new Scanner(System.in);
        System.out.print("şifresi çözülecek string: ");
        String arr[] = inp.nextLine().split("");
        String sifresiCozulmusString = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a")) {
                sifresiCozulmusString += "z";
            } else if (arr[i].equals("A")) {
                sifresiCozulmusString += "Z";
            } else {
                sifresiCozulmusString += (char) (arr[i].charAt(0) - 1);
            }
        }
        return sifresiCozulmusString;
    }
}
