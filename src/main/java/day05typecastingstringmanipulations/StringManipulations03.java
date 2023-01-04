package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {
        /*
        Example 1: Aşağıdaki kurallara göre kullanıcının girdiği password ü kontrol ediniz
            1) En az 8 karakter olsun
            2) Space karakteri password de olmasın
            3) En az bir tane büyük harf olsun
            4) En az bir tane küçük harf olsun
            5) En az bir tane sembol olsun
            6) En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.print("parola giriniz: ");
        String pwd = input.nextLine();

        // En az 8 karakter olsun
        boolean firstRule = pwd.length() > 7;
        System.out.println(firstRule);

        // Space karakteri password de olmasın
        boolean secondRule = !pwd.contains(" ");
        System.out.println(secondRule);

        // En az bir tane büyük harf olsun
        boolean thirdRule = pwd.replaceAll("[^A-Z]", "").length() > 0; // method chain
        System.out.println(thirdRule);

        // En az bir tane küçük harf olsun
        boolean fourthRule = pwd.replaceAll("[^a-z]", "").length() > 0; // method chain
        System.out.println(fourthRule);

        // En az bir tane sembol olsun
        boolean fiftthRule = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0; // method chain
        System.out.println(fiftthRule);

        // En az bir tane rakam olsun
        boolean sixtthRule = pwd.replaceAll("[^0-9]", "").length() > 0; // method chain
        System.out.println(sixtthRule);

        System.out.println("password geçerli mi: " + (firstRule && secondRule && thirdRule && fiftthRule && sixtthRule));
    }
}
