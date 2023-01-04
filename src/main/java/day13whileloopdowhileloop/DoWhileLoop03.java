package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

//        kullanıcıdan username ve password alın
//        username ve password doğru ise hoşgeldiniz yazdırın
//        3 ten fazla yanlış girilirse hesap bloke olsun
//        username: admin   password: pwd123

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do {
            if (counter == 3) {
                System.out.println("hesabınız bloke olmuştur.");
                break;
            }
            System.out.print("username: ");
            String userName = input.next();
            System.out.print("password: ");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("hoşgeldiniz");
                break;
            }
            counter++;
        } while (true);

    }
}
