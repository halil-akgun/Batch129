package advanced_practice.practice06.reviewpractice06;

import java.util.Scanner;

//Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.
public class Q02_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String strReverse = "";
        for (int i = str.length() - 1; i > -1; i--) {
            strReverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(strReverse)) {
            System.out.println(str + " palindrome'dur");
        } else {
            System.out.println(str + " palindrome değildir");
        }

        // StringBuilder
        StringBuilder stb = new StringBuilder(str);
        stb.reverse();
        if (str.equalsIgnoreCase(stb.toString())) {
            System.out.println(str + " palindrome'dur");
        } else {
            System.out.println(str + " palindrome değildir");
        }
    }
}
