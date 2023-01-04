package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 1) {
            System.out.println("while loop");
            i++;
        }

        int k = 11;
        do {
            System.out.println("do while");
            k++;
        } while (k < 1);
        System.out.println(k); // 12
    }
}
