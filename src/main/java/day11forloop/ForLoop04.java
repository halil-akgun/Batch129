package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        // 5den 8e kadar tamsayıların toplamını veren kod
        int sum = 0;
        for (int i = 5; i < 9; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 7den 9a kadar tamsayıların çarpımını veren kod
        int multiply = 1;
        for (int i = 7; i < 10; i++) {
            multiply *= i;
        }
        System.out.println(multiply);

    }
}
