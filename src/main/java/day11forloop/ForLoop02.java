package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {

        // verilen bir stringte a karakteri hariç tüm karakterleri yazdırın
        String s = "Madagaskar";
        // 1. yol
        System.out.println(s.replace("a", ""));

        // 2. yol
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a') {
                System.out.print(ch);
            }
        }

        System.out.println();

        // 2. yol
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                continue;
            }
            System.out.print(ch);
        }

    }
}
