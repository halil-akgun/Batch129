package preClass;

import java.util.Scanner;

public class P08_Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        for (int i = 1; i < 11; i++) {
            System.out.print("Java Güzeldir. ");
        }

        System.out.println("\n********************");

        for (int i = 10; i <= 30; i++) {
            System.out.print(i + ",");
        }

        System.out.println("\n********************");

        for (int i = 100; i >= 50; i--) {
            System.out.print(i + ",");
        }

        System.out.println("\n********************");

        System.out.print("1-100 arası bir tamsayı girin: ");
        int num1 = input.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n********************");

        System.out.print("1-100 arası bir tamsayı girin: ");
        int num2 = input.nextInt();
        for (int i = 1; i <= num2; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n********************");

        System.out.print("1-100 arası bir tamsayı girin: ");
        int num3 = input.nextInt();
        for (int i = 1; i <= num3; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + "-JavaGüzeldir ");
            } else if (i % 3 == 0) {
                System.out.print(i + "-Java ");
            } else if (i % 5 == 0) {
                System.out.print(i + "-Güzeldir ");
            }
        }

        System.out.println("\n********************");

        System.out.println("bir string girin: ");
        input.nextLine();
        String a = input.nextLine();
        String aReverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            aReverse += a.charAt(i);
        }
        System.out.println(aReverse);

        System.out.println("\n********************");

        System.out.println("method çıktı --> " + reverseString(a));
        */
        /*
        System.out.print("bir string girin: ");
        String b = input.nextLine();
        String reverseB = "";

        for (int i = b.length() - 1; i >= 0; i--) {
            reverseB += b.charAt(i);
        }
        if (b.equals(reverseB)) {
            System.out.println(b + " --> palindrome");
        } else {
            System.out.println(b + " --> palindrome değil");
        }

        System.out.println("iki sayı girin:");
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int total = 0;

        if (num4 < num5) {
            for (int i = num4; i <= num5; i++) {
                total += i;
            }
        } else {
            for (int i = num5; i <= num4; i++) {
                total += i;
            }
        }
        System.out.println("total: " + total);
        */

//        System.out.print("ondan küçük pozitif bir tamsayı girin: ");
//        int num6 = input.nextInt();
//        int factorial = 1;  // DİKKAT!! 0 yapma
//
//        if (num6 < 10 && num6 > 0) {
//            for (int i = 1; i <= num6; i++) {
//                factorial *= i;
//            }
//        } else {
//            System.out.println("ondan küçük pozitif bir tamsayı girin!");
//        }
//        System.out.println("factorial of " + num6 + " --> " + factorial);

//        System.out.print("bir sayı girin: ");
//        int num7 = input.nextInt();
//
//        for (int i = 1; i <= num7; i++) {
//            for (int k = i; k > 0; k--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        System.out.print("bir sayı girin: ");
//        int num9 = input.nextInt();
//
//        for (int i = 1; i <= num9; i++) {
//            for (int k = 1; k <= num9; k++) {
//                System.out.printf("%02d ",(i*k));
//            }
//            System.out.println();
//        }


//        int num10 = 3;
//
//        while (num10 <= 13) {
//            if (num10 % 2 == 1) {
//                System.out.print(num10 + " ");
//            }
//            num10++;
//        }


//        for (int i = 100; i < 1000; i++) {
//            if (i % 15 == 0 & i % 25 == 0 & i % 90 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//
//        int num11=100;
//        while (num11<1000){
//            if (num11 % 15 == 0 & num11 % 25 == 0 & num11 % 90 == 0) {
//                System.out.print(num11 + " ");
//            }
//            num11++;
//        }

//        System.out.println("iki sayı girin:");
//        int num12 = input.nextInt();
//        int num13 = input.nextInt();
//        if (num12 < num13) {
//            int num12x = num12;
//            while (num12x <= num13) {
//                if (num12x % 2 == 0) {
//                    System.out.print(num12x + " ");
//                }
//                num12x++;
//            }
//        } else {
//            int num12x = num12;
//            while (num12x >= num13) {
//                if (num12x % 2 == 0) {
//                    System.out.print(num12x + " ");
//                }
//                num12x--;
//            }
//        }

//        System.out.println("iki adet char girin:");
//        String a = input.next();
//        String b = input.next();
//
//        if (a.length() > 1 | b.length() > 1) {
//            System.out.println("her seferinde tek bir harf girin");
//        } else {
//            char charA = a.charAt(0);
//            char charB = b.charAt(0);
//            if (charA<charB) {
//                while (charA <= charB) {
//                    String output = "";
//                    output += charA;
//                    System.out.print(output.toUpperCase() + " ");
//                    charA++;
//                }
//            }else {
//                while (charA >= charB) {
//                    String output = "";
//                    output += charA;
//                    System.out.print(output.toUpperCase() + " ");
//                    charA--;
//                }
//            }
//
//        }

//        System.out.print("bir sayı girin: ");
//        int num8 = input.nextInt();
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(num8 + " X " + i + " = " + (num8 * i));
//        }


//        System.out.print("bir sayı girin: ");
//        int num14 = input.nextInt();
//        int counter = 0;
//
//        System.out.println(num14 + " sayısını tam bölen sayılar:");
//        for (int i = 1; i <= num14; i++) {
//            if (num14 % i == 0) {
//                System.out.print(i + ", ");
//                counter++;
//            }
//        }
//        System.out.println();
//        System.out.println(num14 + " sayısını tam bölen " + counter + " adet sayı vardır.");


//        System.out.print("bir sayı girin: ");
//        int num15 = input.nextInt();
//        int total2 = 0;
//
//        for (int i = num15; i > 0; i /= 10) {
//            total2 += i % 10;
//        }
//        System.out.println(num15 + " sayısının rakamları toplamı: " + total2);


//        int num16 = 9;
//        do {
//            if (num16 % 7 == 0) {
//                System.out.print(num16 + ", ");
//            }
//            num16++;
//        } while (num16 < 191);


//        char m = 'm';
//        do {
//            System.out.print(m + ", ");
//            m--;
//        } while (m >= 'c');


//        int num17, total3 = 0, counter2 = -1; // son girilen 0 dahil olduğu için counter -1'den başlamalı
//        System.out.println("toplamak istediğiniz sayıları teker teker girin, sonucu görmek için 0 girin.");
//        do {
//            num17 = input.nextInt();
//            total3 += num17;
//            counter2++;
//        } while (num17 != 0);
//        System.out.println("girdiğiniz " + counter2 + " adet sayının toplamı: " + total3);


//        int num18, total4 = 0, counterPositive = -1, counterNegative = 0; // son girilen 0 dahil olduğu için counter -1'den başlamalı
//        System.out.println("toplamak istediğiniz pozitif sayıları teker teker girin, sonucu görmek için 0 girin.");
//        do {
//            num18 = input.nextInt();
//            if (num18 < 0) {
//                System.out.println("Negatif sayı giremezsiniz.");
//                counterNegative++;
//            } else {
//                total4 += num18;
//                counterPositive++;
//            }
//        } while (num18 != 0);
//        System.out.println(counterNegative + " adet negatif sayı girdiniz, bu sayılar işleme alınmadı.");
//        System.out.println("girdiğiniz " + counterPositive + " adet pozitif sayının toplamı: " + total4);


        //şifre oluşturma
//        String password = "";
//        boolean includeLowerCase;
//        boolean includeUpperCase;
//        boolean includeSymbol;
//        boolean is8character;
//
//        do {
//            System.out.print("bir şifre girin: ");
//            password = input.nextLine();
//
//            includeLowerCase = password.replaceAll("[^a-zşöçüğı]", "").length() > 0;
//            includeUpperCase = password.replaceAll("[^A-ZÖÇÜĞŞİ]", "").length() > 0;
//            includeSymbol = password.replaceAll("[A-Za-z0-9şöçüğıÖÇÜĞŞİ]", "").length() > 0;
//            is8character = password.length() > 7;
//
//            if (!includeLowerCase) {
//                System.out.println("şifreniz en az 1 küçük harf içermelidir.");
//            }
//            if (!includeUpperCase) {
//                System.out.println("şifreniz en az 1 büyük harf içermelidir.");
//            }
//            if (!includeSymbol) {
//                System.out.println("şifreniz en az 1 özel karakter içermelidir.");
//            }
//            if (!is8character) {
//                System.out.println("şifreniz en az 8 karakterden oluşmalıdır.");
//            }
//        } while (!(includeLowerCase & includeUpperCase & includeSymbol & is8character));
//        System.out.println("şifreniz kabul edilmiştir.");


        int num19, total4 = 0, counter3 = 0; // son girilen 0 dahil olduğu için counter -1'den başlamalı
        System.out.println("toplamak istediğiniz sayıları teker teker girin, toplam 500e ulaştığında toplama bitecek.");
        do {
            num19 = input.nextInt();
            total4 += num19;
            counter3++;
        } while (total4 < 500);
        System.out.println("girdiğiniz " + counter3 + " adet sayının toplamı: " + total4);


    }

    public static String reverseString(String e) {
        String reverseE = "";
        for (int i = e.length() - 1; i >= 0; i--) {
            reverseE += e.charAt(i);
        }
        return reverseE;
    }
}
