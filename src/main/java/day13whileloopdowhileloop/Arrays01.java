package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        String names[] = new String[5];

        System.out.println(names); // heap'teki adresini yazdırır (gereksiz)
        System.out.println(Arrays.toString(names));

        names[2] = "Ajda";
        System.out.println(Arrays.toString(names));
        names[0] = "Cüneyt";
        names[1] = "Kemal";
        names[3] = "Ezel";
        names[4] = "Beşir";
        System.out.println(Arrays.toString(names));

        System.out.println(names[2]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "!");
        }
    }
}
