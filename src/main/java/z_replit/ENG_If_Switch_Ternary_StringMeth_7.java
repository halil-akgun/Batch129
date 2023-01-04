package z_replit;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_7 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String name1 = inp.next();
        String name2 = inp.next();
        if (name1.length() % 2 == 0) {
            name2 += name1.substring(name1.length() / 2);
            name1 = name1.substring(0, name1.length() / 2);
            name1 += name2;
            System.out.println(name1);
        } else {
            System.out.println("Name2 cannot be inserted in the name1");
        }

    }
}
