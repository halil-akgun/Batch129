package advanced_practice.practice06.reviewpractice06;

import java.util.Scanner;

//Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
public class Q03_RastgeleSifreOlusturma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("karakter sayısını girin: ");
        int a = inp.nextInt();
        String password = "";

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789/*-+.,-*=)(/&%^'!#${[]}:;<>|€₺@";

        for (int i = 0; i < a; i++) {
            int randomIdx = (int) (Math.random() * karakterler.length());
            password += karakterler.charAt(randomIdx);
        }
        System.out.println("password = " + password);
    }
}
