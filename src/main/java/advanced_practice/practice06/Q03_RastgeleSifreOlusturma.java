package advanced_practice.practice06;

import java.util.Random;
import java.util.Scanner;

//Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
public class Q03_RastgeleSifreOlusturma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("karakter sayısını girin: ");
        int karakterSayisi = inp.nextInt();
        int counter = 0;
        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789/*-+.,-*=)(/&%^'!#${[]}:;<>|€₺@";
        int idx = karakterler.length();
        String password = "";

        while (counter < karakterSayisi) {
            int randomIndex = (int) (Math.random() * idx);
            password += karakterler.charAt(randomIndex);
            counter++;
        }

        System.out.println("password = " + password);

    }
}
