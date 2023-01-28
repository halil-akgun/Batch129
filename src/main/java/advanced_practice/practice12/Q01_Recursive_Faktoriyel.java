package advanced_practice.practice12;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {
        try {
            System.out.println(faktoryel(-4));
        } catch (ArithmeticException e) {
            System.out.println("sayı sıfırdan küçük olamaz---");
        }
    }

    public static int faktoryel(int num) {

        if (num >= 0) {
            if (num == 0 || num == 1) return 1;
            return num * faktoryel(num - 1);
        } else {
            throw new ArithmeticException("sayı sıfırdan küçük olamaz");
        }


    }
}
