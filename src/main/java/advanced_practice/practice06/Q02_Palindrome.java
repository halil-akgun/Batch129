package advanced_practice.practice06;

import java.util.Scanner;
import java.util.StringJoiner;

//Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.
public class Q02_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("bir string girin:");
//        String str = scan.nextLine().replaceAll(" ", "").toLowerCase();
//        String strReverse = "";
//        for (int i = str.length()-1; i > -1; i--) {
//            strReverse += str.charAt(i);
//        }
//        String result = (str.equals(strReverse)) ? "palindrome" : "not palindrome";
//        System.out.println("result = " + result);

        System.out.println("bir string girin:");
        String str2 = scan.nextLine().replaceAll(" ", "").toLowerCase();

        StringBuilder stb = new StringBuilder(str2);
        System.out.println("stb = " + stb);
        stb.reverse();
        System.out.println("str2 = " + str2);
        System.out.println("stb = " + stb);
        if (str2.equals(String.valueOf(stb))) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }


    }
}
