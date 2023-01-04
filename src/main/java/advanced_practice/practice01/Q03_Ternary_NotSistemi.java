package advanced_practice.practice01;

import java.util.Scanner;

public class Q03_Ternary_NotSistemi {
    public static void main(String[] args) {

        /*
   Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
   (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Not: ");
        int not = input.nextInt();
        String letterOfNotes =
                (not > 100) || ((not < 0)) ?
                        "Please give a valid number between 0 - 100 " : not > 89 ?
                        "A" : not > 79 ?
                        "B" : not > 69 ?
                        "C" : not > 59 ?
                        "D" : not > 49 ?
                        "E" : "F";

        System.out.println(letterOfNotes);

    }
}
